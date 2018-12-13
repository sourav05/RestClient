package com.example.Rest.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TemplateTest {

	public String call(){
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> response = template.getForEntity("http://localhost:8080/done", String.class);
//		System.out.println(response.getBody());
		return response.getBody();
	}

}
