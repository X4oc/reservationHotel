package com.groupe2.reservationHotel.servicePaiement;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.groupe2.reservationHotel.daoPaiement.IPaiementDao;
import com.groupe2.reservationHotel.entities.Paiement;
import com.groupe2.reservationHotel.exceptions.RecherchePaiementException;

@Transactional
public class PaiementServiceImpl implements IPaiementService{

	/* definition du logger */
	Logger log = Logger.getLogger("PaiementServiceImpl");
	
	/* injection dependance */
	private IPaiementDao dao;
	public void setDao(IPaiementDao dao){
		this.dao = dao;
		log.info("---------DAO PAIEMENT INJECTEE----------");
	}
	
	
	/* reimplementation des methodes */
	@Override
	public Paiement addPaiement(Paiement paiement) {
		return dao.addPaiement(paiement);
	}

	@Override
	public Paiement deletePaiement(Long idPaiement) {
		return dao.deletePaiement(idPaiement);
	}

	@Override
	public Paiement updatePaiement(Paiement paiement) {
		return dao.updatePaiement(paiement);
	}

	@Override
	public Paiement getPaiement(Long idPaiement) throws RecherchePaiementException {
		return dao.getPaiement(idPaiement);
	}

	@Override
	public List<Paiement> getPaiements() {
		return dao.getPaiements();
	}

}
