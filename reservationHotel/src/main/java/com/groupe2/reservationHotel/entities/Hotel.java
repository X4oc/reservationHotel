package com.groupe2.reservationHotel.entities;
/* Classe : Hotel
 * Package : com.groupe2.reservationHotel.entities
 * Author : Philippe
 * Date : 11/07/16
 * Version : 1.0.0
 */
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@DiscriminatorColumn(name="Hotel", discriminatorType=DiscriminatorType.STRING)
@Entity
public class Hotel {
	/* attributs */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idHotel;
	private String nomHotel;
	private String adrHotel;
	private Integer classeHotel;
	private String numeroTelephone;
	private String numeroFax;
	private String codePostal;
	private String pays;
	private String adresseMail;
	
	/* associations */
	@OneToMany (mappedBy = "hotel", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Facture> factures;
	
	@OneToMany (mappedBy = "hotel", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Personne> personnes;
	
	@OneToMany (mappedBy = "hotel", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Chambre> chambres;
	
	/* constructeur par defaut */
	public Hotel() {
		super();
	}

	/* constructeur avec parametres */
	public Hotel(String nomHotel, String adrHotel, Integer classeHotel, String numeroTelephone, String numeroFax,
			String codePostal, String pays, String adresseMail) {
		super();
		this.nomHotel = nomHotel;
		this.adrHotel = adrHotel;
		this.classeHotel = classeHotel;
		this.numeroTelephone = numeroTelephone;
		this.numeroFax = numeroFax;
		this.codePostal = codePostal;
		this.pays = pays;
		this.adresseMail = adresseMail;
	}

	/* accesseurs */
	public Long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}

	public String getNomHotel() {
		return nomHotel;
	}

	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}

	public String getAdrHotel() {
		return adrHotel;
	}

	public void setAdrHotel(String adrHotel) {
		this.adrHotel = adrHotel;
	}

	public Integer getClasseHotel() {
		return classeHotel;
	}

	public void setClasseHotel(Integer classeHotel) {
		this.classeHotel = classeHotel;
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public String getNumeroFax() {
		return numeroFax;
	}

	public void setNumeroFax(String numeroFax) {
		this.numeroFax = numeroFax;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	public List<Facture> getFactures() {
		return factures;
	}

	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}

	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	public List<Chambre> getChambres() {
		return chambres;
	}

	public void setChambres(List<Chambre> chambres) {
		this.chambres = chambres;
	}

	/* redefinition de toSTring */
	@Override
	public String toString() {
		return "Hotel [idHotel=" + idHotel + ", nomHotel=" + nomHotel + ", adrHotel=" + adrHotel + ", classeHotel="
				+ classeHotel + ", numeroTelephone=" + numeroTelephone + ", numeroFax=" + numeroFax + ", codePostal="
				+ codePostal + ", pays=" + pays + ", adresseMail=" + adresseMail + "]";
	}

}
