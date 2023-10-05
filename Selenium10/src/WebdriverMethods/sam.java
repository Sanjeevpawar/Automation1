package WebdriverMethods;

public class sam {

	public static void main(String[] args) {

		String s="India is my country";
		String s1="";
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
			
		}
		System.out.println(s1);
		
	}

}
