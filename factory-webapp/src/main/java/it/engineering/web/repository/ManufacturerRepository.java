package it.engineering.web.repository;

import java.util.List;

import it.engineering.web.model.Manufacturer;


public class ManufacturerRepository {
	
	List<Manufacturer> manufacturers;

	public ManufacturerRepository(List<Manufacturer> manufacturers) {
		super();
		this.manufacturers = manufacturers;
	}

	public ManufacturerRepository() {
		// TODO Auto-generated constructor stub
	}

	public List<Manufacturer> getManufacturers() {
		return manufacturers;
	}

	public void setManufacturers(List<Manufacturer> manufacturers) {
		this.manufacturers = manufacturers;
	}

	@Override
	public String toString() {
		return "ManufacturerRepository [manufacturers=" + manufacturers + "]";
	}
	
	
	
	
	

}
