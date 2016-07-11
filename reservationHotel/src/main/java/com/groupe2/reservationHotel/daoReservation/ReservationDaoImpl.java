package com.groupe2.reservationHotel.daoReservation;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.groupe2.reservationHotel.entities.Reservation;

/**
 * Nom de la classe : ReservationDaoImpl implémente IReservationDao
 * package com.groupe2.reservationHotel.daoReservation;
 * @author Grégoire RAYNAUD
 * Date : 11/07/2016
 */
public class ReservationDaoImpl implements IReservationDao{

	Logger log = Logger.getLogger("ReservationDaoImpl");
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Reservation addReservation(Reservation r) {
		em.persist(r);
		log.info("la réservation a bien été ajoutée");
		return r;
	}

	@Override
	public Reservation updateReservation(Reservation r) {
		em.merge(r);
		log.info("La réservation id="+r.getIdReservation()+" a bien été modifiée");
		return null;
	}

	@Override
	public Reservation deleteReservation(Long idReservation) {
		Reservation r = em.find(Reservation.class, idReservation);
		em.remove(r);
		log.info("la réservation id="+r.getIdReservation()+" a bien été supprimée");
		return null;
	}

	@Override
	public Reservation getReservationById(Long idReservation) {
		Reservation r = em.find(Reservation.class, idReservation);
		log.info("La réservation id="+r.getIdReservation()+" a bien été trouvée");
		return r;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reservation> getAllReservations() {
		Query query = em.createQuery("from Reservation");
		log.info("la liste des réservations a bien été trouvée");
		return query.getResultList();
	}

}
