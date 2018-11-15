import java.util.*;
class Triangle
{
	public static void main(String argv[])
	{
	int rows,k,i,j,p;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of rows");
	rows= scan.nextInt();
	p=rows-1;
	  for(i=0;i<rows;i++)
		{
		System.out.println(" ");
		  for(j=p;j>i;j--)
			{
				System.out.print(" ");
			}
		  for(k=0;k<2*i+1;k++)
			{
				System.out.print("*");
			}
		}
	}
}