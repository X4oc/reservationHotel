package com.groupe2.reservationHotel;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.groupe2.reservationHotel.servicePaiement.IPaiementService;

public class PaiementTestU {

	private static ClassPathXmlApplicationContext context;
	private static IPaiementService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	    context =  new ClassPathXmlApplicationContext("app.xml");
	    service = (IPaiementService) context.getBean("servicePaiement");
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
	public void testAddPaiement() {
		fail("Not yet implemented");
	}
/*
	@Test
	public void testDeletePaiement() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdatePaiement() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPaiement() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPaiements() {
		fail("Not yet implemented");
	}
*/
}
