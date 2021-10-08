package com.abycuela.magica.service;

import java.time.Duration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abycuela.magica.dao.UsuarioDao;
import com.abycuela.magica.dto.UsuarioDTO;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Slf4j
@Service
public class UsuarioService {
	private static final int DELAY_PER_ITEM_MS = 100;

	@Autowired UsuarioDao uDao;
	
	public Flux<UsuarioDTO> getuser() {
		log.info("Inicia service");
		Flux<UsuarioDTO> usuario= uDao.getAllUser().delayElements(Duration.ofMillis(DELAY_PER_ITEM_MS));
		return usuario;
	}
}
