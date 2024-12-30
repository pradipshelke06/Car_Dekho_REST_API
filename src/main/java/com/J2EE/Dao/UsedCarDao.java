package com.J2EE.Dao;

import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.J2EE.Model.UsedCars;

@Repository
public class UsedCarDao {
	
	List<UsedCars> usedCars = new LinkedList<UsedCars>();
	public UsedCarDao() {
		usedCars.add(new UsedCars(1, "Mahindra", "2015", 45000, "Pimpari Chinchwad", 250000));
		usedCars.add(new UsedCars(2, "Tata", "2016", 49000, "Pune", 300000));
		usedCars.add(new UsedCars(3, "Maruti", "2019", 45000, "Pimpari Chinchwad", 200000));
		usedCars.add(new UsedCars(4, "Kia", "2019", 46000, "Pimpari Chinchwad", 600000));
		usedCars.add(new UsedCars(5, "Hundai", "2014", 80000, "Pimpari Chinchwad", 120000));
		usedCars.add(new UsedCars(6, "Honda", "2016", 25000, "Pimpari Chinchwad", 1000000));
		
	}

	public List<UsedCars> viewAllUsedCars() {
		
		return usedCars;
		
	}
	public UsedCars viewCarById(int id) {
		for (UsedCars usedCars2 : usedCars) {
			if (usedCars2.getCarId()==id) {
				return usedCars2;
				
			}
		}
		return null;
		
		
		
	}
}
