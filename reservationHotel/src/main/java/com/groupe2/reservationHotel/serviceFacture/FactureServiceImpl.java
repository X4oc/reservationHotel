package com.groupe2.reservationHotel.serviceFacture;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.groupe2.reservationHotel.daoFacture.IFactureDao;
import com.groupe2.reservationHotel.entities.Facture;
import com.groupe2.reservationHotel.exceptions.RechercheFactureException;

@Transactional
public class FactureServiceImpl implements IFactureService{

	/* definition du logger */
	Logger log = Logger.getLogger("FactureServiceImpl");
	
	/* injection dependance */
	private IFactureDao dao;
	public void setDao(IFactureDao dao){
		this.dao = dao;
		log.info("---------DAO FACTURE INJECTEE----------");
	}
	
	
	/* reimplementation des methodes */
	@Override
	public Facture addFacture(Facture facture) {
		return dao.addFacture(facture);
	}

	@Override
	public Facture deleteFacture(Long idFacture) {
		return dao.deleteFacture(idFacture);
	}

	@Override
	public Facture updateFacture(Facture facture) {
		return dao.updateFacture(facture);
	}

	@Override
	public Facture getFacture(Long idFacture) throws RechercheFactureException {
		return dao.getFacture(idFacture);
	}

	@Override
	public List<Facture> getFactures() {
		return dao.getFactures();
	}

}
