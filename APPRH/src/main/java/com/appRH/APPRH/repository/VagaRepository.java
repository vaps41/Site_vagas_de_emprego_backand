package com.appRH.APPRH.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.appRH.APPRH.models.vaga;

public interface VagaRepository extends CrudRepository <vaga, String> {

	vaga findByCodigo(long codigo);
	List <vaga> findByNome(String nome);
}
