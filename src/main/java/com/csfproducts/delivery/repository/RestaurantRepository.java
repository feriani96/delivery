package com.csfproducts.delivery.repository;


import org.springframework.data.repository.CrudRepository;
import com.csfproducts.delivery.model.Restaurant;

//repository that extends CrudRepository  
public interface RestaurantRepository extends CrudRepository<Restaurant, Integer>  
{  
	
}  