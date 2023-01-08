package problem_2_service;

public class CurrencyCounter {
	public void count(int[] currencyArray, int amount) {
		int size=currencyArray.length;
		int[] noteCount=new int[size];

		try {
			for(int i=currencyArray.length-1; i>=0; i--) {
				if(amount>=currencyArray[i]) {
					noteCount[i]=amount/currencyArray[i];
					amount=amount % currencyArray[i];
				}
			}

			if(amount>0) {
				System.out.println("exact amount cannot be given with the highest denomination");
			}
			else {
				System.out.println("currency denominations are");
				for (int i=size-1; i>=0; i--) {
					if(noteCount[i]!=0) {
						System.out.println(currencyArray[i]+" "+":"+" "+noteCount[i]);
					}
				}
			}
		}catch(ArithmeticException e) {
			System.out.println("notes of denomination 0 is invalid");
		}
	}
}
