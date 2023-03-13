package com.smart.residuos.smartResiduos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.smart.residuos.smartResiduos.model.EmpresaModel;
import com.smart.residuos.smartResiduos.service.EmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

	@Autowired
	private EmpresaService empresaService;
	
	
	@GetMapping("/salvar")
	public ModelAndView form() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("empresas/formEmpresa");
		
		return mv;
		
	}

	
	@GetMapping("/perfilEmpresa")
	public ModelAndView perfil() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("empresas/perfilEmpresa");
		List<EmpresaModel> listaEmpresaModel = empresaService.listar();
		mv.addObject("listaEmpresaModel", listaEmpresaModel);
		
		return mv;
		
	}
	
	@PostMapping(path="salvar")
	public ModelAndView salvar(EmpresaModel empModel) {

		ModelAndView mv = new ModelAndView();
		empresaService.salvar(empModel);
		mv.setViewName("empresas/formEmpresa");
		
		return mv;

	}

	@GetMapping("/listar")
	public List<EmpresaModel> listar() {

		return empresaService.listar();

	}

}
