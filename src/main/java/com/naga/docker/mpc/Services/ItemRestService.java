package com.naga.docker.mpc.Services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naga.docker.mpc.Model.Item;

@RestController
@RequestMapping("/item")
public class ItemRestService {
	
	private Logger log=LoggerFactory.getLogger(getClass());
	
	@RequestMapping("/{itemId}")
	public List<Item> getItem (@PathVariable("itemId") int Id) {
		
		log.info("Inside get Item");
		List <Item> lt=new ArrayList<Item>();
		lt.add(new Item( Id, "Spring Boot", 10.22)); 
		lt.add(new Item( Id, "Java", 15.02)); 
		
		log.info("List Items are :"+lt);
		
		return lt;
			
		}

}
