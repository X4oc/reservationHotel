package com.groupe2.reservationHotel.serviceProduit;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.groupe2.reservationHotel.daoProduit.IProduitDao;
import com.groupe2.reservationHotel.entities.Produit;
import com.groupe2.reservationHotel.exceptions.RechercheProduitException;

/*
 * CLASSE : PRODUITSERVICEIMPL
 * AUTEUR : ERIK DUHEM
 * DATE : 11 07 2016
 * VERSION : 1.0
 */

@Transactional
public class ProduitServiceImpl implements IProduitService {

	/*
	 * ATTRIBUTS
	 */

	private IProduitDao dao;
	Logger logger = Logger.getLogger("ProduitServiceImpl");

	/*
	 * GETTERS ET SETTERS
	 */

	public IProduitDao getDao() {
		return dao;
	}

	public void setDao(IProduitDao dao) {
		this.dao = dao;
		logger.info("<---------- daoProduit injectée  -------->");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.serviceProduit.IProduitService#addProduit(
	 * com.groupe2.reservationHotel.entities.Produit)
	 */

	@Override
	public Produit addProduit(Produit pdt) {
		return this.dao.addProduit(pdt);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.serviceProduit.IProduitService#getProduitId(
	 * java.lang.Long)
	 */

	@Override
	public Produit getProduitId(Long idProduit) throws RechercheProduitException {
		return this.dao.getProduitId(idProduit);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.serviceProduit.IProduitService#getProduit()
	 */

	@Override
	public List<Produit> getProduit() {
		return this.dao.getProduit();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.serviceProduit.IProduitService#updateProduit
	 * (com.groupe2.reservationHotel.entities.Produit)
	 */

	@Override
	public Produit updateProduit(Produit pdt) {
		return this.dao.updateProduit(pdt);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.serviceProduit.IProduitService#deleteProduit
	 * (java.lang.Long)
	 */

	@Override
	public Produit deleteProduit(Long idProduit) throws RechercheProduitException {
		return this.dao.deleteProduit(idProduit);
	}

}
