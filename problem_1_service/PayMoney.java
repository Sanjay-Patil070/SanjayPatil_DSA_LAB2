package problem_1_service;

import java.util.Scanner;

public class PayMoney {
	public void transaction(int[] transactionArray, int targets) {
		int size=transactionArray.length;
		int[]targetArray=new int[targets];
		Scanner in=new Scanner(System.in);
		for (int j = 0; j < targets; j++) {
			System.out.println("enter the value of target"+" "+(j+1));
			targetArray[j]=in.nextInt();

			int count=0,temp=0;
			for (int i = 0; i < size ; i++) {

				temp=temp+transactionArray[i];
				if (temp<targetArray[j]) {
					count++;
				}
			}
			if(temp>=targetArray[j]) {
				System.out.println("target achieved in"+" "+ (count+1)+" " +"transactions");
			}else  {
				System.out.println("Given target not achieved");
			}
		}
		in.close();
	}
}
