package com.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("store-management-app")
public class SmaController {
	
	@GetMapping("home")
	public String getHomeView() {
		return "/home/index.html";
	}
}
