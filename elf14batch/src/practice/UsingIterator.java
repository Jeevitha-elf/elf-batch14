package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {
	public static void main(String[] args) {
		ArrayList<String> a1 =new ArrayList<String>();
		a1.add("10");
		a1.add("20");
		a1.add("30");
		
		Iterator i1= a1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}
