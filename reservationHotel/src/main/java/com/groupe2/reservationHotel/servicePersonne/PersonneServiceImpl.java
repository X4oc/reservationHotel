package com.groupe2.reservationHotel.servicePersonne;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.groupe2.reservationHotel.daoPersonne.IPersonneDao;
import com.groupe2.reservationHotel.entities.Personne;
import com.groupe2.reservationHotel.exceptions.RechercheHotelException;
import com.groupe2.reservationHotel.exceptions.RecherchePersonneException;

/*
 * CLASSE : PERSONNESERVICEIMPL
 * AUTEUR : ERIK DUHEM
 * DATE : 11 07 2016
 * VERSION : 1.0
 */

@Transactional
public class PersonneServiceImpl implements IPersonneService {

	/*
	 * ATTRIBUTS
	 */

	private IPersonneDao dao;
	Logger logger = Logger.getLogger("PersonneServiceImpl");

	/*
	 * GETTERS ET SETTERS
	 */

	public IPersonneDao getDao() {
		return dao;
	}

	public void setDao(IPersonneDao dao) {
		this.dao = dao;
		logger.info("<---------- daoPersonne injectée  -------->");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.servicePersonne.IPersonneService#addPersonne
	 * (com.groupe2.reservationHotel.entities.Personne)
	 */

	@Override
	public Personne addPersonne(Personne p, Long idHotel) throws RechercheHotelException {
		return this.dao.addPersonne(p, idHotel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.groupe2.reservationHotel.servicePersonne.IPersonneService#
	 * getPersonneId(java.lang.Long)
	 */

	@Override
	public Personne getPersonneId(Long idPersonne) throws RecherchePersonneException {
		return this.dao.getPersonneId(idPersonne);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.servicePersonne.IPersonneService#getPersonne
	 * ()
	 */

	@Override
	public List<Personne> getPersonne() {
		return this.dao.getPersonne();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.groupe2.reservationHotel.servicePersonne.IPersonneService#
	 * getPersonneByMc(java.lang.String)
	 */

	@Override
	public List<Personne> getPersonneByMc(String mc) {
		return this.dao.getPersonneByMc(mc);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.groupe2.reservationHotel.servicePersonne.IPersonneService#
	 * updatePersonne(com.groupe2.reservationHotel.entities.Personne)
	 */

	@Override
	public Personne updatePersonne(Personne p) {
		return this.dao.updatePersonne(p);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.groupe2.reservationHotel.servicePersonne.IPersonneService#
	 * deletePersonne(java.lang.Long)
	 */

	@Override
	public Personne deletePersonne(Long idPersonne) throws RecherchePersonneException {
		return this.dao.deletePersonne(idPersonne);
	}

}
