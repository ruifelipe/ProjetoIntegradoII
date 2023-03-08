package com.smart.residuos.smartResiduos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.residuos.smartResiduos.model.EmpresaModel;
import com.smart.residuos.smartResiduos.service.EmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

	@Autowired
	private EmpresaService empresaService;

	@PostMapping("/salvar")
	public EmpresaModel salvar(@RequestBody EmpresaModel model) {

		return empresaService.salvar(model);

	}

	@GetMapping("/listar")
	public List<EmpresaModel> listar() {

		return empresaService.listar();

	}

}
