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
import com.groupe2.reservationHotel.exceptions.RechercheConsommationException;
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

	//	@Test
	//	public void testAddConsommation() throws Exception {
	// Produit pdt1 = serviceProduit.getProduitId(1L);
	// Produit pdt2 = serviceProduit.getProduitId(2L);
	// Produit pdt3 = serviceProduit.getProduitId(3L);
	// Produit pdt4 = serviceProduit.getProduitId(4L);
	// Client cl1 = servicePersonne.getClientId(1L);
	// Client cl2 = servicePersonne.getClientId(2L);
	// Consommation csn1 = new Consommation(1, pdt1, cl1);
	// Consommation csn2 = new Consommation(3, pdt1, cl1);
	// Consommation csn3 = new Consommation(1, pdt2, cl1);
	// Consommation csn4 = new Consommation(6, pdt3, cl1);
	// Consommation csn5 = new Consommation(10, pdt4, cl2);
	// serviceConso.addConsommation(csn1);
	// serviceConso.addConsommation(csn2);
	// serviceConso.addConsommation(csn3);
	// serviceConso.addConsommation(csn4);
	// serviceConso.addConsommation(csn5);
	// }

	// @Test
	// public void testGetConsommationId() throws Exception {
	// assertNotNull(serviceConso.getConsommationId(1L));
	// assertNotNull(serviceConso.getConsommationId(2L));
	// }
	//
	// @Test
	// public void testGetConsommation() {
	// assertNotNull(serviceConso.getConsommation());
	// }
	//
	// @Test
	// public void testUpdateConsommation() throws Exception {
	// Consommation csn = serviceConso.getConsommationId(1L);
	// logger.info("Ancien client : "+ csn.getClient().getNomPersonne());
	// csn.setClient(servicePersonne.getClientId(4L));
	// serviceConso.updateConsommation(csn);
	// logger.info("Nouveau client : " +
	// serviceConso.getConsommationId(1L).getClient().getNomPersonne());
	// }
	//
	// @Test
	// public void testDeleteConsommation() throws Exception {
	// serviceConso.deleteConsommation(2L);
	// assertNull(serviceConso.getConsommationId(2L));
	// }
	//
	
//	@Test
//	public void testCalculerCoutProduit() throws Exception {
//		Double coutConso = serviceConso.calculerCoutProduit(7L);
//		logger.info("Cout global de la conso : " + coutConso + " $ ");
//		assertNotNull(coutConso);
//	}

}
