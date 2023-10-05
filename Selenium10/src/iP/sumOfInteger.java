package iP;

public class sumOfInteger {

	public static void main(String[] args) {
		
			int num=987654321;
			int res=0;
			int temp=0;
			
			while(num!=0)
			{
				res=num%10;
				temp=temp+res;
				num=num/10;
				
			}
			System.out.println(temp);
	}

}
