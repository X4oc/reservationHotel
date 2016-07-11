package com.groupe2.reservationHotel.daoReservation;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.groupe2.reservationHotel.entities.Reservation;

/**
 * Nom de la classe : ReservationDaoImpl impl�mente IReservationDao
 * package com.groupe2.reservationHotel.daoReservation;
 * @author Gr�goire RAYNAUD
 * Date : 11/07/2016
 */
public class ReservationDaoImpl implements IReservationDao{

	Logger log = Logger.getLogger("ReservationDaoImpl");
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Reservation addReservation(Reservation r) {
		em.persist(r);
		log.info("la r�servation a bien �t� ajout�e");
		return r;
	}

	@Override
	public Reservation updateReservation(Reservation r) {
		em.merge(r);
		log.info("La r�servation id="+r.getIdReservation()+" a bien �t� modifi�e");
		return null;
	}

	@Override
	public Reservation deleteReservation(Long idReservation) {
		Reservation r = em.find(Reservation.class, idReservation);
		em.remove(r);
		log.info("la r�servation id="+r.getIdReservation()+" a bien �t� supprim�e");
		return null;
	}

	@Override
	public Reservation getReservationById(Long idReservation) {
		Reservation r = em.find(Reservation.class, idReservation);
		log.info("La r�servation id="+r.getIdReservation()+" a bien �t� trouv�e");
		return r;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reservation> getAllReservations() {
		Query query = em.createQuery("from Reservation");
		log.info("la liste des r�servations a bien �t� trouv�e");
		return query.getResultList();
	}

}
