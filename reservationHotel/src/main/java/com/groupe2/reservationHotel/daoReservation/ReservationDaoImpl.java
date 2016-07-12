package com.groupe2.reservationHotel.daoReservation;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.groupe2.reservationHotel.entities.Chambre;
import com.groupe2.reservationHotel.entities.Reservation;

/**
 * Nom de la classe : ReservationDaoImpl implemente IReservationDao
 * package com.groupe2.reservationHotel.daoReservation;
 * @author Gregoire RAYNAUD
 * Date : 11/07/2016
 */
public class ReservationDaoImpl implements IReservationDao{

	Logger log = Logger.getLogger("ReservationDaoImpl");
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Reservation addReservation(Reservation r, Long idChambre) {
		Chambre c = em.find(Chambre.class, idChambre);
		r.setChambre(c);
		c.getListeDesReservation().add(r);
		em.merge(c);
		em.persist(r);
		log.info("La reservation a bien ete ajoutee");
		return r;
	}

	@Override
	public Reservation updateReservation(Reservation r) {
		em.merge(r);
		log.info("La reservation id="+r.getIdReservation()+" a bien ete modifiee");
		return null;
	}

	@Override
	public Reservation deleteReservation(Long idReservation) {
		Reservation r = em.find(Reservation.class, idReservation);
		em.remove(r);
		log.info("la reservation id="+r.getIdReservation()+" a bien ete supprimee");
		return null;
	}

	@Override
	public Reservation getReservationById(Long idReservation) {
		Reservation r = em.find(Reservation.class, idReservation);
		log.info("La reservation id="+r.getIdReservation()+" a bien ete trouvee");
		return r;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reservation> getAllReservations() {
		Query query = em.createQuery("from Reservation");
		log.info("la liste des reservations a bien ete trouvee");
		return query.getResultList();
	}

	

}
