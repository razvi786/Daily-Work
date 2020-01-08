//4. Write a program in C to count a total number of duplicate elements in an array.

package Arrays;

import java.util.ArrayList;

public class Duplicate {
	
	public static boolean inserted(int[] a,int x) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==x)
				return true;
		}
		
		return false;
		
	}
	
	//Creating a 2 dimensional array
	
//	public static int duplicateAdvanced(int[] a) {
//		
//		int arr[][]=new int[2][];
//		
//		for(int i=0;i<a.length;i++) {
//			
//		}
//		
//		
//		
//		
//		
//		
//	}
	
	public static int duplicateArrayList(int[] a) {
		
		int count=0;
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				
				if(i==j) //dont compare with self element
					continue;
				else {
					
					if(a[i]==a[j]) { //if both elements are same
						
						if(al.contains(a[i])) { //checking if it is  already added in the list
							
							continue;
							
						}else {
							
							al.add(a[i]);  //adding to the list and increasing the duplicate count
							
							count++;
							
						}
						
					}
						
					
				}
				
			}
			
		}
		
		return count;
		
		
	}
	
	public static int duplicateNatural(int[] a) {
		
		int count=0;
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					count++;
					
					for(int k=i-1;k>=0;k--) {
						
						if(a[k]==a[i]) {
							count--;
							break;
						}
							
					}
					
					break;
					
				}
			}
		}
		
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Array a=new Array();
		
		int arr[];
		
		arr=a.inputArray();
		
		a.outputArray(arr);
		
//		int dup=duplicateArrayList(arr);
		
		int dup=duplicateNatural(arr);
		
		System.out.println("No. of Duplicate Elements are: "+dup);

	}

}
