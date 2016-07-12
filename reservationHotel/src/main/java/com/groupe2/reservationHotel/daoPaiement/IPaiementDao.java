package com.groupe2.reservationHotel.daoPaiement;

import java.util.List;

import com.groupe2.reservationHotel.entities.Paiement;
import com.groupe2.reservationHotel.exceptions.RecherchePaiementException;

public interface IPaiementDao {
	/* methodes CRUD */
	public Paiement addPaiement(Paiement paiement);
	public Paiement deletePaiement(Long idPaiement);
	public Paiement updatePaiement(Paiement paiement);
	public Paiement getPaiement(Long idPaiement) throws RecherchePaiementException;
	public List<Paiement> getPaiements();
}
