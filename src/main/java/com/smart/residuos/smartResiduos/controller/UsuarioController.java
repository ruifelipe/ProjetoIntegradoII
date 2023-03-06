package com.smart.residuos.smartResiduos.controller;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.residuos.smartResiduos.model.UsuarioModel;
import com.smart.residuos.smartResiduos.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/salvar")
	public UsuarioModel salvar(@RequestBody UsuarioModel model) {
		
		usuarioService.salvar(model);
		
		return model;
	}
	
	@GetMapping("/{id}")
	public Optional<UsuarioModel> buscarPorId(@PathVariable(name = "id") BigInteger id){
		
		return usuarioService.buscarPorId(id);
	}

}
