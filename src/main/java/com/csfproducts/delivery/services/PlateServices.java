package com.csfproducts.delivery.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csfproducts.delivery.model.Plate;
import com.csfproducts.delivery.repository.PlateRepository;
import com.csfproducts.delivery.repository.RestaurantRepository;

@Service
public class PlateServices {

	@Autowired  
	PlateRepository PR;  
	@Autowired  
	RestaurantRepository RR;  
	public List<Plate> getAllPlates()   
	{  
		List<Plate> plates = new ArrayList<Plate>();  
		PR.findAll().forEach(p -> plates.add(p));  
		return plates;  	
	}  
	
	public List<Plate> findByRestaurant(int idR)   
	{  
		List<Plate> plates = new ArrayList<Plate>();  
		PR.findByRestaurant(RR.findById(idR).get()).forEach(p -> plates.add(p));  
		return plates;  	
	} 
	
	//getting a specific record by using the method findById() of CrudRepository  
		public Plate getplateById(int id)   
		{  
			try {
					return PR.findById(id).get();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;  
		}  
		//saving a specific record by using the method save() of CrudRepository  
		public void saveOrUpdate(Plate p)   
		{  
			PR.save(p);  
		} 

		//deleting a specific record by using the method deleteById() of CrudRepository  
		public void delete(int id)   
		{  
			PR.deleteById(id);  
		} 
}
