package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SecondController {
	@RequestMapping("/hello")
	public String Hi()
	{
		return "Second";
	}

}
