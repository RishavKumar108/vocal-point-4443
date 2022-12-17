package com.rishav.usecase;

import com.rishav.dao.AdminDao;
import com.rishav.dao.AdminDaoImpl;

public class ViewAllTicketsusecase {

public static void viewAllTicket() {
		
		AdminDao dao = new AdminDaoImpl();
		dao.viewAllTickets();
	}
}
