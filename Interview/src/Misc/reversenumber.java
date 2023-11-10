package Misc;

public class reversenumber {

	public static void main(String[] args) {

		int num=12;
		int temp=0;
		int a=0;
		
		while(num!=0)
		{
			a=num%10;
			temp=temp*10+a;
			num=num/10;
			
		}
		System.out.println(temp);
		
	}

}
