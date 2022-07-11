package com.java.assignment2currency;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args){
	 	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Currency Denominations");
		int numberOfDenomination = sc.nextInt();
		int[] denominations = new int[numberOfDenomination];
		System.out.println("Enter the Currency Denominations");
		for (int i = 0; i < numberOfDenomination; i++) {
		denominations[i] = sc.nextInt();		
	}
	     System.out.println("Enter the amount which you want to pay");
    int amount = sc.nextInt();
    for (int i : denominations) {
    	System.out.println(i + " ");
    }
    System.out.println();
    Currency currency = new Currency(denominations, numberOfDenomination);
    MergeSort.sort(currency.denominations, 0, numberOfDenomination - 1);
    for (int i = 0; i < numberOfDenomination; i++) {
    	System.out.print(currency.denominations[i] + " ");
    }
    System.out.println();
	}
}
