package com.groupe2.reservationHotel;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.groupe2.reservationHotel.entities.Client;
import com.groupe2.reservationHotel.entities.Contractuel;
import com.groupe2.reservationHotel.entities.Employe;
import com.groupe2.reservationHotel.entities.Personne;
import com.groupe2.reservationHotel.entities.Saisonnier;
import com.groupe2.reservationHotel.exceptions.RechercheHotelException;
import com.groupe2.reservationHotel.exceptions.RecherchePersonneException;
import com.groupe2.reservationHotel.servicePersonne.IPersonneService;

/*
 * TEST : PERSONNETESTU
 * AUTEUR : ERIK DUHEM
 * DATE : 12 07 2016
 * VERSION : 1.0
 */

@SuppressWarnings("unused")
public class PersonneTestU {

	/*
	 * ATTRIBUTS ET CONFIGS
	 */

	private static ClassPathXmlApplicationContext context;
	private static IPersonneService service;

	Logger logger = Logger.getLogger("PersonneTestU");

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app.xml");
		service = (IPersonneService) context.getBean("servicePersonne");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	/*
	 * TESTS UNITAIRES
	 */

	@Test
	public void testAddPersonne() throws Exception {
		// Personne p = new Personne("DUDE", "PHINKS", new Date(), "rue des
		// coquelicots", "erik.duhem@gmail.com", "0123456789");
		// logger.info(p.toString());
		// service.addPersonne(p, 1L);
		// assertNotNull(service.getPersonneId(1L));
		//
		Client c1 = new Client("Poncet", "Philippe", new Date(), "rue des blabla", "philippe.poncet@epfedu.fr",
				"012903909", new Date(), 2, 0.);
		Client c2 = new Client("Rouget2", "Bernard", new Date(), "avenue des jambons", "bernardrouget@yahoo.fr",
				"012901006", new Date(), 1, 0.);
		Client c3 = new Client("Rouget3", "Bernard", new Date(), "avenue des jambons", "bernardrouget@yahoo.fr",
				"012901006", new Date(), 1, 0.);
		Client c4 = new Client("Rouget4", "Bernard", new Date(), "avenue des jambons", "bernardrouget@yahoo.fr",
				"012901006", new Date(), 1, 0.);
		logger.info(c1.toString());
		logger.info(c2.toString());
		logger.info(c3.toString());
		logger.info(c4.toString());
		service.addPersonne(c1, 1L);
		service.addPersonne(c2, 1L);
		service.addPersonne(c3, 1L);
		service.addPersonne(c4, 1L);
		// assertNotNull(service.getPersonneId(2L));
		// assertNotNull(service.getPersonneId(3L));

		// Employe ep1 = new Employe("Cook", "Tim", new Date(), "Silicon
		// Valley", "timcook@apple.com", "0989", new Date(), 25000.0);
		// logger.info(ep1.toString());
		// service.addPersonne(ep1, 1L);
		// assertNotNull(service.getPersonneId(4L));

		// Contractuel ctl1 = new Contractuel("Chichenko", "Nicolas", new
		// Date(), "StPierre", "Chichenko.niko@gmail.com", "06123456098", new
		// Date(), 1500.0, 200.0);
		// logger.info(ctl1.toString());
		// service.addPersonne(ctl1, 1L);
		// assertNotNull(service.getPersonneId(5L));

		// Saisonnier san1 = new Saisonnier("Vernon", "Roche", new Date(),
		// "Midkemia", "vernon.roche@striesbleu.fl", "67578966", new Date(),
		// 30000.0, new Date());
		// logger.info(san1.toString());
		// service.addPersonne(san1, 1L);
		// assertNotNull(service.getPersonneId(6L));
	}

	// @Test
	// public void testGetPersonneId() throws Exception {
	// assertNotNull(service.getPersonneId(1L));
	// }

	// @Test
	// public void testGetPersonne() {
	// assertNotNull(service.getPersonne());
	// }

	// @Test
	// public void testGetPersonneByMc() {
	// assertNotNull(service.getPersonneByMc("et"));
	// }

	// @Test
	// public void testUpdatePersonne() throws Exception {
	// Personne p = service.getPersonneId(1L);
	// p.setNomPersonne("Dude");
	// logger.info("Ancien nom : "+ p.getNomPersonne());
	// p.setNomPersonne("Duhem");
	// service.updatePersonne(p);
	// logger.info("Nouveau nom : "+
	// service.getPersonneId(1L).getNomPersonne());
	// }

	// @Test
	// public void testDeletePersonne() throws Exception {
	// service.deletePersonne(3L);
	// assertNull(service.getPersonneId(3L));
	// }

}
