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

import com.csfproducts.delivery.model.Plate;
import com.csfproducts.delivery.services.PlateServices;


//mark class as Controller  


@RestController 
@CrossOrigin(origins = "*")
//@RequestMapping("/api")
public class PlateController {

	//autowire the BooksService class  
	@Autowired  
	PlateServices PS;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/plate")
	
	private List<Plate> getAllPlates()   
	{  
		return PS.getAllPlates();  
	}  
	
	@GetMapping("/plate/restaurant/{restaurantid}")
	
	private List<Plate> findByRestaurantId(@PathVariable("restaurantid") int restaurantid)   
	{  
		return PS.findByRestaurant(restaurantid);  
	} 
	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/Plate/{plateid}")  
	private Plate getPlates(@PathVariable("plateid") int plateid)   
	{  
		return PS.getplateById(plateid);  
	}  
	
	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/plate/{plateid}")  
	private void deletePlate(@PathVariable("plateid") int plateid)   
	{  
		PS.delete(plateid);  
	} 

	@PostMapping("/plate")  
	private int savePlate(@RequestBody Plate p)   
	{  
		PS.saveOrUpdate(p);  
		return p.getId();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/plate")  
	private Plate update(@RequestBody  Plate p)   
	{  
		PS.saveOrUpdate(p);  
		return p;  
	}  
}
