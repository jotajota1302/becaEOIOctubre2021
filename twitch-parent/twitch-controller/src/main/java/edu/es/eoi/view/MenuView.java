package edu.es.eoi.view;

import java.util.Scanner;

import edu.es.eoi.controller.MenuController;

public class MenuView {
	
	public static void printMainMenu() {
		
		System.out.println("Bienvenido a mi app");
		System.out.println("Introduce el id: ");
		Scanner scanner= new Scanner(System.in);
		int id= scanner.nextInt();
		
		MenuController.processMenuReturn(id);
		
		scanner.close();
		
	}

}
