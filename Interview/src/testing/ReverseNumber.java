package testing;

public class ReverseNumber {

	public static void main(String[] args) {
			int a=123;
			int temp,rem=0;
			
			while(a!=0)
			{
				temp=a%10;
				rem=rem+temp;
				a=a/10;
				
			}
			
			System.out.println(rem);
	}

}
