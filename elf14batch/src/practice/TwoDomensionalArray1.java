package practice;

public class TwoDomensionalArray1 {
	public static void main(String[] args) {
		int[][] a= {{3,2,1},{5,4,6},{7,8,9}};
		//System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			int largest=a[i][0];
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>largest) {
					largest=a[i][j];
			}
		}
			System.out.println(largest);
   }

	}
}
