package it.engineering.web.model;

public class Manufacturer {

	private long pib;
	private long id;
	private String name;
	private String address;
	private City city;

	public Manufacturer(long pib, long id, String name, String address, City city) {
		super();
		this.pib = pib;
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
	}

	public long getPib() {
		return pib;
	}

	public void setPib(long pib) {
		this.pib = pib;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Manufacturer [pib=" + pib + ", id=" + id + ", name=" + name + ", address=" + address + ", city=" + city
				+ "]";
	}

}
