//Java Program to Add Two Matrix Using Multi-dimensional Arrays

package com.cts.practise;

public class MatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]=new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};

		int b[][]=new int[][] {
			{2,2,2},
			{2,2,2},
			{2,2,2}
		};
		
		int sum[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
