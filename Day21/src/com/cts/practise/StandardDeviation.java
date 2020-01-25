//Java Program to Calculate Standard Deviation

package com.cts.practise;

public class StandardDeviation {
	
	static double standardDeviation(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		double mean=sum/arr.length;
		double sigma=0;
		for(int i=0;i<arr.length;i++) {
			sigma+=Math.pow(arr[i]-mean,2);
		}
		double sd=Math.sqrt(sigma/arr.length);
		return sd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[] { 9, 2, 5, 4, 12, 7, 8, 11, 9, 3, 7, 4, 12, 5, 4, 10, 9, 6, 9, 4};
		
		double sd=standardDeviation(arr);
		
		System.out.println(sd);
		

	}

}
