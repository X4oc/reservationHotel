package com.groupe2.reservationHotel.serviceChambre;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.groupe2.reservationHotel.daoChambre.IChambreDao;
import com.groupe2.reservationHotel.entities.Chambre;
import com.groupe2.reservationHotel.entities.Reservation;

/**
 * Nom de la classe : ChambreServiceImpl implémente IREservationService
 * package com.groupe2.reservationHotel.serviceChambre;
 * @author Grégoire RAYNAUD
 * 11/07/2016
 */
@Transactional
public class ChambreServiceImpl implements IChambreService {

	private IChambreDao dao;
	Logger log = Logger.getLogger("ChambreServiceImpl");
	
	public void setDao(IChambreDao dao) {
		this.dao = dao;
	}

	//Méthodes CRUD
	@Override
	public Chambre addSuite(Chambre c) {
		// TODO Auto-generated method stub
		return dao.addSuite(c);
	}

	@Override
	public Chambre addSimple(Chambre c) {
		// TODO Auto-generated method stub
		return dao.addSimple(c);
	}

	@Override
	public Chambre addDoubles(Chambre c) {
		// TODO Auto-generated method stub
		return dao.addDoubles(c);
	}

	@Override
	public Chambre updateChambre(Chambre c) {
		// TODO Auto-generated method stub
		return dao.updateChambre(c);
	}

	@Override
	public Chambre deleteChambre(Long idChambre) {
		// TODO Auto-generated method stub
		return dao.deleteChambre(idChambre);
	}

	@Override
	public Chambre getChambreById(Long idChambre) {
		// TODO Auto-generated method stub
		return dao.getChambreById(idChambre);
	}

	@Override
	public List<Chambre> getAllChambres() {
		// TODO Auto-generated method stub
		return dao.getAllChambres();
	}

	// Autres méthodes
	@Override
	/**
	 * Retourne true s'il n'y a aucune réservation entre les dates "dateDebut" et "dateFin"
	 */
	public boolean estDisponible(Chambre c, Date dateDebut, Date dateFin) {
		boolean resu = true;
		for(Reservation r:c.getListeDesReservations()){
			resu = resu && (dateFin.getDate()<r.getDateArrivee().getDate() 
					|| dateDebut.getDate()>r.getDateSortie().getDate());
		}
		return resu;
	}

	

}
