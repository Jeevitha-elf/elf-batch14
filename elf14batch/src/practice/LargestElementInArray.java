package practice;

public class LargestElementInArray {
	public static void main(String[] args) {
		int[] a= {1,3,8,9,5,11,2,6};
		for(int i=0;i<a.length;i++) {
			int max=a[i];
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>max) {
			      max=a[j];
				}
			}
			System.out.println(max);
			break;
		}
		
	}
}
