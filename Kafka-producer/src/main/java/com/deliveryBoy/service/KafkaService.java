package com.deliveryBoy.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.deliveryBoy.config.AppConstants;

import ch.qos.logback.classic.Logger;

@Service
public class KafkaService {

// used to produce the message -> 
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public final static org.slf4j.Logger log = LoggerFactory.getLogger(KafkaService.class);

	public boolean updateLocation(String location) {

		kafkaTemplate.send(AppConstants.Location_Topic_Name, location); // 1st topic and then data
		log.info("Message Produced", location);
		return true;
	}
}
