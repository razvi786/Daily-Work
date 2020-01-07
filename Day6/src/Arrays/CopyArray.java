//3. Write a program in C to copy the elements of one array into another array.

package Arrays;

public class CopyArray {
	
	public static int[] copy(int[] a) {
		
		int[] b=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			
			b[i]=a[i];
		}
		
		return b;
	}
	
	public static void main(String[] args) {
		
		Array a=new Array();
		
		int arr[],brr[];
		
		arr=a.inputArray();
		
		brr=copy(arr);
		
		System.out.println("Copied Array");
		a.outputArray(brr);
		
	}

}
