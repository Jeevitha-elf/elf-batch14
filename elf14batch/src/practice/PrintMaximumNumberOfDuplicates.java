package practice;

public class PrintMaximumNumberOfDuplicates {
	static char ch1;
	public static void main(String[] args) {
	int max;
		
		String str="jjjvva";
		char maxChar = 0;
		int[] count=new int[str.length()];
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			count[i]=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					
					count[i]++;
					
					
					}
				}
			}
		max=count[0];
		for(int i=0;i<count.length;i++) {
			if(max<count[i]) {
				maxChar=ch[i];
}
		}
		

		System.out.println(maxChar);
}
}
