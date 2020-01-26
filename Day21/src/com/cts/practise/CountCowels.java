//Java Program to Count the Number of Vowels and Consonants in a Sentence

package com.cts.practise;

public class CountCowels {
	
	static boolean isVowel(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String company="Cognizant is Good";
		int vowel=0;
		int consonant=0;
		
		for(int i=0;i<company.length();i++) {
			if(company.charAt(i)==' ') {
				continue;
			}else if(isVowel(company.charAt(i)))
				vowel++;
			else
				consonant++;
		}
		
		System.out.println("Vowels: "+vowel);
		System.out.println("Consonants: "+consonant);
		
		

	}

}
