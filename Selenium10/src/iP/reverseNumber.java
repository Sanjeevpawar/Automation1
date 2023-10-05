package iP;

public class reverseNumber {

	public static void main(String[] args) {
		int n=1234556;
		int res=0;
		int a=0;
		
		while(n!=0)
		{
			a = n%10;
			res=res*10+a;
			n=n/10;
		}
		System.out.println(res);
	}
	
}
