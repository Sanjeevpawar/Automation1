package WebdriverMethods;

public class occurence {

	public static void main(String[] args) {
		
		String []a= {"java","java","c","python","python","python","python"};
		int flag =0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]=="python")
			{
				flag=flag+1;
				
			}
			
		}
		System.out.println(flag);
		
	}

}
