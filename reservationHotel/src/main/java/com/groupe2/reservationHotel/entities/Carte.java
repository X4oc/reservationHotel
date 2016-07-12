package com.groupe2.reservationHotel.entities;

import javax.persistence.DiscriminatorValue;
/* Classe : Carte
 * Package : com.groupe2.reservationHotel.entities
 * Author : Philippe
 * Date : 11/07/16
 * Version : 1.0.0
 */
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CARTE")
public class Carte extends Paiement {
	
	/* attributs supplementaires */
	private String typeCarte;
	private String numeroCarte;
	
	/* constructeur par defaut */
	public Carte() {
		super();
	}
	
	/* constructeur avec parametres */
	public Carte(String typeCarte, String numeroCarte) {
		super();
		this.typeCarte = typeCarte;
		this.numeroCarte = numeroCarte;
	}

	/* accesseurs */
	public String getTypeCarte() {
		return typeCarte;
	}

	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}

	public String getNumeroCarte() {
		return numeroCarte;
	}

	public void setNumeroCarte(String numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	/* redefinition de toString */
	@Override
	public String toString() {
		return "Carte [typeCarte=" + typeCarte + ", numeroCarte=" + numeroCarte + "]";
	}
	
	
}
