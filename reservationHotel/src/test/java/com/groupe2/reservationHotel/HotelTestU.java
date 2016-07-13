package com.groupe2.reservationHotel;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.groupe2.reservationHotel.entities.Client;
import com.groupe2.reservationHotel.entities.Employe;
import com.groupe2.reservationHotel.entities.Hotel;
import com.groupe2.reservationHotel.serviceHotel.IHotelService;

public class HotelTestU {

	private static ClassPathXmlApplicationContext context;
	private static IHotelService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	    context =  new ClassPathXmlApplicationContext("app.xml");
	    service = (IHotelService) context.getBean("serviceHotel");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	@Test
	public void testAddHotel() {
		Hotel hotel1 = new Hotel("nomHotel1", "adrHotel1", 2, "numeroTelephone1", "numeroFax1", "codePostal1", "pays1", "adresseMail1");
		Hotel hotel2 = new Hotel("nomHotel2", "adrHotel2", 4, "numeroTelephone2", "numeroFax2", "codePostal2", "pays2", "adresseMail2");
		Hotel hotel3 = new Hotel("nomHotel3", "adrHotel3", 6, "numeroTelephone3", "numeroFax3", "codePostal3", "pays3", "adresseMail3");
		Hotel hotel4 = new Hotel("nomHotel4", "adrHotel4", 8, "numeroTelephone4", "numeroFax4", "codePostal4", "pays4", "adresseMail4");
		Hotel hotel5 = new Hotel("nomHotel5", "adrHotel5", 10, "numeroTelephone5", "numeroFax5", "codePostal5", "pays5", "adresseMail5");
		Hotel hotel6 = new Hotel("nomHotel6", "adrHotel6", 12, "numeroTelephone6", "numeroFax6", "codePostal6", "pays6", "adresseMail6");
		Hotel hotel7 = new Hotel("nomHotel7", "adrHotel7", 14, "numeroTelephone7", "numeroFax7", "codePostal7", "pays7", "adresseMail7");
		Hotel hotel8 = new Hotel("nomHotel8", "adrHotel8", 16, "numeroTelephone8", "numeroFax8", "codePostal8", "pays8", "adresseMail8");
		Hotel hotel9 = new Hotel("nomHotel9", "adrHotel9", 18, "numeroTelephone9", "numeroFax9", "codePostal9", "pays9", "adresseMail9");
		service.addHotel(hotel1);
		service.addHotel(hotel2);
		service.addHotel(hotel3);
		service.addHotel(hotel4);
		service.addHotel(hotel5);
		service.addHotel(hotel6);
		service.addHotel(hotel7);
		service.addHotel(hotel8);
		service.addHotel(hotel9);
		assertNotNull(hotel1.getIdHotel());
	}

	@Test
	public void testDeleteHotel() {
		List<Hotel> tabInitial = service.getHotels();
		service.deleteHotel(3L);
		List<Hotel> tabFinal = service.getHotels();
		assertNotSame(tabFinal.size(), tabInitial.size());
	}

	@Test
	public void testUpdateHotel() throws Exception {
		Hotel h = service.getHotel(7L);
		h.setNomHotel("nom modifie 7");
		service.updateHotel(h);
		Hotel h2 = service.getHotel(7L);
		assertEquals(h2.getNomHotel(), h.getNomHotel());
	}

	@Test
	public void testGetHotels() {
		List<Hotel> tabH = service.getHotels();
		assertTrue(tabH.size() > 0);
	}

	@Test
	public void testGetHotel() throws Exception {
		Hotel h = service.getHotel(5L);
		assertTrue(h.getIdHotel() == 5L);
	}

	@Test
	public void testgetEmployesHotel(){
		List<Employe> tabE = service.getEmployesHotel(1L);
		assertTrue(tabE.size() > 0);
	}
	
	@Test
	public void testgetClientsHotel(){
		List<Client> tabC = service.getClientsHotel(1L);
		assertTrue(tabC.size() > 0);
	}
	
}
