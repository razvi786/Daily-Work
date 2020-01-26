//Java Program to Find Transpose of a Matrix

package com.cts.practise;

public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]=new int[][] {
			{1,2,3},
			{4,5,6}
		};
		
		int m=2,n=3;
		
		int transpose[][]=new int[n][m];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				transpose[j][i]=a[i][j];
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(transpose[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
