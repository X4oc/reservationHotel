package com.groupe2.reservationHotel.daoReservation;

import java.util.List;

import com.groupe2.reservationHotel.entities.Reservation;

/**
 * Nom de l'interface : IREservationDao
 * package com.groupe2.reservationHotel.daoReservation;
 * @author Grégoire RAYNAUD
 * Date 11/07/2016
 */
public interface IReservationDao {

	//Méthodes CRUD
	public Reservation addReservation(Reservation r);
	public Reservation updateReservation(Reservation r);
	public Reservation deleteReservation (Long idReservation);
	public Reservation getReservationById(Long idReservation);
	public List<Reservation> getAllReservations();
}
