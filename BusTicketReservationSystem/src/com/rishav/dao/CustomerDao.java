package com.rishav.dao;

import com.rishav.bean.Customer;
import com.rishav.exceptions.BusException;
import com.rishav.exceptions.CustomerException;

public interface CustomerDao {
   

    public String cusSignUp (String username, String password, String firstName, String lastName, String address, String mobile) ;
	
	public String cusSignUp (Customer customer);
	
	public Customer cusLogin (String username, String password) throws CustomerException;
	
	public String bookTicket (String bName, int cusId, int no) throws BusException;
	
	public String cancelTicket(String bName, int cusId) throws BusException;
	
	public void viewTicket(int cusId);
}
