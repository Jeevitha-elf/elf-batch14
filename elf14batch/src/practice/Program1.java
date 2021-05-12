package practice;

import java.util.HashSet;

public class Program1 {
	public static void main(String[] args) {
		int []arr= {2,3,5,1,4,6,5,2,3,5,1,4,6,5};
		HashSet<String> h1 =new HashSet<String>();
		int sum=7;
		/*int arry[]=new int[h1.size()];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			h1.add(arr[i]);
		}
		
		for(Integer x : h1) {
			arry[count]= x;
			count++;	
		}	*/
		for(int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==sum ) {
					
				String st=arr[i]+"+"+arr[j]+"="+sum;
				
					h1.add(st);

      }
    }
  }
		for(String s:h1) {
		System.out.println(s);
}
} 
}