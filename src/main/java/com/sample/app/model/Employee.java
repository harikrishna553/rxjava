package com.sample.app.model;

import java.util.Objects;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String city;
	private double salary;

	public Employee(int id, String firstName, String lastName, int age, String city, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.city = city;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object employee) {
		if (Objects.isNull(employee))
			return false;

		if (!(employee instanceof Employee))
			return false;

		Employee emp = (Employee) employee;

		return id == emp.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lastName, age);
	}

	@Override
	public String toString() {
		return String.format("%s(%s,%d,%f)", firstName, city, age, salary);
	}

}
