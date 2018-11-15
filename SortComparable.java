package Collection;

public class SortComparable implements Comparable<SortComparable>
{
	int regno,sal;
	String name,dept;
	SortComparable(int regno,String name,int sal,String dept)
	{
		this.regno=regno;
		this.name=name;
		this.sal=sal;
		this.dept=dept;
	}
	public String toString()
	{
		return "registration number is::" +regno +" "+ "employee name::"+name+" "+"Salary per month ::"+sal+" "+"Belongs to::"+dept;
	}
	@Override
	public int compareTo(SortComparable o) 
	{
		return Integer.compare(this.regno, o.regno);
	}
	
	
  
}
