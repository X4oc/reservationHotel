package com.groupe2.reservationHotel.serviceProduit;

import java.util.List;

import com.groupe2.reservationHotel.entities.Produit;
import com.groupe2.reservationHotel.exceptions.RechercheProduitException;

/*
 * INTERFACE : IPRODUITSERVICE
 * AUTEUR : ERIK DUHEM
 * DATE : 11 07 2016
 * VERSION : 1.0
 */

public interface IProduitService {

	public Produit addProduit(Produit pdt);

	public Produit getProduitId(Long idProduit) throws RechercheProduitException;

	public List<Produit> getProduit();

	public Produit updateProduit(Produit pdt);

	public Produit deleteProduit(Long idProduit) throws RechercheProduitException;

}
