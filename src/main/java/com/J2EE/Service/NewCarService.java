package com.J2EE.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.J2EE.Dao.NewCarDao;
import com.J2EE.Model.NewCar;

@Service
public class NewCarService {
	@Autowired
	private NewCarDao newCarDao;
	public List<NewCar> viewAllNewCars() {
		List<NewCar> viewAllNewCars = newCarDao.viewAllNewCars();
		return viewAllNewCars;
		
	}

}
