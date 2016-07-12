package com.groupe2.reservationHotel.entities;

import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Nom  de la classe : Chambre
 * package com.groupe2.reservationHotel.entities;
 * @author Gregoire RAYNAUD
 * Date : 11/07/2016
 */
@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType=DiscriminatorType.STRING,name="TYPE_CHAMBRE")
public class Chambre {

	//Attributs
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idChambre;
	private Integer numeroChambre;
	protected Double prix;
	protected Double surface;
	private Integer etage;
	protected Integer nombrePiece;
	protected Integer nombreLit;
	
	//Associations
	@OneToMany(mappedBy= "chambre")
	private List<Reservation> listeDesReservation;
	@ManyToOne
	@JoinColumn(name="idHotel")
	private Hotel hotel;
	
	
	//Constructeurs
	public Chambre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chambre(Integer numeroChambre, Double prix, Double surface, Integer etage,
			Integer nombrePiece, Integer nombreLit) {
		super();
		this.prix = prix;
		this.surface = surface;
		this.etage = etage;
		this.nombrePiece = nombrePiece;
		this.nombreLit = nombreLit;
	}

	//Accesseurs
	public Long getIdChambre() {
		return idChambre;
	}
	public void setIdChambre(Long idChambre) {
		this.idChambre = idChambre;
	}
	
	public Integer getNumeroChambre() {
		return numeroChambre;
	}

	public void setNumeroChambre(Integer numeroChambre) {
		this.numeroChambre = numeroChambre;
	}

	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public Double getSurface() {
		return surface;
	}
	public void setSurface(Double surface) {
		this.surface = surface;
	}
	public Integer getEtage() {
		return etage;
	}
	public void setEtage(Integer etage) {
		this.etage = etage;
	}
	public Integer getNombrePiece() {
		return nombrePiece;
	}
	public void setNombrePiece(Integer nombrePiece) {
		this.nombrePiece = nombrePiece;
	}
	public Integer getNombreLit() {
		return nombreLit;
	}
	public void setNombreLit(Integer nombreLit) {
		this.nombreLit = nombreLit;
	}
	public List<Reservation> getListeDesReservation() {
		return listeDesReservation;
	}
	public void setListeDesReservation(List<Reservation> listeDesReservation) {
		this.listeDesReservation = listeDesReservation;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}	
	
}
