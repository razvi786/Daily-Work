//2. Write a program in C to find the sum of all elements of the array.

package Arrays;

public class ArraySum {
	
	public static int sum(int[] a) {
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		Array a=new Array();
		
		int arr[];
		
		arr=a.inputArray();
		
		a.outputArray(arr);
		
		int sum=sum(arr);
		
		System.out.println("Sum of Array Elements: "+sum);
	}

}
