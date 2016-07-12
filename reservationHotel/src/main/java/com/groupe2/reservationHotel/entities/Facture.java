package com.groupe2.reservationHotel.entities;
/* Classe : Facture
 * Package : com.groupe2.reservationHotel.entities
 * Author : Philippe
 * Date : 11/07/16
 * Version : 1.0.0
 */
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@DiscriminatorColumn(name="Facture",discriminatorType=DiscriminatorType.STRING)
@Entity
public class Facture {
	
	/* attributs */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFacture;
	
	@Temporal(TemporalType.DATE)
	private Date dateFacturation;
	
	private Double tva;
	
	@OneToMany
	@JoinColumn(name="idReservation")
	private List<Reservation> reservations;
	
	/* constructeur par defaut */
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/* constructeur avec parametres */
	public Facture(Date dateFacturation, Double tva) {
		super();
		this.dateFacturation = dateFacturation;
		this.tva = tva;
	}
	
	/* accesseurs */
	public Long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}
	public Date getDateFacturation() {
		return dateFacturation;
	}
	public void setDateFacturation(Date dateFacturation) {
		this.dateFacturation = dateFacturation;
	}
	public Double getTva() {
		return tva;
	}
	public void setTva(Double tva) {
		this.tva = tva;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	/* redefinition de toString */
	@Override
	public String toString() {
		return "Facture [idFacture=" + idFacture + ", dateFacturation=" + dateFacturation + ", tva=" + tva + "]";
	}
	
	
}
