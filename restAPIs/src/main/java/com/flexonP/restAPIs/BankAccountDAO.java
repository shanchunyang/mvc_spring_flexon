package com.flexonP.restAPIs;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class BankAccountDAO {

	private ArrayList<BankAccount> customers = new 	ArrayList<>();
	
	public BankAccountDAO() {
		customers.add(new BankAccount(111,"Samuel","Yang",123456789));
	}
	
	public ArrayList<BankAccount> getAllCustomers(){
		return customers;
	}
	
	public ArrayList<BankAccount> getAllCustomers(String CustomerName){
		
		return customers;
	}
	
	public BankAccount addNewCustomer(BankAccount newCustomer) {
		
		customers.add(newCustomer);
		return newCustomer;
		
	}
	public void deleteCustomer(int id) {

		for (BankAccount bank_account : customers) {
			if (bank_account.getCustomerID() == (id)) {
				customers.remove(bank_account);
			}
		}
	}

	public BankAccount updateCustomer(BankAccount newCustomer){
		for (BankAccount bank_account : customers) {
			if (bank_account.getCustomerID() == newCustomer.getCustomerID()) {
				customers.remove(bank_account);
				customers.add(newCustomer);
				return newCustomer;
			}
		}
		customers.add(newCustomer);
		return newCustomer;

	}
	
	//Implement finding a Customer from the customers arraylist
	
}
