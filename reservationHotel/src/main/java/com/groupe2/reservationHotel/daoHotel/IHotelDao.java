package com.groupe2.reservationHotel.daoHotel;
/* Classe : IHotelDao
 * Package : com.groupe2.reservationHotel.daoHotel
 * Author : Philippe
 * Date : 11/07/16
 * Version : 1.0.0
 */
import java.util.List;

import com.groupe2.reservationHotel.entities.*;
import com.groupe2.reservationHotel.exceptions.RechercheHotelException;

public interface IHotelDao {
	/* methodes CRUD */
	public Hotel addHotel(Hotel hotel);
	public Hotel deleteHotel(Long idHotel);
	public Hotel updateHotel(Hotel hotel);
	public List<Hotel> getHotels();
	public Hotel getHotel(Long idHotel) throws RechercheHotelException;
	
	/* autres methodes */
	//public List<Employe> getEmployesHotel(Long idHotel);
	//public List<Client> getClientsHotel(Long idHotel);
}
