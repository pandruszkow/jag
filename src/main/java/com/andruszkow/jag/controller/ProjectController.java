package com.andruszkow.jag.controller;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Log
@Controller
public class ProjectController {
	@GetMapping(value = "/projects/{shortName}")
	public @ResponseBody String get(@PathVariable String shortName){
		log.info("foo");
		return shortName;
	}
}
