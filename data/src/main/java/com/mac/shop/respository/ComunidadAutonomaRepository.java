package com.mac.shop.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mac.shop.model.ComunidadAutonoma;

@Repository
public interface ComunidadAutonomaRepository extends CrudRepository<ComunidadAutonoma, Long> {


	
}
