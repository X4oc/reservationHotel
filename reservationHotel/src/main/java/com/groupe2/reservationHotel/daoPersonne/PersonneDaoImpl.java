package com.groupe2.reservationHotel.daoPersonne;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.groupe2.reservationHotel.entities.Hotel;
import com.groupe2.reservationHotel.entities.Personne;
import com.groupe2.reservationHotel.exceptions.RechercheHotelException;
import com.groupe2.reservationHotel.exceptions.RecherchePersonneException;

/*
 * CLASSE : PERSONNEDAOIMPL
 * AUTEUR : ERIK DUHEM
 * DATE : 11 07 2016
 * VERSION : 1.0
 */

public class PersonneDaoImpl implements IPersonneDao {

	/*
	 * ATTRIBUTS
	 */

	Logger log = Logger.getLogger("PersonneDaoImpl");

	@PersistenceContext
	private EntityManager em;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.daoPersonne.IPersonneDao#addPersonne(com.
	 * groupe2.reservationHotel.entities.Personne)
	 */

	@Override
	public Personne addPersonne(Personne p, Long idHotel) throws RechercheHotelException {
		Hotel ht = em.find(Hotel.class, idHotel);

		if (ht == null) {
			throw new RechercheHotelException("L'hotel " + idHotel + " n' a pas été trouvé!");
		}

		p.setHotel(ht);
		em.persist(p);
		log.info("La personne " + p.getIdPersonne() + p.getNomPersonne() + " a bien été crée!");
		return p;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.daoPersonne.IPersonneDao#getPersonneId(java.
	 * lang.Long)
	 */

	@Override
	public Personne getPersonneId(Long idPersonne) throws RecherchePersonneException {
		Personne p = em.find(Personne.class, idPersonne);

		if (p == null) {
			throw new RecherchePersonneException("La personne " + idPersonne + " n'a pas été trouvée!");
		}

		log.info("La personne " + p.getIdPersonne() + p.getNomPersonne() + " a bien été trouvée!");
		return p;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.groupe2.reservationHotel.daoPersonne.IPersonneDao#getPersonne()
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<Personne> getPersonne() {
		Query req = em.createQuery("from Personne");
		log.info("La liste des personnes est de : " + req.getResultList().size() + " personnes.");
		return req.getResultList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.daoPersonne.IPersonneDao#getPersonneByMc(
	 * java.lang.String)
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<Personne> getPersonneByMc(String mc) {
		Query req = em.createQuery("from Personne p where p.nomPersonne like:s");
		req.setParameter("s", "%" + mc + "%");
		log.info("Il existe " + req.getResultList().size() + " personne(s) par mots clés : " + mc);
		return req.getResultList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.daoPersonne.IPersonneDao#updatePersonne(com.
	 * groupe2.reservationHotel.entities.Personne)
	 */

	@Override
	public Personne updatePersonne(Personne p) {
		em.merge(p);
		log.info("La personne " + p.getIdPersonne() + " a bien été mis a jour!");
		return p;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.daoPersonne.IPersonneDao#deletePersonne(java
	 * .lang.Long)
	 */

	@Override
	public Personne deletePersonne(Long idPersonne) throws RecherchePersonneException {
		Personne p = em.find(Personne.class, idPersonne);

		if (p == null) {
			throw new RecherchePersonneException("La personne " + idPersonne + " n'a pas été trouvée!");
		}

		em.remove(p);
		log.info("La personne " + p.getIdPersonne() + p.getNomPersonne() + " a bien été supprimée!");
		return p;
	}

}
