package com.mac.shop.integracion;

import static org.junit.Assert.fail;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mac.shop.model.ComunidadAutonoma;
import com.mac.shop.model.Provincia;
import com.mac.shop.respository.ProvinciaRepository;

public class TestProvincia extends TestGeografia{
	
final static Logger logger = Logger.getLogger(TestProvincia.class);
	
	@Autowired
	ProvinciaRepository provinciaRepository;
	
	@Test  
	public void testDeleteProvincia(){
		logger.info(">>>TEST: Borrar comunidad Autónoma");
		try {
			ComunidadAutonoma ca = new ComunidadAutonoma("Extremadura");
			
			provinciaRepository.delete(new Provincia("Cáceres"));
		} catch (Exception e) {			
			logger.error(">>>Error, Borrar comunidad Autónoma");
			fail(">>>Error, Borrar comunidad Autónoma");
		}			
		logger.info(">>>TEST: OK, Borrar comunidad Autónoma");
	}
}
