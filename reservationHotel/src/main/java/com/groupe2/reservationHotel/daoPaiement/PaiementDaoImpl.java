package com.groupe2.reservationHotel.daoPaiement;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.groupe2.reservationHotel.entities.Paiement;
import com.groupe2.reservationHotel.exceptions.RecherchePaiementException;

public class PaiementDaoImpl implements IPaiementDao{

	/* definition du logger */
	Logger log = Logger.getLogger("PaiementDaoImpl");
	
	/* definition de l entityManager */
	@PersistenceContext
	private EntityManager em;
	
	/* reimplementation des methodes */
	@Override
	public Paiement addPaiement(Paiement paiement) {
		em.persist(paiement);
		log.info("----------addPaiement------"+paiement.toString());
		return paiement;
	}

	@Override
	public Paiement deletePaiement(Long idPaiement) {
		Paiement paiement = em.find(Paiement.class, idPaiement);
		log.info("----------deletePaiement------"+paiement.toString());
		em.remove(paiement);
		return paiement;
	}

	@Override
	public Paiement updatePaiement(Paiement paiement) {
		em.merge(paiement);
		log.info("----------updatePaiement------"+paiement.toString());
		return paiement;
	}

	@Override
	public Paiement getPaiement(Long idPaiement) throws RecherchePaiementException {
		Paiement paiement = em.find(Paiement.class, idPaiement);

		if (paiement == null) {
			throw new RecherchePaiementException("le paiement est introuvable !!");
		}
		
		log.info("----------getPaiement------"+paiement.toString());
		return paiement;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Paiement> getPaiements() {
		Query query = em.createQuery("from Paiement");
		log.info("-----------getPaiements-----------"+query.getResultList().size());
		return query.getResultList();
	}

}