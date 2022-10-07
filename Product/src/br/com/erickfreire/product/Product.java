package br.com.erickfreire.product;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		int product;
		
		System.out.println("Java program that calculates the product of three values");
		System.out.print("Enter First Integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter Second Integer: ");
		number2 = input.nextInt();
		
		System.out.print("Enter Third Integer: ");
		number3 = input.nextInt();
		
		product = number1 * number2 * number3;
		
		System.out.printf("Product is: %d%n", product);
	}

}
