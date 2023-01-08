package problem_1_driver;

import java.util.Scanner;

import problem_1_service.PayMoney;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of transanction array");
		int size=sc.nextInt();
		int[] transactionArray=new int[size];

		System.out.println("enter the values of  transaction array"); 
		for (int i = 0; i < size; i++) {
			transactionArray[i]=sc.nextInt();
		}
		System.out.println("enter the total no of  target that needs to be achieved");
		int targets=sc.nextInt();

		PayMoney paymoney=new PayMoney();
		paymoney.transaction(transactionArray,targets);
		sc.close();
	}
}
