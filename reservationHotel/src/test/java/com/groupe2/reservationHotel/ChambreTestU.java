package com.groupe2.reservationHotel;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.groupe2.reservationHotel.entities.Chambre;
import com.groupe2.reservationHotel.entities.Reservation;
import com.groupe2.reservationHotel.entities.Simple;
import com.groupe2.reservationHotel.entities.Suite;
import com.groupe2.reservationHotel.serviceChambre.IChambreService;
import com.groupe2.reservationHotel.serviceReservation.IReservationService;

public class ChambreTestU {

	private static ClassPathXmlApplicationContext context;
	private static IChambreService service;
	private static IReservationService serviceReservation;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app.xml");
		service = (IChambreService) context.getBean("serviceChambre");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	@Test
	public void testAddSuite() {
		Chambre su = new Suite(27,45.0,20.0,2,3,3);
		Chambre su2 = new Suite(9,45.0,20.0,0,3,3);
		Chambre su3 = new Suite(18,45.0,20.0,1,3,3);
		service.addSuite(su);
		service.addSuite(su2);
		service.addSuite(su3);
		assertNotNull(su.getIdChambre());
		assertNotNull(su2.getIdChambre());
		assertNotNull(su3.getIdChambre());
	}

	/*@Test
	public void testAddSimple() {
		Chambre si = new Simple(12,15.0,10.0,1,1,1);
		service.addSimple(si);
		assertNotNull(si.getIdChambre());
	}

	@Test
	public void testAddDoubles() {
		Chambre d = new Suite(34,25.0,15.0,3,1,2);
		service.addDoubles(d);
		assertNotNull(d.getIdChambre());
	}

	@Test
	public void testUpdateChambre() {
		Chambre c = service.getChambreById(3L);
		c.setNumeroChambre(45);
		service.updateChambre(c);
		Chambre c2 = service.getChambreById(3L);
		assertEquals(c2.getNumeroChambre(), c.getNumeroChambre());
	}

	@Test
	public void testDeleteChambre() {
		List<Chambre> tabinitial = service.getAllChambres();
		Chambre c =service.deleteChambre(2L);
		List<Chambre> tabfinal = service.getAllChambres();
		assertNotSame(tabfinal.size(), tabinitial.size());
	}

	@Test
	public void testGetChambreById() {
		Chambre c = service.getChambreById(3L);
		assertTrue(c.getIdChambre() == 3L);
	}

	@Test
	public void testGetAllChambres() {
		List<Chambre> tabC = service.getAllChambres();
		assertTrue(tabC.size() > 0);
	}

	@Test
	public void testEstDisponible() throws ParseException {
		Chambre c1 = service.getChambreById(1L);
		Chambre c2 = service.getChambreById(2L);
		Chambre c3 = service.getChambreById(3L);
		Chambre c4 = service.getChambreById(4L);
		Chambre c5 = service.getChambreById(5L);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf.parse("09/07/2016");
		Date d2 = sdf.parse("16/07/2016");
		Date d3 = sdf.parse("23/07/2016");
		Date d4 = sdf.parse("30/07/2016");
		Reservation r1 = new Reservation(d3,d4);
		r1.setChambre(c1);
		serviceReservation.addReservation(r1);
		assertTrue(service.estDisponible(c1, d1, d2));
		Reservation r2 = new Reservation(d2,d4);
		r2.setChambre(c2);
		serviceReservation.addReservation(r2);
		assertFalse(service.estDisponible(c2, d1, d3));
		Reservation r3 = new Reservation(d1,d4);
		r3.setChambre(c3);
		serviceReservation.addReservation(r3);
		assertFalse(service.estDisponible(c3, d2, d3));
		Reservation r4 = new Reservation(d1,d3);
		r4.setChambre(c4);
		serviceReservation.addReservation(r4);
		assertFalse(service.estDisponible(c4, d2, d4));
		Reservation r5 = new Reservation(d1,d2);
		r5.setChambre(c5);
		serviceReservation.addReservation(r5);
		assertFalse(service.estDisponible(c5, d3, d4));
	}*/

}
