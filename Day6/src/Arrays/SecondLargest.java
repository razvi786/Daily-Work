
//8. Write a program in C to find the second largest element in an array.

package Arrays;

public class SecondLargest {
	
	public static int large(int a[]) {
		
		int largest=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest)
				largest=a[i];
		}
		
		int large=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==largest)
				continue;
			if(a[i]>large)
				large=a[i];
		}
		
		return large;
	}
	
	public static void main(String[] args) {
		
		Array a=new Array();
		
		int arr[];
		
		arr=a.inputArray();
		
		a.outputArray(arr);
		
		int large=large(arr);
		
		System.out.println("The Second Largest Element is: "+large);
		
	}

}
