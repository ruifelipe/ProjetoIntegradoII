package com.smart.residuos.smartResiduos.model;

import java.io.Serializable;
import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_empresa")
@Setter
@Getter
public class EmpresaModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "emp_id")
	private BigInteger id;
	
	@Column(name = "emp_cnpj",length = 15)
	private String cnpj;
	
	@Column(name = "emp_nome",length = 55)
	private String nome;

	@Column(name = "emp_local",length = 30)
	private String local;
	
	@Column(name = "emp_email",length = 50)
	private String email;

	
}
