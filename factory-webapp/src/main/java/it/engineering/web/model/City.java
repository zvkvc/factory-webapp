package it.engineering.web.model;

public class City {
	
	private String name;
	private String postalCode;
	public City(String name, String postalCode) {
		super();
		this.name = name;
		this.postalCode = postalCode;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	@Override
	public String toString() {
		return "City [name=" + name + ", postalCode=" + postalCode + "]";
	}
	
	
	
	
}
