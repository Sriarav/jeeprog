import java.util.Scanner;
class Prime
{
	public static void main(String argv[])
	{
	int num,i,k=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the nuber to check:");
	num= scan.nextInt();
	  for(i=2;i<num;i++)
		{
		   if(num%i==0)
			{
			  k=1;
			  break;
			}
		}
		if(k==1)
			{
			  System.out.println("Not prime");
			}
		   else
			{
			System.out.println("Prime");
			}
	}
}