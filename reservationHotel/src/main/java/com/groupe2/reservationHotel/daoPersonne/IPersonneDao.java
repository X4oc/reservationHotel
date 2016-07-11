package com.groupe2.reservationHotel.daoPersonne;

import java.util.List;

import com.groupe2.reservationHotel.entities.Personne;
import com.groupe2.reservationHotel.exceptions.RechercheHotelException;
import com.groupe2.reservationHotel.exceptions.RecherchePersonneException;

/*
 * INTERFACE : IPERSONNEDAO
 * AUTEUR : ERIK DUHEM
 * DATE : 11 07 2016
 * VERSION : 1.0
 */

public interface IPersonneDao {

	public Personne addPersonne(Personne p, Long idHotel) throws RechercheHotelException;

	public Personne getPersonneId(Long idPersonne) throws RecherchePersonneException;

	public List<Personne> getPersonne();

	public List<Personne> getPersonneByMc(String mc);

	public Personne updatePersonne(Personne p);

	public Personne deletePersonne(Long idPersonne) throws RecherchePersonneException;

}
