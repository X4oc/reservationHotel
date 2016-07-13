package com.groupe2.reservationHotel;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.groupe2.reservationHotel.entities.Facture;
import com.groupe2.reservationHotel.entities.Reservation;
import com.groupe2.reservationHotel.serviceFacture.IFactureService;

public class FactureTestU {

	private static ClassPathXmlApplicationContext context;
	private static IFactureService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	    context =  new ClassPathXmlApplicationContext("app.xml");
	    service = (IFactureService) context.getBean("serviceFacture");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

/*
	@Test
	public void testAddFacture() {
		Facture facture1 = new Facture(new Date(), 1.0);
		Facture facture2 = new Facture(new Date(), 2.0);
		Facture facture3 = new Facture(new Date(), 3.0);
		Facture facture4 = new Facture(new Date(), 4.0);
		Facture facture5 = new Facture(new Date(), 5.0);
		Facture facture6 = new Facture(new Date(), 6.0);
		Facture facture7 = new Facture(new Date(), 7.0);
		Facture facture8 = new Facture(new Date(), 8.0);
		Facture facture9 = new Facture(new Date(), 9.0);
		service.addFacture(facture1);
		service.addFacture(facture2);
		service.addFacture(facture3);
		service.addFacture(facture4);
		service.addFacture(facture5);
		service.addFacture(facture6);
		service.addFacture(facture7);
		service.addFacture(facture8);
		service.addFacture(facture9);
		assertNotNull(facture1.getIdFacture());
	}

	@Test
	public void testDeleteFacture() {
		List<Facture> tabInitial = service.getFactures();
		service.deleteFacture(3L);
		List<Facture> tabFinal = service.getFactures();
		assertNotSame(tabFinal.size(), tabInitial.size());
	}

	@Test
	public void testUpdateFacture() throws Exception {
		Facture f = service.getFacture(4L);
		f.setTva(50.0);
		service.updateFacture(f);
		Facture f2 = service.getFacture(4L);
		assertEquals(f2.getTva(), f.getTva());
	}

	@Test
	public void testGetFacture() throws Exception {
		Facture f = service.getFacture(5L);
		assertTrue(f.getIdFacture() == 5L);
	}

	
	@Test
	public void testGetFactures() {
		List<Facture> tabF = service.getFactures();
		assertTrue(tabF.size() > 0);
	}
*/
	@Test
	public void tesAddFactureSachantReservation(){
		Facture facture1 = new Facture(new Date(), 1.0);
		Facture facture2 = new Facture(new Date(), 2.0);
		Facture facture3 = new Facture(new Date(), 3.0);
		Facture facture4 = new Facture(new Date(), 4.0);
		Facture facture5 = new Facture(new Date(), 5.0);
		Facture facture6 = new Facture(new Date(), 6.0);
		Facture facture7 = new Facture(new Date(), 7.0);
		Facture facture8 = new Facture(new Date(), 8.0);
		Facture facture9 = new Facture(new Date(), 9.0);
		
		service.addFactureSachantReservation(facture1, 1L);
		service.addFactureSachantReservation(facture2, 1L);
		service.addFactureSachantReservation(facture3, 1L);
		service.addFactureSachantReservation(facture4, 1L);
		service.addFactureSachantReservation(facture5, 1L);
		service.addFactureSachantReservation(facture6, 1L);
		service.addFactureSachantReservation(facture7, 1L);
		service.addFactureSachantReservation(facture8, 1L);
		service.addFactureSachantReservation(facture9, 1L);
		assertNotNull(facture1.getIdFacture());		
	}
/*	
	@Test
	public void testGetFacturesByClient(){
		List<Facture> tabF = service.getFacturesByClient(5L);
		assertTrue(tabF.size() > 0);
	}
	
	@Test
	public void testCalculerCoutConsommationParClient(){
		assertTrue(service.calculerCoutConsommationParClient(1L) > 0);
		
	}
	
	@Test
	public void testCalculerCoutTotalParClient(){
		assertTrue(service.calculerCoutTotalParClient(1L) > 0);
	}
	
		@Test void testCalculerCoutTotalAnnuelParClient(){
		assertTrue(service.calculerCoutTotalAnnuelParClient(1L) > 0);
	}
	
	@Test void testCalculerCoutTotalSemestrielParClient(){
		assertTrue(service.calculerCoutTotalSemestrielParClient(1L) > 0);
	}

*/
}
