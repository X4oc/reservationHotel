package com.groupe2.reservationHotel.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * CLASSE : CLIENT
 * MERE : PERSONNE
 * AUTEUR : ERIK DUHEM
 * DATE : 11 07 2016
 * VERSION : 1.0
 */

@Entity
@DiscriminatorValue("Client")
public class Client extends Personne {

	/*
	 * ATTRIBUTS
	 */

	@Temporal(TemporalType.DATE)
	private Date dateInscription;
	private Integer nombreReservation;
	private Double reduction;

	/*
	 * ASSOCIATIONS
	 */

	@OneToMany(mappedBy = "listeDesReservation", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<Reservation> reservation = new ArrayList<Reservation>();

	@OneToMany(mappedBy = "client", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<Consommation> consommation = new ArrayList<Consommation>();

	/*
	 * GETTERS ET SETTERS
	 */

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public int getNombreReservation() {
		return nombreReservation;
	}

	public void setNombreReservation(Integer nombreReservation) {
		this.nombreReservation = nombreReservation;
	}

	public double getReduction() {
		return reduction;
	}

	public void setReduction(Double reduction) {
		this.reduction = reduction;
	}

	public List<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}

	public List<Consommation> getConsommation() {
		return consommation;
	}

	public void setConsommation(List<Consommation> consommation) {
		this.consommation = consommation;
	}

	/*
	 * CONSTRUCTEURS
	 */

	public Client() {
		super();
	}

	public Client(String nomPersonne, String prenomPersonne, Date dateDeNaissance, String adrPersonne,
			String adrMailPersonne, String numeroTelephone, Date dateInscription, Integer nombreReservation,
			Double reduction) {
		super(nomPersonne, prenomPersonne, dateDeNaissance, adrPersonne, adrMailPersonne, numeroTelephone);
		this.dateInscription = dateInscription;
		this.nombreReservation = nombreReservation;
		this.reduction = reduction;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.groupe2.reservationHotel.entities.Personne#toString()
	 */

	@Override
	public String toString() {
		return "Client [dateInscription=" + dateInscription + ", nombreReservation=" + nombreReservation
				+ ", reduction=" + reduction + "]";
	}

}
