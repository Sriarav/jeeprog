package Collection;
import java.util.ArrayList;
import java.util.Collections;
public class Cmprtr 
{
	public static void main(String arg[])
	{
		 ArrayList<SortComparator> s=new ArrayList<>();	
		    s.add(new SortComparator(48,"Sri",35000,"mech"));
		    s.add(new SortComparator(352,"mohan",16000,"ece"));
		    s.add(new SortComparator(107,"Suresh",15000,"eee"));
		    s.add(new SortComparator(201,"Guru",28000,"civil"));
		    s.add(new SortComparator(28,"karthi",55000,"mba"));
		    
		    Collections.sort(s,(o1,o2)->
		    {
		    	return o1.regno<o2.regno?-1:1;
		    });
		    
		    for(SortComparator obj:s)
		    {
		    	System.out.println(obj);
		    }
	}
}
