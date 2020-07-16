package com.flexonP.restAPIs;

public class BankAccount {
	
	private int customer_id;
	private String first_name;
	private String last_name;
	private int phone_number;
 	
	public BankAccount(int customer_id, String first_name, String last_name, int phone_number) {
		super();
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_number = phone_number;
	}
	
	public int getCustomerID() {
		return customer_id;
	}
	public void setCustomerID(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getName() {
		return this.first_name;
	}
	public void setName(String name) {
		this.first_name = name;
	}
	public String getLastname() {
		return this.last_name;
	}
	public void setLastname(String lastname) {
		this.last_name = lastname;
	}
	public int getPhoneNumber() {
		return this.phone_number;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phone_number = phoneNumber;
	}
	
	
	@Override
	public String toString() {
		return "BankAccount [customer_id=" + customer_id + ", first_name=" + first_name + ", last_name=" + last_name + ", phone_number="
				+ phone_number + "]";
	}

	
	
}
