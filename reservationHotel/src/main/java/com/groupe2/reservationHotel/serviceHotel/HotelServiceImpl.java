package com.groupe2.reservationHotel.serviceHotel;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.groupe2.reservationHotel.daoHotel.IHotelDao;
import com.groupe2.reservationHotel.entities.Hotel;
import com.groupe2.reservationHotel.exceptions.RechercheHotelException;

@Transactional
public class HotelServiceImpl implements IHotelService{

	/* definition du logger */
	Logger log = Logger.getLogger("HotelServiceImpl");
	
	/* injection dependance */
	private IHotelDao dao;
	public void setDao(IHotelDao dao){
		this.dao = dao;
		log.info("---------DAO HOTEL INJECTEE----------");
	}
	
	
	/* reimplementation des methodes */
	@Override
	public Hotel addHotel(Hotel hotel) {
		return dao.addHotel(hotel);
	}

	@Override
	public Hotel deleteHotel(Long idHotel) {
		return dao.deleteHotel(idHotel);
	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
		return dao.updateHotel(hotel);
	}

	@Override
	public List<Hotel> getHotels() {
		return dao.getHotels();
	}

	@Override
	public Hotel getHotel(Long idHotel) throws RechercheHotelException {
		return dao.getHotel(idHotel);
	}

}
