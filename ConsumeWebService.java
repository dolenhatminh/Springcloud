package com.dlnminh.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("")
public class ConsumeWebService {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value = "")
	public ModelAndView getProductList(@PathVariable String from, @PathVariable String to) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		return new ModelAndView("show_contact", "contact_view", restTemplate.exchange("", HttpMethod.GET, entity, student.class).getBody());
	}
}
