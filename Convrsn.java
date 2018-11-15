package Collection;
import java.util.*;
public class Convrsn
{
	public static void main(String[] args)
	{
		
		ArrayList a = new ArrayList();
		a.add("Assassins");
		a.add("creed");
		a.add("Black");
		a.add("flag");
		System.out.println(a);
		a.add("121");
		a.add("153");
		a.add("11");
        System.out.println(a);
        
        for(Object val:a)
        {
        
        	if(val instanceof String)
        	{
        		String name = (String)val;
        	    System.out.println(name);
        	}
        	else
        	{
        		Integer num = (Integer)val;
        		System.out.println(num);
        	}
        }
		
		
	}
}
