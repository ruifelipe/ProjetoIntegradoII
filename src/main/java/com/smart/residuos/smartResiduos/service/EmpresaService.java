package com.smart.residuos.smartResiduos.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.smart.residuos.smartResiduos.model.EmpresaModel;
import com.smart.residuos.smartResiduos.repository.EmpresaRepository;

public class EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository;
	
	public EmpresaModel salvar(EmpresaModel model) {
		
		return empresaRepository.save(model);
	}
}
