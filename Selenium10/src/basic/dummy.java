package basic;



public class dummy {

	public static void main(String[] args) {
		
		String [] s= {"sony","akai","sansui","Onida"};
		int [] s1= {1,2,3,4};
		
		for(String s2:s)
		{
			for(int i=0;i<=s1.length-1;i++)
			System.out.println(s2+" "+s1[i]);
		}
	}

}
