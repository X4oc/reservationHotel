package com.groupe2.reservationHotel.entities;

import java.util.Date;
import java.util.List;
import com.groupe2.reservationHotel.entities.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reservation {

	//Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReservation;
	@Temporal(TemporalType.DATE)
	private Date dateArrivee;
	@Temporal(TemporalType.DATE)
	private Date dateSortie;
	@ManyToOne
	@JoinColumn(name="listeDesReservations")
	private Chambre chambre;
	@ManyToOne
	@JoinColumn(name="listeDesReservations")
	private Client client;
	@OneToMany (mappedBy="reservation")
	private List<Consommation> listeDesConsommation;
	
	//Constructeurs
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservation(Date dateArrivee, Date dateSortie) {
		super();
		this.dateArrivee = dateArrivee;
		this.dateSortie = dateSortie;
	}

	//Accesseurs
	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public Chambre getChambre() {
		return chambre;
	}

	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Consommation> getListeDesConsommation() {
		return listeDesConsommation;
	}

	public void setListeDesConsommation(List<Consommation> listeDesConsommation) {
		this.listeDesConsommation = listeDesConsommation;
	}

	
	
	
	
}
