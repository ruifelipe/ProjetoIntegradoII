package com.smart.residuos.smartResiduos.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.residuos.smartResiduos.model.ResiduoModel;

public interface ResiduoRepository extends JpaRepository<ResiduoModel, BigInteger> {

}
