package skp.All.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Student implements Serializable{
	@Id
	@GenericGenerator(name="auto",strategy = "increment")  
	@GeneratedValue(generator  ="auto")  
	
	private Long id;
	
	private String name;
	
	private String roolnumber;

	private String branch;
	
	private String college;
	
	private String phoneNumber;
	
	private String clgAddress;
	
	private String address;
	
	public Student() {
		
	}

	public Student(Long id, String name, String roolnumber, String branch, String college, String phoneNumber,
			String clgAddress, String address) {
		super();
		this.id = id;
		this.name = name;
		this.roolnumber = roolnumber;
		this.branch = branch;
		this.college = college;
		this.phoneNumber = phoneNumber;
		this.clgAddress = clgAddress;
		this.address = address;
	}

	public Student(int i, String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoolnumber() {
		return roolnumber;
	}

	public void setRoolnumber(String roolnumber) {
		this.roolnumber = roolnumber;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getClgAddress() {
		return clgAddress;
	}

	public void setClgAddress(String clgAddress) {
		this.clgAddress = clgAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", roolnumber=" + roolnumber + ", branch=" + branch
				+ ", college=" + college + ", phoneNumber=" + phoneNumber + ", clgAddress=" + clgAddress + ", address="
				+ address + ", getId()=" + getId() + ", getName()=" + getName() + ", getRoolnumber()=" + getRoolnumber()
				+ ", getBranch()=" + getBranch() + ", getCollege()=" + getCollege() + ", getPhoneNumber()="
				+ getPhoneNumber() + ", getClgAddress()=" + getClgAddress() + ", getAddress()=" + getAddress()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
