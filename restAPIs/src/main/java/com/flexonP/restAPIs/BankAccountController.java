package com.flexonP.restAPIs;

import java.util.ArrayList;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class BankAccountController{
	
	@Autowired
	private BankAccountDAO bankaccountDAO = new BankAccountDAO() ;
	
	//Get all Students from the Arraylist
	@GetMapping(path="/getAllCustomers")
	public ArrayList<BankAccount> getAllCustomers(){
		return bankaccountDAO.getAllCustomers();
	}
	
	//Adding a new student into the classroom
	@PostMapping(path="/addNewCustomer")
	public ResponseEntity addNewCustomer( @RequestBody BankAccount newCustomer){
		bankaccountDAO.addNewCustomer(newCustomer);
		
		return new ResponseEntity<>("Created new customer",HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/deleteCustomer/{id}")
	public ResponseEntity deleteCustomer(@PathVariable int id){
		bankaccountDAO.deleteCustomer(id);
		return new ResponseEntity<>("Delete customer",HttpStatus.OK);

	}

	@PutMapping(value = "/updateCustomer")
	public ResponseEntity updateCustomer( @RequestBody BankAccount newCustomer){
		bankaccountDAO.updateCustomer(newCustomer);

		return new ResponseEntity<>("Update new customer",HttpStatus.CREATED);
	}
	@ControllerAdvice
	public class Handler {

		@ExceptionHandler(Exception.class)
		public ResponseEntity<Object> handle(Exception ex,
											 HttpServletRequest request, HttpServletResponse response) {
			if (ex instanceof NullPointerException) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	//*************** Tasks ********************
	//Create an api to get specific student from the arraylist
	
	//Create an api to find a specific student and delete it
	
	//Create an api to edit student details 
	
	//Research on custom exception handling in spring boot framework
	//Create custom exception with messages and handle http status codes
	//https://www.tutorialspoint.com/spring_boot/spring_boot_exception_handling.htm
	//https://www.baeldung.com/exception-handling-for-rest-with-spring
	//https://howtodoinjava.com/spring-boot2/spring-rest-request-validation/
	
	//Research on sending links in your APIs using HATEOAS
	//Research on generating documentation using Swagger annotations
	
}
