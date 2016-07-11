package com.groupe2.reservationHotel.daoChambre;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.groupe2.reservationHotel.entities.Chambre;
import com.groupe2.reservationHotel.entities.Doubles;
import com.groupe2.reservationHotel.entities.Simple;
import com.groupe2.reservationHotel.entities.Suite;

/**
 * Nom de la classe : ChambreDaoImpl implémente IChambreDao
 * package com.groupe2.reservationHotel.daoChambre;
 * @author Grégoire RAYNAUD
 * Date 11/07/2016
 */
public class ChambreDaoImpl implements IChambreDao{

	Logger log = Logger.getLogger("ChambreDaoImpl");
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Chambre addSuite(Chambre c) {
		em.persist(c);
		log.info("La chambre n°"+c.getNumeroChambre()+" a bien été ajoutée");
		return c;
	}

	@Override
	public Chambre addSimple(Chambre c) {
		em.persist(c);
		log.info("La chambre n°"+c.getNumeroChambre()+" a bien été ajoutée");
		return c;
	}

	@Override
	public Chambre addDoubles(Chambre c) {
		em.persist(c);
		log.info("La chambre n°"+c.getNumeroChambre()+" a bien été ajoutée");
		return c;
	}

	@Override
	public Chambre updateChambre(Chambre c) {
		em.merge(c);
		log.info("La chambre n°"+c.getNumeroChambre()+" a bien été modifiée");
		return c;
	}
	
	@Override
	public Chambre deleteChambre(Long idChambre) {
		Chambre c = em.find(Chambre.class, idChambre);
		em.remove(c);
		log.info("La chambre n°"+c.getNumeroChambre()+" a bien été supprimée");
		return c;
	}

	@Override
	public Chambre getChambreById(Long idChambre) {
		Chambre c = em.find(Chambre.class, idChambre);
		log.info("La chambre n°"+c.getNumeroChambre()+" a bien été trouvée");
		return c;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Chambre> getAllChambres() {
		Query query = em.createQuery("from Chambre");
		log.info("La liste de chambres a bien été trouvée");
		return query.getResultList();
	}
	

}
