package select;
import java.util.HashSet;
public class JavaProgram {
   public static void main(String[] args) {
		int []arr= {2,5,6,4,6,8,3,3,4};
		HashSet<Integer> h1 =new HashSet<Integer>();
		int sum=7;
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			h1.add(arr[i]);
			
		}
		System.out.println(h1);
		int arry[]=new int[h1.size()];
		for(Integer x : h1) {
			arry[count]=(int) x;
			count++;	
		}	
		for(int i=0;i<arry.length;i++) {
			for (int j=i;j<arry.length;j++) {
				if(arry[i]+arry[j]==sum ) {
					System.out.println((arry[i]+"+"+arry[j]+"="+sum));
					
				}
			}
		}
		
	}

}
