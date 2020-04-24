package org.healthclinics.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.healthclinics.model.Especializacao;
import org.springframework.stereotype.Repository;
@Repository
@Transactional
public class EspecializacaoDAO {
	@PersistenceContext
	private EntityManager entityManager;
	public 	List<Especializacao> getEspecializacoes() {
		return entityManager.createQuery("select E from Especializacao E",Especializacao.class).getResultList();		
	}
}
