package com.groupe2.reservationHotel.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/*
 * CLASSE : CONSOMMATION
 * AUTEUR : ERIK DUHEM
 * DATE : 11 07 2016
 * VERSION : 1.0
 */

@Entity
public class Consommation {

	/*
	 * ATTRIBUTS
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idConsommation;

	private Integer quantiteConsommation;

	/*
	 * ASSOCIATIONS
	 */

	@OneToOne
	@JoinColumn(name = "idProduit")
	private Produit produit;

	@OneToOne
	@JoinColumn(name = "idClient")
	private Client client;

	/*
	 * GETTERS ET SETTERS
	 */

	public Long getIdConsommation() {
		return idConsommation;
	}

	public void setIdConsommation(Long idConsommation) {
		this.idConsommation = idConsommation;
	}

	public int getQuantiteConsommation() {
		return quantiteConsommation;
	}

	public void setQuantiteConsommation(Integer quantiteConsommation) {
		this.quantiteConsommation = quantiteConsommation;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	/*
	 * CONSTRUCTEURS
	 */

	public Consommation() {
		super();
	}

	public Consommation(Integer quantiteConsommation) {
		super();
		this.quantiteConsommation = quantiteConsommation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "Consommation [idConsommation=" + idConsommation + ", quantiteConsommation=" + quantiteConsommation
				+ "]";
	}

}
