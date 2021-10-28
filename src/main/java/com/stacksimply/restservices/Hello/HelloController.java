package com.stacksimply.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloController {
	//Simple Method
	//URI - /helloworld
	//GET -  @REquestmapping & @getmapping
	
	//@RequestMapping(method = RequestMethod.GET,path = "/helloworld")
	@GetMapping("/helloworld")
	public String helloWorld() {
		return"Hello World";
	}
	
	@GetMapping("/hellobean")
	public UserDetails helloworldBean() {
		return new UserDetails("Monish", "Poojari", "Mumbai");
	}

}
