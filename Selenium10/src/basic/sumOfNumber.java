package basic;

public class sumOfNumber {

	public static void main(String[] args) {

			int a=123;
			int num = 0,res=0;
			
			while(a!=0)
			{
				num=a%10;
				res=res+num;
				a=a/10;
			}
			System.out.println(res);
	}

}
