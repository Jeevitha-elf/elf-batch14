package practice;

public class TwoDimensionalArray2 {

	public static void main(String[] args) {
		int[][] a= {{3,2,1},{5,4,6},{8,7,9}};
		//System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			int smallest=a[0][i];
			for(int j=1;j<a[i].length;j++) {
				if(a[j][i]<smallest) {
					smallest=a[j][i];
			}
		}
			System.out.println(smallest);

   }

}

}
