package com.example.Rest;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

public class TestTO {

	private String name;
	private String location;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
