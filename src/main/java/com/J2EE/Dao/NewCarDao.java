package com.J2EE.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.J2EE.Model.NewCar;
@Repository
public class NewCarDao {
	
	List<NewCar> cars = new ArrayList<NewCar>();
	public NewCarDao() {
		cars.add(new NewCar(101, "TATA", "Nexon", 800000, 5, "Electric"));
		cars.add(new NewCar(102, "Mahindra", "SUV", 700000, 5, "Petrol"));
		cars.add(new NewCar(103, "Hundai", "Creta", 1700000, 5, "Petrol"));
		cars.add(new NewCar(104, "Kia", "Seltos", 700000, 5, "Petrol"));
		cars.add(new NewCar(105, "TATA", "Punch", 700000, 5, "Petrol"));
	}

	public List<NewCar> viewAllNewCars() {
		
		return cars;
		
	}
	

}
