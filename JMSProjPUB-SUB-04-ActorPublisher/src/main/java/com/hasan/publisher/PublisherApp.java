package com.hasan.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.hasan.entity.Actor;

@Service
public class PublisherApp {
	@Autowired
	private JmsTemplate temp;
	
	public String sendMsg(Actor a) {
		temp.convertAndSend("actor",a);
		return "Message sent suucessfully.";
	}
}
