package practice;

public class ReversingAString {
	public static void main(String[] args) {
		String s="hello";
		char[] ch=s.toCharArray();
		//char[] ch = {'h','e','l','l','o'};
		String str = " ";
		for(int i=0;i<ch.length;i++) {
			str=ch[i]+str;
		}
		System.out.println(str);
	}

}
