package com.groupe2.reservationHotel;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
/*
	@Test
	public void testSetDao() {
		fail("Not yet implemented");
	}
*/
	@Test
	public void testAddHotel() {
		Hotel hotel1 = new Hotel("nomHotel1", "adrHotel1", 2, "numeroTelephone1", "numeroFax1", "codePostal1", "pays1", "adresseMail1");
		service.addHotel(hotel1);
		assertNotNull(hotel1.getIdHotel());
	}
/*
	@Test
	public void testDeleteHotel() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateHotel() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHotels() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHotel() {
		fail("Not yet implemented");
	}
*/
}
