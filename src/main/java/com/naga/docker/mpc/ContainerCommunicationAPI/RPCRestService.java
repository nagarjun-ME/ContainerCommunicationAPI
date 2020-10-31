package com.naga.docker.mpc.ContainerCommunicationAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/to")
public class RPCRestService {
	
	
	private Logger log=LoggerFactory.getLogger(RPCRestService.class);

	@GetMapping
	public String getResponse() {
		log.info("inside get response method");
		return "success";
	}
}
