package com.groupe2.reservationHotel.daoProduit;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.groupe2.reservationHotel.entities.Produit;
import com.groupe2.reservationHotel.exceptions.RechercheProduitException;

/*
 * CLASSE : PRODUITDAOIMPL
 * AUTEUR : ERIK DUHEM
 * DATE : 11 07 2016
 * VERSION : 1.0
 */

public class ProduitDaoImpl implements IProduitDao {

	/*
	 * ATTRIBUTS
	 */

	Logger log = Logger.getLogger("ProduitDaoImpl");

	@PersistenceContext
	private EntityManager em;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.groupe2.reservationHotel.daoProduit.IProduitDao#addProduit(com.
	 * groupe2.reservationHotel.entities.Produit)
	 */

	@Override
	public Produit addProduit(Produit pdt) {
		em.persist(pdt);
		log.info("Le produit " + pdt.getIdProduit() + pdt.getNomProduit() + " a bien été crée");
		return pdt;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.daoProduit.IProduitDao#getProduitId(java.
	 * lang.Long)
	 */

	@Override
	public Produit getProduitId(Long idProduit) throws RechercheProduitException {
		Produit pdt = em.find(Produit.class, idProduit);

		if (pdt == null) {
			throw new RechercheProduitException("Le produit " + idProduit + " n' a pas été trouvée!");
		}

		log.info("Le produit " + pdt.getIdProduit() + pdt.getNomProduit() + " a bien été trouvée!");
		return pdt;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.groupe2.reservationHotel.daoProduit.IProduitDao#getProduit()
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<Produit> getProduit() {
		Query req = em.createQuery("from Produit");
		log.info("La liste des produits est de : " + req.getResultList().size() + " produits.");
		return req.getResultList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.daoProduit.IProduitDao#updateProduit(com.
	 * groupe2.reservationHotel.entities.Produit)
	 */

	@Override
	public Produit updateProduit(Produit pdt) {
		em.merge(pdt);
		log.info("Le produit " + pdt.getIdProduit() + pdt.getNomProduit() + " a bien été mis a jour!");
		return pdt;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.daoProduit.IProduitDao#deleteProduit(java.
	 * lang.Long)
	 */

	@Override
	public Produit deleteProduit(Long idProduit) throws RechercheProduitException {
		Produit pdt = em.find(Produit.class, idProduit);

		if (pdt == null) {
			throw new RechercheProduitException("Le produit " + idProduit + " n'a pas été trouvée");
		}

		em.remove(pdt);
		log.info("Le produit " + pdt.getIdProduit() + pdt.getNomProduit() + " a bien été supprimée!");
		return pdt;
	}

}
