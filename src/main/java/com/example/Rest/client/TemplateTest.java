package com.example.Rest.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TemplateTest {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	public String call(){
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> response = template.getForEntity(this.discoveryClient.getInstances("api").get(0).getUri(), String.class);
		this.discoveryClient.getInstances("api").get(0).getUri();
//		System.out.println(response.getBody());
		return response.getBody();
	}

}
