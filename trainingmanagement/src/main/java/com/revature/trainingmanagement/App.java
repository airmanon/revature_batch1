package com.revature.trainingmanagement;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.trainingmanagement.dao.TechnologyDAO;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Logger log = LoggerFactory.getLogger(App.class);

		log.info("Operations Starts Here!!!");

		Scanner input = new Scanner(System.in);
		int choice = 0;
		TechnologyDAO.connect();

		while (choice >= 0) {
			System.out.println(" \t\t 1) Insert a Record ");
			System.out.println(" \t\t 2) Update a Record ");
			System.out.println(" \t\t 3) Delete a Record ");
			System.out.println(" \t\t 4) Read all Record ");
			System.out.println(" \t\t 5) Read one Record ");
			System.out.println(" \t\t 6) Exit");
			System.out.println("Enter your choice [1-6]");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				TechnologyDAO.insert();
				break;
			case 2:
				TechnologyDAO.update();
				break;
			case 3:
				TechnologyDAO.delete();
				break;
			case 4:
				TechnologyDAO.findAll();
				break;
			case 5:
				TechnologyDAO.findById(101);
				break;
			case 6:
				TechnologyDAO.closeResource();
				System.exit(0);
				break;
			default:
				System.out.println("Please Enter any value between 1 to 6");
				break;
			}

		}

	}
}
