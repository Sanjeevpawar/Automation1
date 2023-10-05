package basic;

public class driverEmployeeClass {

	public static void main(String[] args) {

		employee a=new employee("sanj",2153,"sanjeevpawar@gmail.com","QA Lead");
		System.out.println(a.empName);
		System.out.println(a.empid);
		System.out.println(a.empdesignation);
		System.out.println(a.empemail);
		
		employee b=new employee("elon",2121);
		System.out.println(b.empName);
		System.out.println(b.empid);
		System.out.println(b.empemail);
	}

}
