package com.groupe2.reservationHotel.serviceReservation;

import java.util.List;

import com.groupe2.reservationHotel.entities.Reservation;

/**
 * Nom de l'interface : IReservationService
 * package com.groupe2.reservationHotel.serviceReservation;
 * @author Grégoire RAYNAUD
 * Date : 11/07/2016
 */
public interface IReservationService {

	//Méthodes CRUD
		public Reservation addReservation(Reservation r);
		public Reservation updateReservation(Reservation r);
		public Reservation deleteReservation (Long idReservation);
		public Reservation getReservationById(Long idReservation);
		public List<Reservation> getAllReservations();
		
	//Autres méthodes
		public Double calculerCoutChambre(Reservation r);
		public Double calculerCoutProduits(Reservation r);
		public Double calculerCoutTotal(Reservation r);
}
