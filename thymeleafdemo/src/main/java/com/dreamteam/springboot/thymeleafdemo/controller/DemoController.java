package com.dreamteam.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	// create mapping for "/hi"
	@GetMapping("/hi")
	public String sayGoodMorning(Model theModel) {
		theModel.addAttribute("theDate", new java.util.Date());
		return "hi";
	}
}
