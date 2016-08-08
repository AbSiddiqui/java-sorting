/**
 * 
 */
package khanAcademy.algorithms;

/**
 * @author abu
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int[] {5,12,65,32,14,2,3,1,2,543,123,3245,123123,12313,12313,4354,45645,6,787,8789,56,123123,123};
		long startTime = System.currentTimeMillis();
		 insertSort(array);
		 long endTime = System.currentTimeMillis();
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] +",");
		}
		System.out.println("time taken by insertion sort algorithm for sorting array of 5 numbers -" + (startTime-endTime));
	}
	private static void insertSort(int[] array){
		for (int i = 1; i < array.length; i++) {//looping through the array
			int key = array[i];//key = 32
			int j=i-1;//j=2
			while ( (j > -1) && ( array [j] > key ) ) {//(65>32)
				array[j+1] = array[j];//arra[3]=65 swap happens {5,12,65,65,14}
				j--;
			}
				array[j+1] = key;//array[2]=65
		}
		
	}
	
}
