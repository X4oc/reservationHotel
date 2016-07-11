package com.groupe2.reservationHotel.daoChambre;

import java.util.List;

import com.groupe2.reservationHotel.entities.Chambre;
import com.groupe2.reservationHotel.entities.Doubles;
import com.groupe2.reservationHotel.entities.Simple;
import com.groupe2.reservationHotel.entities.Suite;

/**
 * Nom de l'interface : IChambreDao
 * package com.groupe2.reservationHotel.daoChambre;
 * @author Grégoire RAYNAUD
 * Date : 11/07/2016
 */
public interface IChambreDao {

	//Méthodes CRUD
	public Chambre addSuite(Chambre c);
	public Chambre addSimple(Chambre c);
	public Chambre addDoubles (Chambre c);
	public Chambre updateChambre(Chambre c);
	public Chambre deleteChambre(Long idChambre);
	public Chambre getChambreById(Long idChambre);
	public List<Chambre> getAllChambres();
}
