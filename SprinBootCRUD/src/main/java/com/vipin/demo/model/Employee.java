package com.vipin.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id")
	private long id;
	@Column(name="emp_fname")
	private String fname;
	@Column(name="emp_lname")
	private String lname; 
	@Column(name="emp_mail")
	private String mail;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public String getMail() {
		return mail;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", mail=" + mail + "]";
	} 

}
