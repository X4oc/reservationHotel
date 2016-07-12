package com.groupe2.reservationHotel.daoFacture;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.groupe2.reservationHotel.entities.Facture;
import com.groupe2.reservationHotel.exceptions.RechercheFactureException;

public class FactureDaoImpl implements IFactureDao{


	/* definition du logger */
	Logger log = Logger.getLogger("FactureDaoImpl");
	
	/* definition de l entityManager */
	@PersistenceContext
	private EntityManager em;
	
	/* reimplementation des methodes */
	@Override
	public Facture addFacture(Facture facture) {
		em.persist(facture);
		log.info("----------addFacture------"+facture.toString());
		return facture;
	}

	@Override
	public Facture deleteFacture(Long idFacture) {
		Facture facture = em.find(Facture.class, idFacture);
		log.info("----------deleteFacture------"+facture.toString());
		em.remove(facture);
		return facture;
	}

	@Override
	public Facture updateFacture(Facture facture) {
		em.merge(facture);
		log.info("----------updateFacture------"+facture.toString());
		return facture;
	}

	@Override
	public Facture getFacture(Long idFacture) throws RechercheFactureException {
		Facture facture = em.find(Facture.class, idFacture);

		if (facture == null) {
			throw new RechercheFactureException("la facture est introuvable !!");
		}
		
		log.info("----------getFacture------"+facture.toString());
		return facture;
	}

	@Override
	public List<Facture> getFactures() {
		Query query = em.createQuery("from Facture");
		log.info("-----------getFactures-----------"+query.getResultList().size());
		return query.getResultList();
	}
	
}
