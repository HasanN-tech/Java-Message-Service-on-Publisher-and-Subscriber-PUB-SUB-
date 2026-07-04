package com.hasan.subscriber;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MsgSubscriber {
	
	@JmsListener(destination = "pub_sub")
	public void sendReceiver(String str) {
		IO.println("Message received: "+str);
	}
	
}
