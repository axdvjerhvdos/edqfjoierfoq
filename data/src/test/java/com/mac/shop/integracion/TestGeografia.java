package com.mac.shop.integracion;

import javax.transaction.Transactional;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;

import com.mac.shop.model.ComunidadAutonoma;
import com.mac.shop.model.Provincia;
import com.mac.shop.respository.ComunidadAutonomaRepository;
import com.mac.shop.respository.ProvinciaRepository;

public class TestGeografia {
	
	@Autowired
	ComunidadAutonomaRepository car;
	@Autowired
	ProvinciaRepository provinciaRepository;
	
	/**
	 * Preparamos el estado inicial con una comunidad autónoma.
	 * @throws Exception
	 */
	@Before
	@Transactional
	public void setUp() throws Exception{
		//vaciamos el repositorio
		car.deleteAll();
		ComunidadAutonoma caExtremadura = new ComunidadAutonoma("Extremadura");
		car.save(caExtremadura);
		car.save(new ComunidadAutonoma("Madrid"));
		provinciaRepository.deleteAll();
		Provincia pCaceres = new Provincia("Cáceres");
		provinciaRepository.save();
	}
	
}
