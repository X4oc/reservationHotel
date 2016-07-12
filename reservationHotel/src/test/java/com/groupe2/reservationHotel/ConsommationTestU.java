package com.groupe2.reservationHotel;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.groupe2.reservationHotel.entities.Client;
import com.groupe2.reservationHotel.entities.Consommation;
import com.groupe2.reservationHotel.entities.Produit;
import com.groupe2.reservationHotel.exceptions.RechercheProduitException;
import com.groupe2.reservationHotel.serviceConsommation.IConsommationService;
import com.groupe2.reservationHotel.servicePersonne.IPersonneService;
import com.groupe2.reservationHotel.serviceProduit.IProduitService;

/*
 * TEST : CONSOMMATIONTESTU
 * AUTEUR : ERIK DUHEM
 * DATE : 12 07 2016
 * VERSION : 1.0
 */

public class ConsommationTestU {

	/*
	 * ATTRIBUTS ET CONFIGS
	 */

	private static ClassPathXmlApplicationContext context;
	private static IConsommationService serviceConso;
	private static IProduitService serviceProduit;
	private static IPersonneService servicePersonne;

	Logger logger = Logger.getLogger("ConsommationTestU");

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app.xml");
		serviceConso = (IConsommationService) context.getBean("serviceConsommation");
		serviceProduit = (IProduitService) context.getBean("serviceProduit");
		servicePersonne = (IPersonneService) context.getBean("servicePersonne");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	/*
	 * TESTS UNITAIRES
	 */

	@Test
	public void testAddConsommation() throws Exception {
		Produit pdt1 = serviceProduit.getProduitId(1L);
		Produit pdt2 = serviceProduit.getProduitId(2L);
		Client cl1 = (Client) servicePersonne.getPersonneId(2L);

		Consommation csn1 = new Consommation(1, pdt1, cl1);
		Consommation csn2 = new Consommation(1, pdt2, cl1);

		serviceConso.addConsommation(csn1);
		serviceConso.addConsommation(csn2);

		assertNotNull(serviceConso.getConsommationId(1L));
		assertNotNull(serviceConso.getConsommationId(2L));

	}

	// @Test
	// public void testGetConsommationId() {
	// fail("Not yet implemented"); // TODO
	// }
	//
	// @Test
	// public void testGetConsommation() {
	// fail("Not yet implemented"); // TODO
	// }
	//
	// @Test
	// public void testUpdateConsommation() {
	// fail("Not yet implemented"); // TODO
	// }
	//
	// @Test
	// public void testDeleteConsommation() {
	// fail("Not yet implemented"); // TODO
	// }
	//
	// @Test
	// public void testCalculerCoutProduit() {
	// fail("Not yet implemented"); // TODO
	// }

}
