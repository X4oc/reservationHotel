package com.groupe2.reservationHotel.serviceFacture;

import java.util.List;

import com.groupe2.reservationHotel.entities.Facture;
import com.groupe2.reservationHotel.exceptions.RechercheFactureException;

public interface IFactureService {
	/* methodes CRUD */
	public Facture addFacture(Facture facture);
	public Facture deleteFacture(Long idFacture);
	public Facture updateFacture(Facture facture);
	public Facture getFacture(Long idFacture) throws RechercheFactureException;
	public List<Facture> getFactures();
}
