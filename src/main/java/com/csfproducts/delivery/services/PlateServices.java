package com.csfproducts.delivery.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csfproducts.delivery.model.Plate;
import com.csfproducts.delivery.repository.PlateRepository;
@Service
public class PlateServices {

	@Autowired  
	PlateRepository PR;  
	public List<Plate> getAllPlates()   
	{  
		List<Plate> plates = new ArrayList<Plate>();  
		PR.findAll().forEach(p -> plates.add(p));  
		return plates;  	
	}  
	
	public List<Plate> findByIdrestaurant(int idrestaurant)   
	{  
		List<Plate> plates = new ArrayList<Plate>();  
		PR.findByIdrestaurant(idrestaurant).forEach(p -> plates.add(p));  
		return plates;  	
	} 
}
