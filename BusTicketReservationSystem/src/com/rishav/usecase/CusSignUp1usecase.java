package com.rishav.usecase;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.rishav.bean.Customer;
import com.rishav.custom.ConsoleColors;
import com.rishav.dao.CustomerDao;
import com.rishav.dao.CustomerDaoImpl;

public class CusSignUp1usecase {

public static boolean cusSignUp() {
		
		boolean flag = false;
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println(ConsoleColors.ORANGE + "Enter Username" + ConsoleColors.RESET);
			String username = sc.next();
			
			System.out.println(ConsoleColors.ORANGE + "Enter Password" + ConsoleColors.RESET);
			String password = sc.next();
			
			System.out.println(ConsoleColors.ORANGE + "Enter First Name" + ConsoleColors.RESET);
			String firstName = sc.next();
			
			System.out.println(ConsoleColors.ORANGE + "Enter Last Name" + ConsoleColors.RESET);
			String lastName = sc.next();
			
			sc.nextLine();
			System.out.println(ConsoleColors.ORANGE + "Enter Address" + ConsoleColors.RESET);
			String address = sc.nextLine();
			
			System.out.println(ConsoleColors.ORANGE + "Enter Mobile" + ConsoleColors.RESET);
			String mobile = sc.next();
			
			CustomerDao dao = new CustomerDaoImpl();
			
			String result = dao.cusSignUp(username, password, firstName, lastName, address, mobile);
			
			
			if (result == "Sign up Successfull") {
				System.out.println(ConsoleColors.GREEN_BACKGROUND + result + ConsoleColors.RESET);
				flag = true;
				}
			else {
				System.out.println(ConsoleColors.RED_BACKGROUND + result + ConsoleColors.RESET);
			}
			
		}
		catch (InputMismatchException e) {
			System.out.println(ConsoleColors.RED_BACKGROUND + "Invalid Input" + ConsoleColors.RESET);
		}
		
		return flag;
	}
	
}
