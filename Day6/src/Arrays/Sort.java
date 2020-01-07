//7. Write a program in C to sort elements of array in ascending order.

package Arrays;

public class Sort {
	
	public static int[] selectionSort(int []a) {
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) { //swap
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Array a=new Array();
		
		int arr[];
		
		arr=a.inputArray();
		
		a.outputArray(arr);
		
		arr=selectionSort(arr);
		
		System.out.print("Array after Selection Sort:");
		
		a.outputArray(arr);
		

	}

}
