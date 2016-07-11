package com.groupe2.reservationHotel.serviceReservation;

import java.util.List;

import com.groupe2.reservationHotel.entities.Reservation;
import com.groupe2.reservationHotel.exceptions.RechercheConsommationException;

/**
 * Nom de l'interface : IReservationService
 * package com.groupe2.reservationHotel.serviceReservation;
 * @author Gr�goire RAYNAUD
 * Date : 11/07/2016
 */
public interface IReservationService {

	//M�thodes CRUD
		public Reservation addReservation(Reservation r);
		public Reservation updateReservation(Reservation r);
		public Reservation deleteReservation (Long idReservation);
		public Reservation getReservationById(Long idReservation);
		public List<Reservation> getAllReservations();
		
	//Autres m�thodes
		public Double calculerCoutChambre(Reservation r);
		public Double calculerCoutProduits(Reservation r) throws RechercheConsommationException;
		public Double calculerCoutTotal(Reservation r) throws RechercheConsommationException;
}
