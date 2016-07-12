package com.groupe2.reservationHotel.daoHotel;
/* Classe : HotelDaoImpl
 * Package : com.groupe2.reservationHotel.daoHotel
 * Author : Philippe
 * Date : 11/07/16
 * Version : 1.0.0
 */
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.groupe2.reservationHotel.entities.Hotel;
import com.groupe2.reservationHotel.exceptions.RechercheHotelException;

public class HotelDaoImpl implements IHotelDao{

	/* definition du logger */
	Logger log = Logger.getLogger("HotelDaoImpl");
	
	/* definition de l entityManager */
	@PersistenceContext
	private EntityManager em;
	
	/* reimplementation des methodes */
	@Override
	public Hotel addHotel(Hotel hotel) {
		em.persist(hotel);
		log.info("----------addHotel------"+hotel.toString());
		return hotel;
	}

	@Override
	public Hotel deleteHotel(Long idHotel) {
		Hotel hotel = em.find(Hotel.class, idHotel);
		log.info("----------deleteHotel------"+hotel.toString());
		em.remove(hotel);
		return hotel;
	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
		em.merge(hotel);
		log.info("----------updateHotel------"+hotel.toString());
		return hotel;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Hotel> getHotels() {
		Query query = em.createQuery("from Hotel");
		log.info("-----------getHotels-----------"+query.getResultList().size());
		return query.getResultList();
	}

	@Override
	public Hotel getHotel(Long idHotel) throws RechercheHotelException {
		Hotel hotel = em.find(Hotel.class, idHotel);

		if (hotel == null) {
			throw new RechercheHotelException("l hotel est introuvable !!");
		}
		
		log.info("----------getHotel------"+hotel.toString());
		return hotel;
	}
/*
	@Override
	public List<Employe> getEmployesHotel(Long idHotel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> getClientsHotel(Long idHotel) {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
