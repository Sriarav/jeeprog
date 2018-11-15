import java.util.*;
public class StringNoFn
{
  static int length(String s1)
  {
	  int co=0;
	  char ar[]=s1.toCharArray();
	  for(char c: ar)
	  {
		  co++;
	  }
	  System.out.println("Length is "+co);
	  return co;
  }
  public static void main(String arg[])
  {
	  String s="Java eligibility test 1";
	  int count=1,len;
	  len=length(s);
	  for(int i=0;i<len-1;i++)
	  {
		  if((s.charAt(i)==' ')&&(s.charAt(i+1)==' '))
			  count++;
	  }
	  System.out.println("Nummber of words is "+count);
  }
}
