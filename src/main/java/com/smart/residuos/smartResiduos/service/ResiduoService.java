package com.smart.residuos.smartResiduos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.residuos.smartResiduos.model.ResiduoModel;
import com.smart.residuos.smartResiduos.repository.ResiduoRepository;

@Service
public class ResiduoService {

	@Autowired
	ResiduoRepository residuoRepository;

	public ResiduoModel salvar(ResiduoModel parametro) {

		return residuoRepository.save(parametro);

	}

}
