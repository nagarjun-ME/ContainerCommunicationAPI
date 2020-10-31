package com.naga.docker.mpc.ContainerCommunicationAPI;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RPCRestService {
	
	
	private Logger log=LoggerFactory.getLogger(RPCRestService.class);

	@GetMapping("/")
	public String getResponse() {
		log.info("inside get response method");
		return "success";
	}
	
	@GetMapping("/msg")
	public String getMessage(@RequestParam(value="name") String name ) {
		log.info("inside get message method -"+name);
		return "Hi!! How are You?"+name;
	}
	

	@PostMapping("/dt")
	public String setDate(String date) {
		log.info("inside get date method");
		String str= "<h1>Date is :"+new Date().toString()+"</h1>";
		return str;
	}
	
}
