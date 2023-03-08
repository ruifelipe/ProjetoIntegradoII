package com.smart.residuos.smartResiduos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.residuos.smartResiduos.model.EmpresaModel;
import com.smart.residuos.smartResiduos.repository.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository;

	public EmpresaModel salvar(EmpresaModel parametro) {

		return empresaRepository.save(parametro);

	}

	public List<EmpresaModel> listar() {

		return empresaRepository.findAll();

	}
}
