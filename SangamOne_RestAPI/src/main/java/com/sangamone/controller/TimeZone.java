package com.sangamone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeZone {
	@GetMapping("/time/India")
	public String timeZone1() {
		String time1="07:30 PM";
		return time1;
	}
	
	@GetMapping("/time/Dubai")
	public String timeZone2() {
		String time2="06:00 PM";
		return time2;
	}

}
