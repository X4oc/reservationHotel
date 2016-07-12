package com.groupe2.reservationHotel.daoConsommation;

import java.util.List;

import com.groupe2.reservationHotel.entities.Consommation;
import com.groupe2.reservationHotel.exceptions.RechercheConsommationException;

/*
 * INTERFACE : ICONSOMMATIONDAO
 * AUTEUR : ERIK DUHEM
 * DATE : 11 07 2016
 * VERISON : 1.0
 */

public interface IConsommationDao {
	
	/*
	 * CRUD
	 */

	public Consommation addConsommation(Consommation cn) throws RechercheConsommationException;

	public Consommation getConsommationId(Long idConsommation) throws RechercheConsommationException;

	public List<Consommation> getConsommation();

	public Consommation updateConsommation(Consommation cn);

	public Consommation deleteConsommation(Long idConsommation) throws RechercheConsommationException;

	/*
	 * METHODES
	 */
	
	public Double calculerCoutProduit(Long idConsommation) throws RechercheConsommationException;
	
}
