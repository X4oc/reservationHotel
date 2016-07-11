package com.groupe2.reservationHotel.entities;
/* Classe : Espece
 * Package : com.groupe2.reservationHotel.entities
 * Author : Philippe
 * Date : 11/07/16
 * Version : 1.0.0
 */
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ESPECE")
public class Espece extends Paiement{

	/* constructeur par defaut */
	public Espece() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* constructeur avec parametres */
	public Espece(Date datePaiement) {
		super(datePaiement);
		// TODO Auto-generated constructor stub
	}

}
