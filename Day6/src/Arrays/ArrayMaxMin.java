//5. Write a program in C to find the maximum and minimum element in an array. 


package Arrays;

public class ArrayMaxMin {
	
	public static void main(String[] args) {
		
		Array a=new Array();
		
		int arr[];
		
		arr=a.inputArray();
		
		a.outputArray(arr);
		
		int min=arr[0],max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<min)
				min=arr[i];
			
			if(arr[i]>max)
				max=arr[i];
			
		}
		
		System.out.println("Minimum element is: "+min);
		
		System.out.println("Maximum element is: "+max);
		
	}

}
