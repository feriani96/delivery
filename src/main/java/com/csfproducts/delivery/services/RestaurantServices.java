package com.csfproducts.delivery.services;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;
import com.csfproducts.delivery.model.Restaurant;
import com.csfproducts.delivery.repository.RestaurantRepository;


//defining the business logic  
@Service 

public class RestaurantServices {

	@Autowired  
	RestaurantRepository RR;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Restaurant> getAllRestaurants()   
	{  
		List<Restaurant> restaurants = new ArrayList<Restaurant>();  
		RR.findAll().forEach(r -> restaurants.add(r));  
		return restaurants;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Restaurant getdeliveryById(int id)   
	{  
		try {
				return RR.findById(id).get();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Restaurant r)   
	{  
		RR.save(r);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		RR.deleteById(id);  
	} 
}