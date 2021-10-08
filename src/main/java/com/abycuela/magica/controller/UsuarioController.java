package com.abycuela.magica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.abycuela.magica.dto.UsuarioDTO;
import com.abycuela.magica.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Slf4j
@RestController
public class UsuarioController {
	@Autowired UsuarioService usuarioService;

	@GetMapping("/obtener/usuarios")
	public Flux<UsuarioDTO> getUser(){
		log.info("Inicia contreller Reativo");
		return usuarioService.getuser();
		
	}
	

}
