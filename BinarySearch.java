package khanAcademy.algorithms;

/**
 * @author abbu
 * program to get the first  and last occurence of the key
 * using binary search
 */
public class BinarySearch {

	static int result = -1;//global variables are static
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int []{1,2,5,5,5,6,9};
		int key = 5;
		int firstOccurence =binarySearchFirstOccurence(a,0,a.length-1,key);
		if(-1!=firstOccurence){
			System.out.println(key+" first found at index" +firstOccurence);
		}else{
			System.out.println(key+"doesn't exist in the array");
		}
		int lastOccurence = binarySearchLastOccurence(a,0,a.length-1,key);
		
		if(-1!=lastOccurence){
			System.out.println(key+" last found at index " +lastOccurence);
		}else{
			System.out.println(key+"doesn't exist in the array");
		}
	}
	
	private static int binarySearchFirstOccurence(int [] a, int low, int high, int key){
		
		
		while(low<=high){
			int mid = (low+high)/2;
			if(a[mid] == key){
			result = mid;
			high = mid-1;
			}else if(key>a[mid]){
				low = mid+1;
			}else{
				high = mid-1;
			}
		}
		return result;
	}

	private static int binarySearchLastOccurence(int [] a, int low, int high, int key){
		
		
		while(low<=high){
			int mid = (low+high)/2;
			if(a[mid] == key){
			result = mid;
			low = mid+1;
			}else if(key>a[mid]){
				low = mid+1;
			}else{
				high = mid-1;
			}
		}
		return result;
	}
}
