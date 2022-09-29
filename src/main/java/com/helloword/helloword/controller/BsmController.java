package com.helloword.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BsmGeneration")
public class BsmController{

@GetMapping
	public String bsmgeneration() {
		return "bsmgeneration  <li> Orientação ao Futuro <li> Reponsabilidade Pessoal  <li>\n"
				+ "Mentalidade de Crescimento<li>Persistência <li> Comunicação <li>"
				+ "Orientação ao Detalhe  <li> Proatividade <li> Trabalho em Equipe";
				
	}

}


