package com.cts.practise;

public class MatrixMultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]=new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};

		int b[][]=new int[][] {
			{1,1,1},
			{1,1,1},
			{1,1,1}
		};
		
		int mul[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					mul[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(mul[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
