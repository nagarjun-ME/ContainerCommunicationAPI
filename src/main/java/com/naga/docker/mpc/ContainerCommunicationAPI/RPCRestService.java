package com.naga.docker.mpc.ContainerCommunicationAPI;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/to")
public class RPCRestService {
	
	
	private Logger log=LoggerFactory.getLogger(RPCRestService.class);

	@GetMapping
	public String getResponse() {
		log.info("inside get response method");
		return "success";
	}
	
	@GetMapping("/msg")
	public String getMessage() {
		log.info("inside get message method");
		return "Hi!! How are You?";
	}
	
	@PostMapping("/dt")
	public String setDate(String date) {
		log.info("inside get date method");
		String str= "<h1>Date is :"+new Date().toString()+"</h1>";
		return str;
	}
}
