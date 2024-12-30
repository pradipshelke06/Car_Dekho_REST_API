package com.J2EE.Model;

public class UsedCars {
	private int carId;
	private String carCompany;
	private String registrationYear;
	private int kmsDriven;
	private String rto;
	private double price;
	
	public UsedCars() {
		
	}

	public UsedCars(int carId, String carCompany, String registrationYear, int kmsDriven, String rto, double price) {
		super();
		this.carId = carId;
		this.carCompany = carCompany;
		this.registrationYear = registrationYear;
		this.kmsDriven = kmsDriven;
		this.rto = rto;
		this.price = price;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarCompany() {
		return carCompany;
	}

	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}

	public String getRegistrationYear() {
		return registrationYear;
	}

	public void setRegistrationYear(String registrationYear) {
		this.registrationYear = registrationYear;
	}

	public int getKmsDriven() {
		return kmsDriven;
	}

	public void setKmsDriven(int kmsDriven) {
		this.kmsDriven = kmsDriven;
	}

	public String getRto() {
		return rto;
	}

	public void setRto(String rto) {
		this.rto = rto;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "UsedCars [carId=" + carId + ", carCompany=" + carCompany + ", registrationYear=" + registrationYear
				+ ", kmsDriven=" + kmsDriven + ", rto=" + rto + ", price=" + price + "]";
	}
	
	
}
