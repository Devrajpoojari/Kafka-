package com.endUser.Kafka_Consumer.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
	
	public static final Logger log=LoggerFactory.getLogger(KafkaConfig.class);

	@KafkaListener(topics = AppConstant.Location_Update_Topic, groupId = AppConstant.Group_ID)
	public void updatedLocation(String value) {
		log.info(value);

	}

}
