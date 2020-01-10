//SMS Language
//SMS language or textese (also known as txt-speak, txtese, chat speak, txt, txtspk, txtk, txto, textinglanguage, txt lingo, SMSish, txtslang,or txt talk) is a term for the abbreviations and slang commonly used with mobile phone text messaging.
//Some of the abbreviations used are
//•	s for yes
//•	u for you
//•	2day for today
//•	y for why
//Many grandpa's have started sending SMSes to their grand children. But they are not familiar withthe SMS lingo.
//Can you help them by writing a program that would convert a given text in proper English to SMSlingo? Consider only the 4 words listed above.
//Input Format:
//Input consists of a single string. Assume that the maximum length of the string is 200 and all letters are in lower-case.
//Output Format:
//Output consists of a single string.
//Sample Input 1:
//where were you yesterday?
//Sample Output 1:
//where were u sterday?
//Sample Input 2:
//why is today a working day for you?
//Sample Output 2:
//y is 2day a working day for u?


package com.cts.hw;

import java.util.Scanner;

public class SMSLingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("----SMS LINGO----");
		System.out.print("Enter The Message: ");
		String s=sc.nextLine();
		
		if(s.contains("yes")) {
			s=s.replaceAll("yes", "s");
		}
		
		if(s.contains("you")) {
			s=s.replaceAll("you", "u");
		}
		
		if(s.contains("today")) {
			s=s.replaceAll("today", "2day");
		}
		
		if(s.contains("why")) {
			s=s.replaceAll("why", "y");
		}
		
		System.out.println("SMS Lingo Text is: "+s);
		
	}

}
