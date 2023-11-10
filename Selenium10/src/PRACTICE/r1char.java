package PRACTICE;

public class r1char {

	public static void main(String[] args) {
		String s="India is my country";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
			
		}

		System.out.println(reverse);
	}

}
