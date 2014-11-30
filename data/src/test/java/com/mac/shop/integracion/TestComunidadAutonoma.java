package com.mac.shop.integracion;

import static org.junit.Assert.fail;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.mac.shop.model.ComunidadAutonoma;
import com.mac.shop.respository.ComunidadAutonomaRepository;


@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class,
    DirtiesContextTestExecutionListener.class,
    TransactionalTestExecutionListener.class})
public class TestComunidadAutonoma extends TestGeografia{
	
	final static Logger logger = Logger.getLogger(TestComunidadAutonoma.class);
	
	@Autowired
	ComunidadAutonomaRepository car;

	@Test  
	public void testDeleteCA(){
		logger.info(">>>TEST: Borrar comunidad Autónoma");
		try {
			car.delete(new ComunidadAutonoma("Extremadura"));
		} catch (Exception e) {			
			logger.error(">>>Error, Borrar comunidad Autónoma");
			fail(">>>Error, Borrar comunidad Autónoma");
		}			
		logger.info(">>>TEST: OK, Borrar comunidad Autónoma");
	}
}
