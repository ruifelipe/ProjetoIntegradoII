package com.smart.residuos.smartResiduos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.residuos.smartResiduos.model.ResiduoModel;
import com.smart.residuos.smartResiduos.service.ResiduoService;

@RestController
@RequestMapping("/residuo")
public class ResiduoController {

	@Autowired
	ResiduoService residuoService;
	
	@PostMapping("/salvar")
	public ResiduoModel salvar(@RequestBody ResiduoModel model) {
		return residuoService.salvar(model);
	}
		
}
