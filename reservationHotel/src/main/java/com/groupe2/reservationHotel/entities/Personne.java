package com.groupe2.reservationHotel.entities;

import java.util.ArrayList;
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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/*
 * CLASSE : PERSONNE
 * AUTEUR : ERIK DUHEM
 * DATE : 11 07 2016
 * VERSION : 1.0
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typePersonne", discriminatorType = DiscriminatorType.STRING)
public class Personne {

	/*
	 * ATTRIBUTS
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPersonne;

	private String nomPersonne;
	private String prenomPersonne;
	private Date dateDeNaissance;
	private String adrPersonne;
	private String adrMailPersonne;
	private String numeroTelephone;

	/*
	 * ASSOCIATIONS
	 */

	@ManyToOne
	@JoinColumn(name = "idHotel")
	private Hotel hotel;

//	@OneToMany(mappedBy = "client", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, orphanRemoval = true)
//	private List<Consommation> consommation = new ArrayList<Consommation>();

	/*
	 * GETTERS ET SETTERS
	 */

	public Long getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(Long idPersonne) {
		this.idPersonne = idPersonne;
	}

	public String getNomPersonne() {
		return nomPersonne;
	}

	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}

	public String getPrenomPersonne() {
		return prenomPersonne;
	}

	public void setPrenomPersonne(String prenomPersonne) {
		this.prenomPersonne = prenomPersonne;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getAdrPersonne() {
		return adrPersonne;
	}

	public void setAdrPersonne(String adrPersonne) {
		this.adrPersonne = adrPersonne;
	}

	public String getAdrMailPersonne() {
		return adrMailPersonne;
	}

	public void setAdrMailPersonne(String adrMailPersonne) {
		this.adrMailPersonne = adrMailPersonne;
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public Hotel getHotel() {
		return hotel;
	}

//	public List<Consommation> getConsommation() {
//		return consommation;
//	}
//
//	public void setConsommation(List<Consommation> consommation) {
//		this.consommation = consommation;
//	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	/*
	 * CONSTRUCTEURS
	 */

	public Personne() {
		super();
	}

	public Personne(String nomPersonne, String prenomPersonne, Date dateDeNaissance, String adrPersonne,
			String adrMailPersonne, String numeroTelephone) {
		super();
		this.nomPersonne = nomPersonne;
		this.prenomPersonne = prenomPersonne;
		this.dateDeNaissance = dateDeNaissance;
		this.adrPersonne = adrPersonne;
		this.adrMailPersonne = adrMailPersonne;
		this.numeroTelephone = numeroTelephone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "Personne [idPersonne=" + idPersonne + ", nomPersonne=" + nomPersonne + ", prenomPersonne="
				+ prenomPersonne + ", dateDeNaissance=" + dateDeNaissance + ", adrPersonne=" + adrPersonne
				+ ", adrMailPersonne=" + adrMailPersonne + ", numeroTelephone=" + numeroTelephone + "]";
	}

}
