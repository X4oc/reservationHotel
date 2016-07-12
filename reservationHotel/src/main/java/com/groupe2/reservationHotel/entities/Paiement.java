package com.groupe2.reservationHotel.entities;
/* Classe : Paiement
 * Package : com.groupe2.reservationHotel.entities
 * Author : Philippe
 * Date : 11/07/16
 * Version : 1.0.0
 */
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Paiement",discriminatorType=DiscriminatorType.STRING)
@Entity
public abstract class Paiement {
	
	/* attributs */
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPaiement;
	
	@Temporal(TemporalType.DATE)
	private Date datePaiement;
	
	/* associations */
	@OneToOne
	@JoinColumn(name="paie")
	private Facture facture;
	
	/* constructeur par defaut */
	public Paiement() {
		super();
	}

	/* constructeur avec parametres */
	public Paiement(Date datePaiement) {
		super();
		this.datePaiement = datePaiement;
	}

	/* accesseurs */
	public Long getIdPaiement() {
		return idPaiement;
	}

	public void setIdPaiement(Long idPaiement) {
		this.idPaiement = idPaiement;
	}

	public Date getDatePaiement() {
		return datePaiement;
	}

	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}

	/* redefinition de toString */
	@Override
	public String toString() {
		return "Paiement [idPaiement=" + idPaiement + ", datePaiement=" + datePaiement + "]";
	}
	
	
}
