package practice;

public class Addition {
	
	public static int  add(int ...n) {
    int sum=0;
    for(int i:n) {
    sum=sum+i;
		}
    return sum;
	}
	public static void main(String[] args) {
		int d = Addition.add(10,20,30,40);
		System.out.println(d);
		}
}
