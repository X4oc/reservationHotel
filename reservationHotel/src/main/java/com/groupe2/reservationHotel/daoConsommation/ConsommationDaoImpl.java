package com.groupe2.reservationHotel.daoConsommation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.groupe2.reservationHotel.entities.Consommation;
import com.groupe2.reservationHotel.entities.Produit;
import com.groupe2.reservationHotel.exceptions.RechercheConsommationException;

/*
 * CLASSE : CONSOMMATIONDAOIMPL
 * AUTEUR : ERIK DUHEM
 * DATE : 11 07 2016
 * VERSION : 1.0
 */

public class ConsommationDaoImpl implements IConsommationDao {

	/*
	 * ATTRIBUTS
	 */

	Logger log = Logger.getLogger("ConsommationDaoImpl");

	@PersistenceContext
	private EntityManager em;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.groupe2.reservationHotel.daoConsommation.IConsommationDao#
	 * addConsommation(com.groupe2.reservationHotel.entities.Consommation)
	 */

	@Override
	public Consommation addConsommation(Consommation cn) {
		em.persist(cn);
		log.info("La consommation " + cn.getIdConsommation() + " a bien été crée");
		return cn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.groupe2.reservationHotel.daoConsommation.IConsommationDao#
	 * getConsommationId(java.lang.Long)
	 */

	@Override
	public Consommation getConsommationId(Long idConsommation) throws RechercheConsommationException {
		Consommation cn = em.find(Consommation.class, idConsommation);

		if (cn == null) {
			throw new RechercheConsommationException("La consommation " + idConsommation + " n' a pas été trouvée!");
		}

		log.info(
				"La consommation " + cn.getIdConsommation() + cn.getProduit().getNomProduit() + " a bien été trouvée!");
		return cn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.groupe2.reservationHotel.daoConsommation.IConsommationDao#
	 * getConsommation()
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<Consommation> getConsommation() {
		Query req = em.createQuery("from Consommation");
		log.info("La liste des consommation est de : " + req.getResultList().size() + " consommations.");
		return req.getResultList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.groupe2.reservationHotel.daoConsommation.IConsommationDao#
	 * updateConsommation(com.groupe2.reservationHotel.entities.Consommation)
	 */

	@Override
	public Consommation updateConsommation(Consommation cn) {
		em.merge(cn);
		log.info("La consommation " + cn.getIdConsommation() + cn.getProduit().getNomProduit()
				+ " a bien été mis a jour!");
		return cn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.groupe2.reservationHotel.daoConsommation.IConsommationDao#
	 * deleteConsommation(java.lang.Long)
	 */

	@Override
	public Consommation deleteConsommation(Long idConsommation) throws RechercheConsommationException {
		Consommation cn = em.find(Consommation.class, idConsommation);

		if (cn == null) {
			throw new RechercheConsommationException("La consommation " + idConsommation + " n'a pas été trouvée");
		}

		em.remove(cn);
		log.info("La consommation " + cn.getIdConsommation() + cn.getProduit().getNomProduit()
				+ " a bien été supprimée!");
		return cn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.groupe2.reservationHotel.daoConsommation.IConsommationDao#
	 * calculerCoutProduit(java.lang.Long)
	 */

	@Override
	public Double calculerCoutProduit(Long idConsommation) throws RechercheConsommationException {
		Consommation cn = em.find(Consommation.class, idConsommation);

		if (cn == null) {
			throw new RechercheConsommationException("La consommation " + idConsommation + " n'a pas été trouvée");
		}

		Produit pdt = cn.getProduit();

		return pdt.getPrixProduit() * cn.getQuantiteConsommation();
	}

}
