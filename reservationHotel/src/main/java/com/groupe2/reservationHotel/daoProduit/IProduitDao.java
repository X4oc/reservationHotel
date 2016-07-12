package com.groupe2.reservationHotel.daoProduit;

import java.util.List;

import com.groupe2.reservationHotel.entities.Produit;
import com.groupe2.reservationHotel.exceptions.RechercheProduitException;

/*
 * INTERFACE : IPRODUITDAO
 * AUTEUR : ERIK DUHEM
 * DATE : 11 07 2016
 * VERSION : 1.0
 */

public interface IProduitDao {
	
	public Produit addProduit(Produit pdt);
	
	public Produit getProduitId(Long idProduit) throws RechercheProduitException;
	
	public List<Produit> getProduit();
	
	public Produit updateProduit (Produit pdt);
	
	public Produit deleteProduit (Long idProduit) throws RechercheProduitException;
	
	public void getProduitsStock();

}
