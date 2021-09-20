package com.google.ce.avrotest;



// [START pubsub_publish_avro_records]

import com.google.api.core.ApiFuture;
import com.google.cloud.pubsub.v1.Publisher;
import com.google.cloud.pubsub.v1.TopicAdminClient;
import com.google.protobuf.ByteString;
import com.google.pubsub.v1.Encoding;
import com.google.pubsub.v1.PubsubMessage;
import com.google.pubsub.v1.TopicName;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;


public class AvroPublish {

  public static void main(String... args) throws Exception {
	  
    String projectId = "google.com:hicoder-playground";
    
    String topicId = "avro-test-schema-json";
    

    publishAvroRecordsExample(projectId, topicId);
  }

  public static void publishAvroRecordsExample(String projectId, String topicId)
      throws IOException, ExecutionException, InterruptedException {

    Encoding encoding = null;

    TopicName topicName = TopicName.of(projectId, topicId);

    try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
      encoding = topicAdminClient.getTopic(topicName).getSchemaSettings().getEncoding();
    }
    
    encoding = Encoding.JSON;

    State state = State.newBuilder().setName("Alaska").setPostAbbr("AK").build();

    Publisher publisher = null;

    block:
    try {
      publisher = Publisher.newBuilder(topicName).build();

      ByteArrayOutputStream byteStream = new ByteArrayOutputStream();

      Encoder encoder = null;

      switch (encoding) {
        case BINARY:
          System.out.println("Preparing a BINARY encoder...");
          encoder = EncoderFactory.get().directBinaryEncoder(byteStream, /*reuse=*/ null);
          break;

        case JSON:
          System.out.println("Preparing a JSON encoder...");
          encoder = EncoderFactory.get().jsonEncoder(State.getClassSchema(), byteStream);
          break;

        default:
          break block;
      }

      // Encode the object and write it to the output stream.
      state.customEncode(encoder);
      encoder.flush();

      // Publish the encoded object as a Pub/Sub message.
      ByteString data = ByteString.copyFrom(byteStream.toByteArray());
      PubsubMessage message = PubsubMessage.newBuilder().setData(data).build();
      System.out.println("Publishing message: " + message);

      ApiFuture<String> future = publisher.publish(message);
      System.out.println("Published message ID: " + future.get());

    } finally {
      if (publisher != null) {
        publisher.shutdown();
        publisher.awaitTermination(1, TimeUnit.MINUTES);
      }
    }
  }
}