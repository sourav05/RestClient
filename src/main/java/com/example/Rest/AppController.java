package com.example.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Rest.client.TemplateTest;

@RestController
public class AppController {

	@Autowired
	private TemplateTest templateTest;
	@Autowired
    private DiscoveryClient discoveryClient;
	
	@GetMapping("/")
	public String getMethod(){
		System.out.println("Call reached here");
		String s = templateTest.call();
		System.out.println("Call didn't miss that point");
		return s;
	}
	@RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        return this.discoveryClient.getInstances(applicationName);
    }
}
