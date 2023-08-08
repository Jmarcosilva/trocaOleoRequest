package com.posto.trocaoleo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trocaoleo")
public class TrocaOleoController {
	
	@GetMapping
	public String listarMenu() {
		return "trocaoleo/menu";
	}
	

}
