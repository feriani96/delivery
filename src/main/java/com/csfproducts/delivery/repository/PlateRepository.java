package com.csfproducts.delivery.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.csfproducts.delivery.model.Plate;
import com.csfproducts.delivery.model.Restaurant;
@Repository
//repository that extends CrudRepository  
public interface PlateRepository extends CrudRepository<Plate, Integer> {
    List<Plate> findByRestaurant(Restaurant restaurant);
}


