package com.groupe2.reservationHotel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.groupe2.reservationHotel.entities.Consommation;
import com.groupe2.reservationHotel.modeles.ConsommationModele;
import com.groupe2.reservationHotel.serviceConsommation.IConsommationService;

@Controller
public class ConsommationController {
	
	private static final Logger logger = LoggerFactory.getLogger(Consommation.class);
	
	@Autowired
	private IConsommationService consommationService;
	
	@RequestMapping(value="/indexConsommation", method = RequestMethod.GET)
	public String indexConsommation(Model model) {
		model.addAttribute("consommationModele", new ConsommationModele());
		return "Consommation";
	}
	
	@RequestMapping(value="/addConsommation")
	

}
