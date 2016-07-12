package com.groupe2.reservationHotel.serviceConsommation;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.groupe2.reservationHotel.daoConsommation.IConsommationDao;
import com.groupe2.reservationHotel.entities.Consommation;
import com.groupe2.reservationHotel.exceptions.RechercheConsommationException;

/*
 * CLASSE : CONSOMMATIONSERVICEIMPL
 * AUTEUR : ERIK DUHEM
 * DATE : 11 07 2016
 * VERSION : 1.0
 */

@Transactional
public class ConsommationServiceImpl implements IConsommationService {

	/*
	 * ATTRIBUTS
	 */

	private IConsommationDao dao;
	Logger logger = Logger.getLogger("ConsommationServiceImpl");

	/*
	 * GETTERS ET SETTERS
	 */

	public IConsommationDao getDao() {
		return dao;
	}

	public void setDao(IConsommationDao dao) {
		this.dao = dao;
		logger.info("<---------- daoConsommation injectée  -------->");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.serviceConsommation.IConsommationService#
	 * addConsommation(com.groupe2.reservationHotel.entities.Consommation)
	 */

	@Override
	public Consommation addConsommation(Consommation cn) throws RechercheConsommationException {
		return this.dao.addConsommation(cn);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.serviceConsommation.IConsommationService#
	 * getConsommationId(java.lang.Long)
	 */

	@Override
	public Consommation getConsommationId(Long idConsommation) throws RechercheConsommationException {
		return this.dao.getConsommationId(idConsommation);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.serviceConsommation.IConsommationService#
	 * getConsommation()
	 */

	@Override
	public List<Consommation> getConsommation() {
		return this.dao.getConsommation();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.serviceConsommation.IConsommationService#
	 * updateConsommation(com.groupe2.reservationHotel.entities.Consommation)
	 */

	@Override
	public Consommation updateConsommation(Consommation cn) {
		return this.dao.updateConsommation(cn);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.serviceConsommation.IConsommationService#
	 * deleteConsommation(java.lang.Long)
	 */

	@Override
	public Consommation deleteConsommation(Long idConsommation) throws RechercheConsommationException {
		return this.dao.deleteConsommation(idConsommation);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.groupe2.reservationHotel.serviceConsommation.IConsommationService#
	 * calculerCoutProduit(java.lang.Long)
	 */

	@Override
	public Double calculerCoutProduit(Long idConsommation) throws RechercheConsommationException {
		return this.dao.calculerCoutProduit(idConsommation);
	}

}
