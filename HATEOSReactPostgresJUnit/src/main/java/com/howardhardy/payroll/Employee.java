package com.howardhardy.payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;
import javax.persistence.Column;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee {

	private @Id @GeneratedValue Long id;
	
	@Column(name = "firstname")
    private String firstName;
 
    @Column(name = "lastname")
    private String lastName;
	
    @Column(name = "description")
	private String description;

	private @Version @JsonIgnore Long version;
	
	private Employee() {}

	public Employee(String firstName, String lastName, String description) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.description = description;
	}
}