package com.helloword.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/Aprendizagem")
public class ObjetivosAprendizagemController {
@GetMapping
	public String  aprendizagem () {
		return "Aprendizagem <br> <li> Obter conhecimento da Ferramenta <br><li> "
				+ "Ter Dominio nas Ferramentas utilizadas<br><li> Ajudar meu grupo no projeto integrador";
	}
          
}
