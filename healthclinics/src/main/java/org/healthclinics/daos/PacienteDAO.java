package org.healthclinics.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.healthclinics.model.Paciente;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class PacienteDAO {
	@PersistenceContext
	private EntityManager entityManager;

	public void salva(Paciente paciente) {
		entityManager.persist(paciente);
	}
}
