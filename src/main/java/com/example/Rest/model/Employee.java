package com.example.Rest.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="second_name")
	private String secondName;
	@Column(name="email_id")
	private String emailId;

	public long getId() {
		return id;
	}
	public Employee() {
		super();
	}
	public Employee(long id, String firstName, String secondName, String emailId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.emailId = emailId;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
