package com.J2EE.Model;

public class NewCar {
	
	private int carId;
	private String companyName;
	private String model;
	private double price;
	private int waranty;
	private String engineType;
	
	public NewCar() {
		// TODO Auto-generated constructor stub
	}

	public NewCar(int carId, String companyName, String model, double price, int waranty, String engineType) {
		super();
		this.carId = carId;
		this.companyName = companyName;
		this.model = model;
		this.price = price;
		this.waranty = waranty;
		this.engineType = engineType;
	}

	public int getNewCarId() {
		return carId;
	}

	public void setNewCarId(int carId) {
		this.carId = carId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getWaranty() {
		return waranty;
	}

	public void setWaranty(int waranty) {
		this.waranty = waranty;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return "NewCar [carId=" + carId + ", companyName=" + companyName + ", model=" + model + ", price=" + price
				+ ", waranty=" + waranty + ", engineType=" + engineType + "]";
	}
	

}
