package practice;

public class Pattern1 {
	public static void main(String[] args) {
		int n=5;
		int m=3;
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++)
			{
				if(i==1 && j==3) {
					System.out.print("*");
				}
					
					
				
				else if(i+j==4 || i+j==5 ||i+j==6) 
					System.out.print("*");
				
				
				
				else if(i==3) 
					System.out.print("*");
			
				else 
					System.out.print("");
				
					
			}
			System.out.println();
		}
		
		
	}


}
