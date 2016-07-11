package com.groupe2.reservationHotel.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Nom  de la classe : Double h�rite de Chambre
 * package com.groupe2.reservationHotel.entities;
 * @author Gr�goire RAYNAUD
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
