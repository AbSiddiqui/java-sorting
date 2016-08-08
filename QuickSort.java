package khanAcademy.algorithms;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{12,5,20,12,2,1,3,7};
		quickSort(a,0,(a.length-1));
		for(int i:a){
			System.out.print(i+",");
		}
	}
	
	private static void quickSort(int [] a, int start, int end){
		if(start>end){//base case, if the sub array has only one element return
			return;
		}else{
			/*function to arrange all the elements 
			lesser than pivot to left and greater to the right of the right of the pivot element*/
			int pIndex = partition(a, start, end);
			/*recursively call the function to divide the array*/
			quickSort(a, start, pIndex-1);
			quickSort(a, pIndex+1, end);
		}
	}
	
	private static int partition(int [] a, int start, int end){
		int pivot = a[end];//take the last element as pivot element
		int pIndex = start;//Have a pointer called pIndex. initialise to start
		for(int i=start;i<=(end-1);i++){//loop through the array till the last-1 element
			if(a[i]<=pivot){
				int temp=a[i];
				a[i] = a[pIndex];
				a[pIndex] = temp;
				pIndex=pIndex+1;
			}
		}
		int temp=a[pIndex];
		a[pIndex] = a[end];
		a[end] = temp;
		return pIndex;
	}
	
}
