package net.codejava;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Student {
	private int id;
	private String name;
	public Student() {
		
	}
	public Student( String name) {
		
		this.name = name;
	}
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
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
	
	
}
