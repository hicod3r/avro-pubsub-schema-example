package com.google.ce.avrotest;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import com.google.cloud.pubsub.v1.AckReplyConsumer;
import com.google.cloud.pubsub.v1.MessageReceiver;
import com.google.cloud.pubsub.v1.Subscriber;
import com.google.pubsub.v1.ProjectSubscriptionName;
import com.google.pubsub.v1.PubsubMessage;



public class AvroReadFromTopic {
	
	public static void main(String args[]) {
		
		
	    String projectId = "google.com:hicoder-playground";
	    
	    String subscriptionId = "avro-test-schema-json-sub"; //For JSON
	    
//	    String subscriptionId = "avro-test-schema"; // For Binary
	    

	    subscribeWithAvroSchemaExample(projectId, subscriptionId);
		
	}
	
	
	public static void subscribeWithAvroSchemaExample(String projectId, String subscriptionId) {

	    
	    String subscriptionString = "projects/" + projectId + "/subscriptions/" + subscriptionId; 
		
		ProjectSubscriptionName subscriptionName =  
    		ProjectSubscriptionName.parse(subscriptionString);


	    MessageReceiver receiver =
	        (PubsubMessage message, AckReplyConsumer consumer) -> {
	          
	        	System.out.println(message);

	          consumer.ack();
	        };

	    Subscriber subscriber = null;
	    
	    try {
	      subscriber = Subscriber.newBuilder(subscriptionName, receiver).build();
	      subscriber.startAsync().awaitRunning();
	      System.out.printf("Listening for messages on %s:\n", subscriptionName.toString());
	      subscriber.awaitTerminated(30, TimeUnit.SECONDS);
	    } catch (TimeoutException timeoutException) {
	      subscriber.stopAsync();
	    }
	}
	

}
