package basic;

public class employee {
	
	String empName;
	int empid;
	String empemail;
	String empdesignation;

	public employee(String name,int id,String email,String designation)
	{
		empName=name;
		empid=id;
		empemail=email;
		empdesignation=designation;
	}

	public employee(String name, int id)
	{
		empName=name;
		empid=id;
	}
}
