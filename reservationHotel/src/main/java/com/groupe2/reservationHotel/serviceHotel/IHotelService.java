package com.groupe2.reservationHotel.serviceHotel;

import java.util.List;

import com.groupe2.reservationHotel.entities.Hotel;
import com.groupe2.reservationHotel.exceptions.RechercheHotelException;

public interface IHotelService {
	public Hotel addHotel(Hotel hotel);
	public Hotel deleteHotel(Long idHotel);
	public Hotel updateHotel(Hotel hotel);
	public List<Hotel> getHotels();
	public Hotel getHotel(Long idHotel) throws RechercheHotelException;
}
