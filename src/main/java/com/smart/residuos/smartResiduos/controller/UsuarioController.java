package com.smart.residuos.smartResiduos.controller;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.smart.residuos.smartResiduos.model.UsuarioModel;
import com.smart.residuos.smartResiduos.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping(value = "/salvar", method = RequestMethod.GET)
	public String form() {
		return usuarioService.form();
	}

	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public UsuarioModel salvar(@RequestBody UsuarioModel usuModel) {

		return usuarioService.salvar(usuModel);

	}

	@GetMapping("/{id}")
	public Optional<UsuarioModel> buscarPorId(@PathVariable(name = "id") BigInteger id) {

		return usuarioService.buscarPorId(id);

	}

	@GetMapping("/listar")
	public List<UsuarioModel> listar() {

		return usuarioService.listar();

	}

}
