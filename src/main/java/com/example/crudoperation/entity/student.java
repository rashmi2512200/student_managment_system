package com.example.crudoperation.entity;

import jakarta.persistence.Entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="studenttable")

public class student {
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;
	private String name;
	private String address;
	
   //generate constructors from supercls
	public student() {
		super();
		
	}

public student(int rollno, String name, String address) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.address = address;
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
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
	

}
