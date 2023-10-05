package basic;

public class reverseString {

	
	public static void main(String[]args)
	{
		String s="I love my country";

		String a="";

		for(int i=s.length()-1;i>=0;i--)
		{
			a=a+s.charAt(i);
		}
	System.out.println(a);
	}

}


