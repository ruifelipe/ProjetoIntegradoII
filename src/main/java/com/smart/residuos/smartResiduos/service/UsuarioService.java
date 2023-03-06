package com.smart.residuos.smartResiduos.service;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.residuos.smartResiduos.model.UsuarioModel;
import com.smart.residuos.smartResiduos.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public UsuarioModel salvar(UsuarioModel parametro) {
		
		return usuarioRepository.save(parametro);
	}
	
	public Optional<UsuarioModel> buscarPorId(BigInteger id) {
		
		return usuarioRepository.findById(id);
	}
}
