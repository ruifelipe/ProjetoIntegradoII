package com.smart.residuos.smartResiduos.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class UsuarioModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "us_id")
	private BigInteger id;

	@Column(name = "us_cpf", length = 11)
	private String cpf;

	@Column(name = "us_nome", length = 45)
	private String nome;

	@Column(name = "us_bloco", length = 10)
	private String bloco;

	@Column(name = "us_apartamento")
	private int apartamento;

	@Column(name = "us_email")
	private String email;

	@Column(name = "us_saldo")
	private float saldo;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuarioModel")
	private Set<ResiduoModel> residuoModel;
	

	public Set<ResiduoModel> getResiduoModel() {
		return residuoModel;
	}

	public void setResiduoModel(Set<ResiduoModel> residuoModel) {
		this.residuoModel = residuoModel;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public int getApartamento() {
		return apartamento;
	}

	public void setApartamento(int apartamento) {
		this.apartamento = apartamento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioModel other = (UsuarioModel) obj;
		return Objects.equals(id, other.id);
	}

}
