package com.rishav.usecase;

import com.rishav.bean.Customer;
import com.rishav.dao.CustomerDao;
import com.rishav.dao.CustomerDaoImpl;

public class ViewTicketusecase {
	
	public static void viewTicket(Customer customer) {
		
		CustomerDao dao = new CustomerDaoImpl();
		
		dao.viewTicket(customer.getCusId());
	}

}
