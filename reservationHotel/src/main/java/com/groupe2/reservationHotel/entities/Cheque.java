package com.groupe2.reservationHotel.entities;

import javax.persistence.DiscriminatorValue;
/* Classe : Cheque
 * Package : com.groupe2.reservationHotel.entities
 * Author : Philippe
 * Date : 11/07/16
 * Version : 1.0.0
 */
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CHEQUE")
public class Cheque extends Paiement{
	
	/* attributs supplementaires */
	private String numeroCheque;

	/* constructeur par defaut */
	public Cheque() {
		super();
	}

	/* constructeur avec parametres */
	public Cheque(String numeroCheque) {
		super();
		this.numeroCheque = numeroCheque;
	}

	/* accesseurs */
	public String getNumeroCheque() {
		return numeroCheque;
	}

	public void setNumeroCheque(String numeroCheque) {
		this.numeroCheque = numeroCheque;
	}

	/* redefinition de toString */
	@Override
	public String toString() {
		return "Cheque [numeroCheque=" + numeroCheque + "]";
	}
	
	
}
