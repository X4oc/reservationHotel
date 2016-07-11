package com.groupe2.reservationHotel.serviceChambre;

import java.util.Date;
import java.util.List;

import com.groupe2.reservationHotel.entities.Chambre;

/**
 * Nom de l'interface : IChambreService
 * package com.groupe2.reservationHotel.serviceChambre;
 * @author Gregoire RAYNAUD
 * Date : 11/07/2016
 */
public interface IChambreService {

	//M�thodes CRUD
		public Chambre addSuite(Chambre c);
		public Chambre addSimple(Chambre c);
		public Chambre addDoubles (Chambre c);
		public Chambre updateChambre(Chambre c);
		public Chambre deleteChambre(Long idChambre);
		public Chambre getChambreById(Long idChambre);
		public List<Chambre> getAllChambres();
		
	//Autres m�thodes
		public boolean estDisponible (Chambre c, Date dateDebut, Date dateFin);
		public List<Chambre> chambreDisponibles(Date dateDebut, Date dateFin);
}
