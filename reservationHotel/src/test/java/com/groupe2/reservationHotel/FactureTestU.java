package com.groupe2.reservationHotel;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
	public void testSetDao() {
		fail("Not yet implemented");
	}
*/
	@Test
	public void testAddFacture() {
		fail("Not yet implemented");
	}
/*
	@Test
	public void testDeleteFacture() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateFacture() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFacture() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFactures() {
		fail("Not yet implemented");
	}
*/
}
