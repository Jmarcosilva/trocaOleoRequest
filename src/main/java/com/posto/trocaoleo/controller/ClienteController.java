package com.posto.trocaoleo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.posto.trocaoleo.model.DadosCadastroCliente;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@GetMapping
	public String abreFormulario() {
		return"forms/cliente";
	}
	
	@PostMapping
	public String cadastroCliente(DadosCadastroCliente dados) {
		
		System.out.println(dados);
		
		return"forms/cliente";
	}

}
