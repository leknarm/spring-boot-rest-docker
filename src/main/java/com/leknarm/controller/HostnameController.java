package com.leknarm.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HostnameController {

	@RequestMapping("/hostname")
	public Map<String, String> getHostname() throws IOException {
		Map<String, String> hostname = new HashMap<>();
		List<String> names = Files.readAllLines(Paths.get("/etc/hostname"), StandardCharsets.UTF_8);
		hostname.put("hostname", names.stream().collect(Collectors.joining()));
		return hostname;
	}
	
}
