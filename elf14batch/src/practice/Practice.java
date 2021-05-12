package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
	System.out.println("Enter String1");
	System.out.println("Enter String2");
		//String s1="tab";
		//String s2="bat";
	String s1=input.next();
	String s2=input.next();
	s1.toLowerCase();
	s2.toLowerCase();
		//s1.equalsIgnoreCase(s2);
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
	    
	   Arrays.sort(ch1);
	   Arrays.sort(ch2);
		if(ch1.length==ch2.length) {
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("String is anagram");
		}
		else {
			System.out.println("String is not anagram");
		}
		}
		else {
			System.out.println("String is not anagram");
		}
		
	}
	

}
