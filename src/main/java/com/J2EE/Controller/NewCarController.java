package com.J2EE.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.J2EE.Model.NewCar;
import com.J2EE.Service.NewCarService;

@RestController
public class NewCarController {
	
	@Autowired
	private NewCarService newCarService;
	
	@GetMapping("/api/newCar/all")
	public List<NewCar> viewAllNewCars() {
		List<NewCar> viewAllNewCars = newCarService.viewAllNewCars();
		return viewAllNewCars;
		
	}
	

}
