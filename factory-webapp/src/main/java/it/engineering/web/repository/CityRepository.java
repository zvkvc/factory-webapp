package it.engineering.web.repository;

import java.util.ArrayList;
import java.util.List;

import it.engineering.web.model.City;

public class CityRepository {
	
	List<City> cities;

	public CityRepository(List<City> cities) {
		super();
		this.cities = cities;
	}

	public CityRepository() {
		cities = new ArrayList<>();
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "CityRepository [cities=" + cities + "]";
	}
	
	
}
