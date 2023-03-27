package io.github.Victor5H.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "employee")
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String name;
	String email;
	double salary;

	// this tells hibernate not to create a different table for emp and address,
	// instead it is already mapped by filed named emp in Address class
	@OneToOne
	Address address;
	Date date;

	public long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(long id, String name, String email, double salary, Address address, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;

		this.salary = salary;
		this.address = address;
		this.date = date;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", address="
				+ address + ", date=" + date + "]";
	}

}
