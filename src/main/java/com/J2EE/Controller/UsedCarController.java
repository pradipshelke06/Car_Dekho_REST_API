package com.J2EE.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.J2EE.Model.UsedCars;
import com.J2EE.Service.UsedCarService;

@RestController
public class UsedCarController {
	
	@Autowired
	private UsedCarService usedCarService;
	@GetMapping("/api/usedcars/all")
	public List<UsedCars> viewAllUsedCars() {
		List<UsedCars> viewAllUsedCars = usedCarService.viewAllUsedCars();
		return viewAllUsedCars;
		
	}
	@GetMapping("/api/usedcars/id")
	public Object viewCarById(@RequestParam int id) {
		UsedCars viewCarById = usedCarService.viewCarById(id);
		if (viewCarById!=null) {
			return viewCarById;
		}else {
			return "Car Not Found";
		}
		
		
	}

}
