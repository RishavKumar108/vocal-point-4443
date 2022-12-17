package com.rishav.usecase;

import java.util.Scanner;

import com.rishav.bean.Customer;
import com.rishav.custom.ConsoleColors;
import com.rishav.dao.CustomerDao;
import com.rishav.dao.CustomerDaoImpl;
import com.rishav.exceptions.BusException;

public class CancelTicketbNameusecase {

	public  static void cancelTicket(Customer customer) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(ConsoleColors.ORANGE + "Enter Bus Name" + ConsoleColors.RESET);
		String bName = sc.nextLine();
		
		CustomerDao dao = new CustomerDaoImpl();
		try {
			
			int cusId = customer.getCusId();
			String message = dao.cancelTicket(bName, cusId);
			
			if (message.equals("Ticket cancelled Successfully")) {
				System.out.println(ConsoleColors.GREEN_BACKGROUND + message + ConsoleColors.RESET);
			}
			else {
				System.out.println(ConsoleColors.RED_BACKGROUND + message + ConsoleColors.RESET);
			}
			
		} catch (BusException e) {
			System.out.println(ConsoleColors.RED_BACKGROUND + e.getMessage() + ConsoleColors.RESET);
		}
	
	}
	
}
