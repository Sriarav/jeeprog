package Collection;
import java.util.ArrayList;
import java.util.Collections;
public class Cmpble 
{
  public static void main(String argv[])
  {
	  ArrayList<SortComparable> s=new ArrayList<>();	
	    s.add(new SortComparable(48,"Sri",35000,"mech"));
	    s.add(new SortComparable(352,"mohan",16000,"ece"));
	    s.add(new SortComparable(107,"Suresh",15000,"eee"));
	    s.add(new SortComparable(201,"Guru",28000,"civil"));
	    s.add(new SortComparable(28,"karthi",55000,"mba"));
	    Collections.sort(s);
	    
	    for(SortComparable ec:s)
	    {
	    	System.out.println(ec);
	    }
	   
  }
}
