//Display ASCII List

package com.cts.practise;

public class ASCIIList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=33;i<127;i++) {
			System.out.println(i+" : "+(char)i);
			if(i==47||i==57||i==64||i==90||i==96||i==122)
				System.out.println();
		}

	}

}
