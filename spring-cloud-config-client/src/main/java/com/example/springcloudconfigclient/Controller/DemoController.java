package com.example.springcloudconfigclient.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/movie")
@RefreshScope
public class DemoController {
	
	@Value("${movie.name}")
	private String movieName;

	@GetMapping("/name")
	public String getmovieName() {
		return movieName;
	}
}
