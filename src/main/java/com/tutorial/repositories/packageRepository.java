package com.tutorial.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class packageRepository {
	
	@PersistenceUnit
	private EntityManagerFactory emf;
	
	private Logger logger = LoggerFactory.getLogger(packageRepository.class);

	@Transactional
	public Long getOrderId(Long id){
		logger.debug("start of getOrderId");

		Long orderId = 1L;
		String groupingCriteria = "test";
		EntityManager em = emf.createEntityManager();
		if (em.isOpen()) {
			em.getTransaction().begin();
			
			StoredProcedureQuery query = em.createNamedStoredProcedureQuery("getId");
			query.setParameter("p_order_line_id", id);
			query.execute();
			orderId = (Long)query.getOutputParameterValue("p_order_id");
			groupingCriteria = (String)query.getOutputParameterValue("p_grouping_criterion");
			
			em.close();
		}
		return orderId;
		
	}
}
