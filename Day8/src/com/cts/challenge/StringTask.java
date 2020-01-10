//Consider the string str="Global Warming"
//    Write statements in Java to implement the following
//    a) To display the last four characters.
//    b) To display the substring starting from index 4 and ending at index 8.
//    c) To check whether string has alphanumeric characters or not.
//    d) To trim the last four characters from the string.
//    e) To trim the first four characters from the string.
//    f) To display the starting index for the substring "Wa".
//    g) To change the case of the given string.
//    h) To check if the string is in title case.
//    i) To replace all the occurrences of letter "a" in the string with "*"
// kochi le piller
package com.cts.challenge;

public class StringTask {

	public static boolean titleCase(String str) {
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++) {
			char ch;
			for(int j=0;j<words[i].length();j++) {
				ch=words[i].charAt(j);
				if(j==0){
					if(!Character.isUpperCase(ch)) 
						return false;
				}else {
					if(Character.isUpperCase(ch))
						return false;
					}
				}
				
			}
		return true;
	}

	public static void checkTitle(String str) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Global Warming";

		// a
		System.out.println("a) " + str.substring(str.length() - 4));
		// b
		System.out.println("b) " + str.substring(4, 9));

		// c
		System.out.println("c) " + str.matches("[a-zA-Z0-9]+"));

		// d
		System.out.println("d) " + str.substring(0, str.length() - 4));

		// e
		System.out.println("e) " + str.substring(4));

		// f
		System.out.println("f) " + str.indexOf("Wa"));

		// g
		StringBuffer sb2 = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isUpperCase(c)) {
				sb2.append(Character.toLowerCase(c));
			} else if (!Character.isUpperCase(c)) {
				sb2.append(Character.toUpperCase(c));
			} else {
				sb2.append(" ");
			}
		}
		System.out.println("g) " + sb2);

		// h
		boolean flag = titleCase(str);

		if (flag)
			System.out.println("h) Title Case");
		else
			System.out.println("h) Not Title Case");

		// i
		StringBuffer s1 = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				s1.append("*");
			} else {
				s1.append(str.charAt(i));
			}
		}
		System.out.println("i) " + s1);

	}

}
