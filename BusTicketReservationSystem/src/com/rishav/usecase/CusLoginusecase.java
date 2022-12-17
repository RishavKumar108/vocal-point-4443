package com.rishav.usecase;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.rishav.bean.Customer;
import com.rishav.custom.ConsoleColors;
import com.rishav.dao.CustomerDao;
import com.rishav.dao.CustomerDaoImpl;
import com.rishav.exceptions.CustomerException;

public class CusLoginusecase {

public static Customer CusLogin() {
		
		Customer customer = null;
		
		try {
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println(ConsoleColors.ORANGE + "Enter Username" + ConsoleColors.RESET);
			String username = sc.next();
			
			System.out.println(ConsoleColors.ORANGE + "Enter Password" + ConsoleColors.RESET);
			String password = sc.next();
			
			CustomerDao dao = new CustomerDaoImpl();
			
			try {
				customer = dao.cusLogin(username, password);
				
				System.out.println(ConsoleColors.ROSY_PINK + "Welcome " + customer.getFirstName() + " " + customer.getLastName() + ConsoleColors.RESET);
			} catch (CustomerException e) {
				
				System.out.println(ConsoleColors.RED_BACKGROUND + e.getMessage() + ConsoleColors.RESET);
			}
		}
		catch (InputMismatchException e) {
			System.out.println(ConsoleColors.RED_BACKGROUND + e.getMessage() + ConsoleColors.RESET);
		}
		
		return customer;

	}
}
