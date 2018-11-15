package Collection;

public class SortComparator {

	int regno;
	String name;
	int sal;
	String dept;
	

	SortComparator(int regno,String name,int sal,String dept)
	{

		this.regno=regno;
		this.name=name;
		this.sal=sal;
		this.dept=dept;
	}

	public String toString(){
		return "registration number is::" +regno +" "+ "employee name::"+name+" "+"Salary per month ::"+sal+" "+"Belongs to::"+dept;
	}
	
}
