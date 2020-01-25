//Java Program to Sort Elements in Lexicographical Order (Dictionary Order)

package com.cts.practise;

public class SortLexicographical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name=new String[] {"syed","alas","hema","rupa","juma","anas"};
		
		for(int i=0;i<name.length-1;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i].compareTo(name[j])==1) {
					String temp=name[i];
					name[i]=name[j];
					name[j]=temp;
					
//					for(int k=0;k<name.length;k++) {
//						System.out.print(name[k]+" ");
//					}
//					System.out.println();
				}
				
			}
		}
		
		
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+" ");
		}

	}

}
