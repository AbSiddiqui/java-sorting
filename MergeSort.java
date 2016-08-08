package khanAcademy.algorithms;

public class MergeSort {

	public static void main(String[] args) {
		int [] a= new int[]{12,5,5,56,7,1,65,6,312,65,121,8,0,12};//unsorted array 
		mergeSort(a);//call merge sort function with array a as an argument
		for(int i:a){// print the sorted array 
			System.out.print(i+",");
		}
		
	}
	
	/**
	 * mergeSort
	 * @param a
	 * Method to divide the array a recursively till sub array's size becomes 1
	 */
	private static void mergeSort(int [] a){
		//sorting algorithm - n logn running time for worst case
		int len = a.length;
		if(len<=1){// base case is important in recursive methods
			return;
		}else{
			int mid = len/2;//mid index to divide the array
			int [] left= new int[mid];
			int [] right;
			if(len%2 == 0){// could be improved, try to remove this check!!
				 right = new int[mid];
			}else{
				right = new int[mid+1];
			}
			
			System.arraycopy(a, 0, left, 0, left.length);// divide the source to left 
			System.arraycopy(a, left.length, right, 0, right.length);// divide the source to right
			mergeSort(left);// recursive call with left part of sub array
			mergeSort(right);// recursive call with right part of the sub array
			merge(a,left,right);// call to merge sorted left and right array into destination array
		}
	}
	
	/**
	 * merge
	 * @param a
	 * @param left
	 * @param right
	 * method used to merge two unsorted array's left and right into dest array
	 */
	private static void merge(int[] a, int [] left, int [] right){
		int k=0,i=0,j=0;
		while((i<left.length) && (j<right.length)){
			if(left[i]<=right[j]){
				a[k]=left[i];
				k++;
				i++;
			}else{
				a[k]=right[j];
				k++;
				j++;
			}
		}
		while(i<left.length){//if any element is left in left array
			a[k]=left[i];
			k++;
			i++;
		}
		while(j<right.length){//if any element is left in right array
			a[k] = right[j];
			k++;
			j++;
		}
	}
}
