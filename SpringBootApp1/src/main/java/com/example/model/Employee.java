package com.example.model;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Employee {

	private int id;
	private String name;
	private float salary;

	public Employee() {

	}
	@PostConstruct
	public void init() {

	    this.id = 1001;
	    this.name = "Arjun";
	    this.salary = 200000;

	  
	    System.out.println(this);
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}