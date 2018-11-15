import java.util.*;
class Armstrong
{
	public static void  main(String argv[])
	{
	int num,temp,result=0,p;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the number to verify");
	num= scan.nextInt();
	temp=num;
	while(num>0)
		{
		p=num%10;
		result=result+p*p*p;
		num/=10;
		}	
	if(result==temp)
		{
		System.out.println("Armstrong number");
		}
	else
		{
		System.out.println("Not Armstrong number");
		}
	}

}