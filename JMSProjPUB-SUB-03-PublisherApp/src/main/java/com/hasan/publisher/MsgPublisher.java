package com.hasan.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MsgPublisher {
	
	@Autowired
	private JmsTemplate temp;
	
	public void sendMsg(String str) {
		temp.convertAndSend("pub_sub",str);
		IO.println("Message sent successfully.");
	}
	
}
