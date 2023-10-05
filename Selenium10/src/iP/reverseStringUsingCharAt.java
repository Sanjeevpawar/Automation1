package iP;

public class reverseStringUsingCharAt {

	public static void main(String[] args) {
		String s="I will be back in the game";
		String reverse="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
	}
		

}
