package com.groupe2.reservationHotel.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/*
 * CLASSE : PRODUIT
 * AUTEUR : ERIK DUHEM
 * DATE : 11 07 2016
 * VERSION : 1.0
 */

@Entity
public class Produit {

	/*
	 * ATTRIBUTS
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduit;

	private Double prixProduit;
	private String nomProduit;
	private String referenceProduit;
	private Integer quantiteProduit;

	/*
	 * ASSOCIATIONS
	 */

	@OneToMany(mappedBy = "produit", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<Consommation> listeConsommation = new ArrayList<Consommation>();

	/*
	 * GETTERS ET SETTERS
	 */

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public Double getPrixProduit() {
		return prixProduit;
	}

	public void setPrixProduit(Double prixProduit) {
		this.prixProduit = prixProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public String getReferenceProduit() {
		return referenceProduit;
	}

	public void setReferenceProduit(String referenceProduit) {
		this.referenceProduit = referenceProduit;
	}

	public Integer getQuantiteProduit() {
		return quantiteProduit;
	}

	public void setQuantiteProduit(Integer quantiteProduit) {
		this.quantiteProduit = quantiteProduit;
	}
	
	public List<Consommation> getListeConsommation() {
		return listeConsommation;
	}

	public void setListeConsommation(List<Consommation> listeConsommation) {
		this.listeConsommation = listeConsommation;
	}

	/*
	 * CONSTRUCTEURS
	 */

	public Produit() {
		super();
	}

	public Produit(Double prixProduit, String nomProduit, String referenceProduit, Integer quantiteProduit) {
		super();
		this.prixProduit = prixProduit;
		this.nomProduit = nomProduit;
		this.referenceProduit = referenceProduit;
		this.quantiteProduit = quantiteProduit;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", prixProduit=" + prixProduit + ", nomProduit=" + nomProduit
				+ ", referenceProduit=" + referenceProduit + ", quantiteProduit=" + quantiteProduit + "]";
	}

}
