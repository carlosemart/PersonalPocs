package com.example.springBootPoc;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ThisWillActuallyRun {
	
	@RequestMapping
	public String  home(){
		return "Hello world!";
	}

}
