package WebdriverMethods;

public class TernaryMethod {

	public static void main(String[] args) {
		
		int a=30;
		int b=450;
		int c=55;
		int d=232;
		
		int res= a>b?(a>c?(a>d? a:d):(c>d? c:d)) : b>c?(b>d? b:d):(c>d? c:d); 
				System.out.println(res);
	}

}
