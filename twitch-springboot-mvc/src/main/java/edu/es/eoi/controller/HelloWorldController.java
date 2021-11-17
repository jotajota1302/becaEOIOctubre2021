package edu.es.eoi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

//	@RequestMapping(method = RequestMethod.GET)
//	public String goToHome() {
//		
//		return "index.html";
//		
//	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String goToHome() {
		
		return "index.html";
		
	}
	
}
