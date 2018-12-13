package com.example.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Rest.client.TemplateTest;

@RestController
public class AppController {

	@Autowired
	private TemplateTest templateTest;
	
	@GetMapping("/")
	public String getMethod(){
		System.out.println("Call reached here");
		String s = templateTest.call();
		System.out.println("Call didn't miss that point");
		return s;
	}
}
