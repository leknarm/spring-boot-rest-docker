package com.leknarm.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HostnameController {

	@RequestMapping("/hostname")
	public Map<String, String> getHostname() throws UnknownHostException {
		Map<String, String> hostname = new HashMap<>();
		hostname.put("hostname", InetAddress.getLocalHost().getHostName());
		return hostname;
	}
	
}
