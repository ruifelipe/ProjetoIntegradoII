package com.smart.residuos.smartResiduos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.residuos.smartResiduos.model.ResiduoModel;
import com.smart.residuos.smartResiduos.repository.ResiduoRepository;
import com.smart.residuos.smartResiduos.repository.UsuarioRepository;

@Service
public class ResiduoService {

	@Autowired
	ResiduoRepository residuoRepository;
	
	@Autowired
	UsuarioRepository usuarioRepository;

	public ResiduoModel salvar(ResiduoModel parametro) {
		
		return residuoRepository.save(parametro);

	}
		
	public List<ResiduoModel> listar(){
		return residuoRepository.findAll();
	}	

}
