package com.groupe2.reservationHotel;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.groupe2.reservationHotel.entities.Produit;
import com.groupe2.reservationHotel.exceptions.RechercheProduitException;
import com.groupe2.reservationHotel.serviceProduit.IProduitService;

/*
 * TEST : PRODUITTESTU
 * AUTEUR : ERIK DUHEM
 * DATE : 12 07 2016
 * VERSION : 1.0
 */

public class ProduitTestU {
	
	/*
	 * ATTRIBUTS ET CONFIGS
	 */
	
	private static ClassPathXmlApplicationContext context;
	private static IProduitService service;
	
	Logger logger = Logger.getLogger("ProduitTestU");
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app.xml");
		service = (IProduitService) context.getBean("serviceProduit");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}
	
	/*
	 * TESTS UNITAIRES
	 */

//	@Test
//	public void testAddProduit() throws Exception {
//		Produit pdt1 = new Produit(1.05, "Pain au chocolat", "1", 40);
//		Produit pdt2 = new Produit(.95, "Croissants", "2", 30);
//		Produit pdt3 = new Produit(1.40, "Café allongé", "3", 100);
//		Produit pdt4 = new Produit(1.20, "Expresso", "4", 200);
//		logger.info(pdt1.toString());
//		logger.info(pdt2.toString());
//		logger.info(pdt3.toString());
//		logger.info(pdt4.toString());
//		service.addProduit(pdt1);
//		service.addProduit(pdt2);
//		service.addProduit(pdt3);
//		service.addProduit(pdt4);
//		assertNotNull(service.getProduitId(1L));
//		assertNotNull(service.getProduitId(2L));
//		assertNotNull(service.getProduitId(3L));
//		assertNotNull(service.getProduitId(4L));
//	}

//	@Test
//	public void testGetProduitId() throws Exception {
//		assertNotNull(service.getProduitId(1L));
//		assertNotNull(service.getProduitId(2L));
//		assertNotNull(service.getProduitId(3L));
//		assertNotNull(service.getProduitId(4L));
//	}

//	@Test
//	public void testGetProduit() {
//		assertNotNull(service.getProduit());
//	}

//	@Test
//	public void testUpdateProduit() throws Exception {
//		Produit pdt = service.getProduitId(4L);
//		logger.info("Ancien prix du produit : "+pdt.getPrixProduit());
//		pdt.setPrixProduit(1.3);
//		service.updateProduit(pdt);
//		logger.info("Nouveau prix du produit : "+service.getProduitId(4L).getPrixProduit());
//	}

//	@Test
//	public void testDeleteProduit() throws Exception {
//		 service.deleteProduit(4L);
//		 assertNull(service.getProduitId(4L));
//	}

}
