package com.deliveryBoy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.deliveryBoy.service.KafkaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class LocationController {

	@Autowired
	private KafkaService kafkaService;

	@GetMapping("/update")
	public ResponseEntity<?> updateLocation() {

		this.kafkaService
				.updateLocation("( " + Math.round(Math.random() * 100) + " , " + Math.round(Math.random() * 100)+" )");
		return ResponseEntity.ok(Map.of("Message", "Updated"));

	}

}
