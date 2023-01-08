package problem_2_service;

public class MergeSort {

	public void sort(int[] currencyArray, int left, int right) {
		//base condition
		if(left<right) {

			//find the middle element
			int mid=(left+right)/2;

			//sort left and right array
			sort(currencyArray,left,mid);
			sort(currencyArray,mid+1,right);

			//merge sorted array
			mergeArray(currencyArray,left,mid,right);
		}

	}

	private void mergeArray(int[] currencyArray, int left, int mid, int right) {
		//size of two temp array
		int n1=mid-left+1;
		int n2=right-mid;
		// create two temp array
		int[] leftArray=new int[n1]; 
		int[] rightArray=new int [n2]; 
		// add elements to temp arrays
		for(int i=0;i<n1;i++) {
			leftArray[i]=currencyArray[left+i];
		}
		for (int j=0;j<n2;j++) {
			rightArray[j]= currencyArray[mid+1+j];
		}

		//merge two arrays
		int i=0,j=0;
		int k=left;
		while(i<n1 && j<n2) {
			if(leftArray[i]<=rightArray[j]) {
				currencyArray[k]=leftArray[i];
				i++;
			}
			else {
				currencyArray[k]=rightArray[j];
				j++;
			}
			k++;
		}
		//copy remaining elements
		while(i<n1) {
			currencyArray[k]=leftArray[i];
			i++;
			k++;
		}
		while(j<n2) {
			currencyArray[k]=rightArray[j];
			j++;
			k++;
		}
	}
}
