package com.smart.residuos.smartResiduos.controller;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.smart.residuos.smartResiduos.model.UsuarioModel;
import com.smart.residuos.smartResiduos.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/salvar")
	public ModelAndView form() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("usuarios/Cadastrar-Usuario");
		
		return mv;
		
	}

	@PostMapping(path="salvar")
	public ModelAndView salvar(UsuarioModel usuModel) {

		ModelAndView mv = new ModelAndView();
		usuarioService.salvar(usuModel);
		mv.setViewName("usuarios/Cadastrar-Usuario");
		
		return mv;
		
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
