import java.util.ArrayList;
import java.util.HashSet;

public class Duplicates {
	public static void main(String[] args) {
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("Java");
		ls.add("python");
		ls.add("Java");
		ls.add("python");
		
		HashSet<ArrayList<String>> hs = new HashSet<ArrayList<String>>();
		hs.add(ls);
		
	
		System.out.println(hs);
		
		
	}

}
