package com.groupe2.reservationHotel.serviceReservation;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.groupe2.reservationHotel.daoConsommation.IConsommationDao;
import com.groupe2.reservationHotel.daoReservation.IReservationDao;
import com.groupe2.reservationHotel.entities.Consommation;
import com.groupe2.reservationHotel.entities.Reservation;
import com.groupe2.reservationHotel.exceptions.RechercheConsommationException;
/**
 * Nom de la classe : ReservationServiceImpl implemente IReservationService
 * package com.groupe2.reservationHotel.serviceReservation;
 * @author Gr�goire RAYNAUD
 * Date : 11/07/2016
 */
@Transactional
public class ReservationServiceImpl implements IReservationService {

	private IReservationDao dao;
	@Autowired
	private IConsommationDao daoConso;
	Logger log = Logger.getLogger("ReservationServiceImpl");
	
	
	
	public void setDao(IReservationDao dao) {
		this.dao = dao;
	}

	//Methodes CRUD
	
	@Override
	public Reservation addReservation(Reservation r, Long idChambre) {
		// TODO Auto-generated method stub
		return dao.addReservation(r, idChambre);
	}

	@Override
	public Reservation updateReservation(Reservation r) {
		// TODO Auto-generated method stub
		return dao.updateReservation(r);
	}

	@Override
	public Reservation deleteReservation(Long idReservation) {
		// TODO Auto-generated method stub
		return dao.deleteReservation(idReservation);
	}

	@Override
	public Reservation getReservationById(Long idReservation) {
		// TODO Auto-generated method stub
		return dao.getReservationById(idReservation);
	}

	@Override
	public List<Reservation> getAllReservations() {
		// TODO Auto-generated method stub
		return dao.getAllReservations();
	}

	//Autres methodes
	@Override
	public Double calculerCoutChambre(Reservation r) {
		Integer nombreDeNuits = r.getDateSortie().getDay()-r.getDateArrivee().getDay();
		return (r.getChambre().getPrix() * nombreDeNuits);
	}

	@Override
	public Double calculerCoutProduits(Reservation r) throws RechercheConsommationException {
		Double resu = (double) 0;
		for(Consommation c: r.getListeDesConsommation()){
			resu+=daoConso.calculerCoutProduit(c.getIdConsommation());
		}
		return resu;
	}

	@Override
	public Double calculerCoutTotal(Reservation r) throws RechercheConsommationException {
		// TODO Auto-generated method stub
		return (this.calculerCoutChambre(r)+this.calculerCoutProduits(r));
	}

}
