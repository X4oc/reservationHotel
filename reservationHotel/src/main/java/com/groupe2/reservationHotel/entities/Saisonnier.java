package com.groupe2.reservationHotel.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * CLASSE : SAISONNIER
 * MERE : EMPLOYE
 * AUTEUR : ERIK DUHEM
 * DATE : 11 07 2016
 * VERSION : 1.0
 */

@Entity
@DiscriminatorValue("Saisonnier")
public class Saisonnier extends Employe {

	/*
	 * ATTRIBUTS
	 */

	@Temporal(TemporalType.DATE)
	private Date dateSortieService;

	/*
	 * GETTERS ET SETTERS
	 */

	public Date getDateSortieService() {
		return dateSortieService;
	}

	public void setDateSortieService(Date dateSortieService) {
		this.dateSortieService = dateSortieService;
	}

	/*
	 * CONSTRUCTEURS
	 */

	public Saisonnier() {
		super();
	}

	public Saisonnier(String nomPersonne, String prenomPersonne, Date dateDeNaissance, String adrPersonne,
			String adrMailPersonne, String numeroTelephone, Date dateEntreService, Double salaire,
			Date dateSortieService) {
		super(nomPersonne, prenomPersonne, dateDeNaissance, adrPersonne, adrMailPersonne, numeroTelephone,
				dateEntreService, salaire);
		this.dateSortieService = dateSortieService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.groupe2.reservationHotel.entities.Employe#toString()
	 */

	@Override
	public String toString() {
		return "Saisonnier [dateSortieService=" + dateSortieService + "]";
	}

}
