/**
 * 
 */
package khanAcademy.algorithms;

/**
 * @author abu
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{0,-5,12,65,1,656,-32,23,85};
		selectionSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"," );
		}
	}
	static void selectionSort(int[] a){
		for(int i = 0;i<a.length;i++){//looping through array
			int minIndex = i;//I=1,MI=1
			if(i!=a.length){
				for(int j=i+1;j<a.length;j++){//j=3
					int temp =i;
					if(a[minIndex]>a[j]){//>0
						minIndex=j;//mi=2
					}
					temp++;
				}
				if(minIndex!=i){//1!=0
					int temp = a[minIndex];
					a[minIndex] = a[i];
					a[i] = temp;
				}
				//-5,0,1,12,65(MI),656,32,23,85
			}		                             //J
			
		}
	}
}
