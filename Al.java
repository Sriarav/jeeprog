package Collection;
import java.util.*;
public class Al 
{
  public static void main(String agv[])
  {
	
	Student st1=new Student (48,"Sri","Mech");
	Student st2=new Student (101,"Raj","Civil");
	Student st3=new Student (215,"Sug","Eee");
	
	ArrayList<Student> ar=new ArrayList<>();
	ar.add(st1);
	ar.add(st2);
	ar.add(st3);
	//ar.remove(st2);
	
	for(Student s: ar)
	{
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.dept);
	}
	System.out.println();
	ar.remove(st2);
	
		for(Student s: ar)
		{
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.dept);
		}
	Iterator<Student> it=ar.iterator();
	while(it.hasNext())
	{
		Student list= it.next();
		System.out.print(list.id);
		System.out.print(": :"+list.name);
		System.out.print(": :"+list.dept);
		System.out.println();
		
	}
  }
}
