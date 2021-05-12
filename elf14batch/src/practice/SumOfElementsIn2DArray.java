package practice;

public class SumOfElementsIn2DArray {
	public static void main(String[] args) {
		int[][] a= {{3,2,1},{5,4,6},{7,8,9}};
		//System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			int sum=a[i][0];
			for(int j=1;j<a[i].length;j++) {
				sum=sum+a[i][j];
			}

			System.out.println(sum);
		}
	}

}


