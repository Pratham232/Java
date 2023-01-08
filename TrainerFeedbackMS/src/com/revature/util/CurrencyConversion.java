package com.revature.util;
import java.util.Scanner;

public class CurrencyConversion {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
	    System.out.println("Enter the Amount in USD: ");
	    double USD = a.nextDouble();
	    double INR = 82.27* USD;
	    System.out.println(""+USD+" USD in INR is equal to Rs "+INR);
	}

}
