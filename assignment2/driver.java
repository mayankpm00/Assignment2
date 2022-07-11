package com.java.assignment2;

import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the size of Transactions Array i.e Number of days you want to track");
    	int size = sc.nextInt();
    	int[] transactions = new int[size];
    	for (int i = 0; i < size; i++) {
    		System.out.println("Enter daily transactions in Crores of Day: " + (i + 1));
    		transactions[i] = sc.nextInt();
    	}
    	System.out.println("Enter the target amount in crores which you want to achieve");
    	int target = sc.nextInt();
    	PayMoney pm = new PayMoney();
    	int numberOfDays = pm.numberOfDays(transactions, target);
    	if (numberOfDays == -1)
    		System.out.println("The Target " + target + " is not achieved!!!");
    	else {
    		System.out.println("The Target " + target + " Crore is achieved in " + numberOfDays);
    	}
    	displayTransactions(transactions);
    	sc.close();
    }
    public static void displayTransactions(int[] transactions) {
    	for (int transaction : transactions) {
    		System.out.print(transaction+" ");
    	}
    	System.out.println();
    }
}
