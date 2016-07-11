package com.groupe2.reservationHotel.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * CLASSE : EMPLOYE
 * MERE : PERSONNE
 * AUTEUR : ERIK DUHEM
 * DATE : 11 07 2016
 * VERSION : 1.0
 */

@Entity
@DiscriminatorValue("Employe")
public class Employe extends Personne {

	/*
	 * ATTRIBUTS
	 */

	@Temporal(TemporalType.DATE)
	private Date dateEntreService;
	private Double salaire;

	/*
	 * GETTERS ET SETTERS
	 */

	public Date getDateEntreService() {
		return dateEntreService;
	}

	public void setDateEntreService(Date dateEntreService) {
		this.dateEntreService = dateEntreService;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	/*
	 * CONSTRUCTEURS
	 */

	public Employe() {
		super();
	}

	public Employe(String nomPersonne, String prenomPersonne, Date dateDeNaissance, String adrPersonne,
			String adrMailPersonne, String numeroTelephone, Date dateEntreService, Double salaire) {
		super(nomPersonne, prenomPersonne, dateDeNaissance, adrPersonne, adrMailPersonne, numeroTelephone);
		this.dateEntreService = dateEntreService;
		this.salaire = salaire;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.groupe2.reservationHotel.entities.Personne#toString()
	 */

	@Override
	public String toString() {
		return "Employe [dateEntreService=" + dateEntreService + ", salaire=" + salaire + "]";
	}

}
