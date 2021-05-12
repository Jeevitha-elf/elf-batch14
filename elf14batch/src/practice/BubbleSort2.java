package practice;

public class BubbleSort2 {
	public static void main(String[] args) {
		int[] a= {3,9,10,1,11,2};
		for(int i=0;i<a.length-1;i++) {
			int smallest=a[i];
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<smallest) {
					smallest=a[j];
					int temp=smallest;
					a[j]=a[i];
					a[i]=temp;
				}
			 }
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
				}
			}
		}
			
