package com.groupe2.reservationHotel.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/*
 * CLASSE : EMPLOYE
 * MERE : EMPLOYE
 * AUTEUR : ERIK DUHEM
 * DATE : 11 07 2016
 * VERSION : 1.0
 */

@Entity
@DiscriminatorValue("Contractuel")
public class Contractuel extends Employe {

	/*
	 * ATTRIBUTS
	 */

	private Double prime;

	/*
	 * ASSOCIATIONS
	 */

	/*
	 * GETTERS ET SETTERS
	 */

	public Double getPrime() {
		return prime;
	}

	public void setPrime(Double prime) {
		this.prime = prime;
	}

	/*
	 * CONSTRUCTEURS
	 */

	public Contractuel() {
		super();
	}

	public Contractuel(String nomPersonne, String prenomPersonne, Date dateDeNaissance, String adrPersonne,
			String adrMailPersonne, String numeroTelephone, Date dateEntreService, Double salaire, Double prime) {
		super(nomPersonne, prenomPersonne, dateDeNaissance, adrPersonne, adrMailPersonne, numeroTelephone,
				dateEntreService, salaire);
		this.prime = prime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.groupe2.reservationHotel.entities.Employe#toString()
	 */

	@Override
	public String toString() {
		return "Contractuel [prime=" + prime + "]";
	}

}
