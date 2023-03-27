package io.github.Victor5H.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "address")
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String street;
	private String city;
	private String buildingName;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(long id, String street, String city, String buildingName) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.buildingName = buildingName;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", buildingName=" + buildingName + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

}
