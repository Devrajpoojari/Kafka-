package com.deliveryBoy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

	@Bean
	public NewTopic getNewTopic() {

		return TopicBuilder.name(AppConstants.Location_Topic_Name)
//				.partitions(0).
//				replicas(0)
				.build();
	}
}
