package com.csfproducts.delivery.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.csfproducts.delivery.model.Restaurant;
import com.csfproducts.delivery.services.RestaurantServices;


//mark class as Controller  


@RestController 
@CrossOrigin(origins = "*")
//@RequestMapping("/api")
public class RestaurantController {

	//autowire the BooksService class  
	@Autowired  
	RestaurantServices RS;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/restaurant")
	
	private List<Restaurant> getAllRestaurants()   
	{  
		return RS.getAllRestaurants();  
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/Restaurant/{restaurantid}")  
	private Restaurant getDeliveries(@PathVariable("restaurantid") int restaurantid)   
	{  
		return RS.getdeliveryById(restaurantid);  
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/restaurant/{restaurantid}")  
	private void deleteRestaurant(@PathVariable("restaurantid") int restaurantid)   
	{  
		RS.delete(restaurantid);  
	} 

	@PostMapping("/restaurant")  
	private int saveRestaurant(@RequestBody Restaurant r)   
	{  
		RS.saveOrUpdate(r);  
		return r.getId();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/delivery")  
	private Restaurant update(@RequestBody  Restaurant r)   
	{  
		RS.saveOrUpdate(r);  
		return r;  
	}  
}