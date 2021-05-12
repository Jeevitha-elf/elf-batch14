package practice;

import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String str = "java";
//		char[] ch = str.toCharArray();
//		ch
//		char[] ch1 = new char[ch.length];
		
		HashSet<Character> tr = new HashSet<>();
		for(int i=0;i<str.length();i++) {
		
		tr.add(str.charAt(i));
		
		
	  }
		 System.out.println(tr);
	}
}
