package com.groupe2.reservationHotel.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Nom  de la classe : Double hérite de Chambre
 * package com.groupe2.reservationHotel.entities;
 * @author Grégoire RAYNAUD
 * Date : 11/07/2016
 */
@Entity
@DiscriminatorValue("DOUBLE")
public class Doubles extends Chambre{

	//Constructeurs
	public Doubles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doubles(Integer numeroChambre, Double prix, Double surface, Integer etage,
			Integer nombrePiece, Integer nombreLit) {
		super(numeroChambre, prix, surface, etage, nombrePiece, nombreLit);
		// TODO Auto-generated constructor stub
	}
}
