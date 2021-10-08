package com.abycuela.magica.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
@Data
@Document(collection = "Usuario")
public class UsuarioDTO {
	@Id
	private String claveUsuario;

	private String nombre;
	
	private String apellidoPaterno;

	private String apellidoMaterno;
	

}
