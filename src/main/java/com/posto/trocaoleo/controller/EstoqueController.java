package com.posto.trocaoleo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("estoque")
public class EstoqueController {
	
	@GetMapping
	public String estoqueprodutos() {
		return"trocaoleo/estoque/";
	}
	
	

}
