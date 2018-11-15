import java.util.*;
public class LSNum 
{
  public static void main(String arg[])
  {
	  int a[]=new int[5];
	  Scanner scan=new Scanner(System.in);
	  for(int i=0;i<5;i++)
	  {
		  System.out.println("Enter the value for position "+i);
		  a[i]=scan.nextInt();
	  }
	  int min=a[0];
	  int max=a[0];
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]>max)
			  max=a[i];
		  if(a[i]<min)
			  min=a[i];
	  }
	  System.out.println("The largest number is "+max);
	  System.out.println("The smallest number is "+min);
  }
}
