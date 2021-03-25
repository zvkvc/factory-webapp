package it.engineering.web.model;

public class City {
	
	private String name;
	private String postalCode;
	
	public City(String name, String postalNumber) {
		super();
		this.name = name;
		this.postalCode = postalNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPostalNumber() {
		return postalCode;
	}
	public void setPostalNumber(String postalNumber) {
		this.postalCode = postalNumber;
	}
	
	@Override
	public String toString() {
		return "City [name=" + name + ", postalNumber=" + postalCode + "]";
	}
	
	
}
