package com.J2EE.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.J2EE.Dao.UsedCarDao;
import com.J2EE.Model.UsedCars;

@Service
public class UsedCarService {

	@Autowired
	private UsedCarDao usedCarDao;
	
	public List<UsedCars> viewAllUsedCars() {
		List<UsedCars> viewAllUsedCars = usedCarDao.viewAllUsedCars();
		return viewAllUsedCars;
		
	}
	public UsedCars viewCarById(int id) {
		UsedCars viewCarById = usedCarDao.viewCarById(id);
		return viewCarById;
	}
}
