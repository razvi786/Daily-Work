//6. Write a program in C to separate odd and even integers in separate arrays.

package Arrays;

import java.util.ArrayList;

public class OddEven {
	
//	public static int[][] oddEvenArrayList(int[] a) {
//		
//		
//		ArrayList<Integer> odd=new ArrayList<Integer>();
//		ArrayList<Integer> even=new ArrayList<Integer>();
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%2!=0)
//				odd.add(a[i]);
//			else
//				even.add(a[i]);
//		}
//		
//		int returns[][]=new int[2][];
//		
//		returns[0]=new int[odd.size()];
//		
//		returns[0]=odd.toArray();
//		
//		
//		
//		
//	}
	
	public static int oddCount(int[] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				count++;
			}
		}
		return count;
	}
	
	public static int evenCount(int[] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Array a=new Array();
		
		int arr[],odd[],even[];
		
		arr=a.inputArray();
		
		a.outputArray(arr);
		
		odd=new int[oddCount(arr)];
		
		even=new int[evenCount(arr)];
		
		
		
		for(int i=0, oddI=0, evenI=0 ;i<arr.length;i++) {
			
			if(arr[i]%2!=0) {
				odd[oddI]=arr[i];
				oddI++;
			}else {
				even[evenI]=arr[i];
				evenI++;
			}
			
		}
		
		System.out.print("Odd Array:");
		a.outputArray(odd);
		
		System.out.print("Even Array:");
		a.outputArray(even);
		
		
		
	}

}
