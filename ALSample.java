import java.util.*;
class Student
{
	int rollno;
	String name;
	int age;
	Student(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		System.out.println("ROLLNO: "+rollno +"NAME: "+name+"   AGE: "+age);
		return null;
		
	}
}
public class ALSample
{
  public static void main(String arg[])
  {
	  Student s1=new Student(101,"Sri",23);
	  Student s2=new Student(102,"Raj",22);
	  Student s3=new Student(103,"Ajay",26);
	  Student s4=new Student(104,"Indhu",23);
	  ArrayList <Student> al=new ArrayList<>();
	  al.add(s1);
	  al.add(s2);
	  al.add(s3);
	  al.add(s4);
	  Iterator itr=al.iterator();
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
  }
}
