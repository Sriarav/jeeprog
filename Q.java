import java.util.*;
public class Q
{
	double a,b,c;
	double result;
	void getnum()
	{
	Scanner Obj=new Scanner(System.in);
	System.out.println("Input a:");
	a=Obj.nextDouble();
	System.out.println("Input b:");
	b=Obj.nextDouble();	
	System.out.println("Input c:");
	c=Obj.nextDouble();
	}
	public void check(double a,double b,double c)
		{
		result=b*b-4*a*c;
		if(result==0){
			double r1= -b/(2*a);
			display(r1);
			}
		else if(result>0.0)
			{
			double r1 = -b+Math.pow(result,0.5)/(2*a);
			double r2 =-b-Math.pow(result,0.5)/(2*a);
			display(r1,r2);
			}
		else
			display();
				
		}
	void display(){
			System.out.println("The equation has no real roots");
			}
	void display(double num){
			System.out.println("The root of the equation is"+num);
			}
	void display(double num1,double num2){
			System.out.println("The root 1 is" +num1);
			System.out.println("The root 2 is" +num2);
			}	
}
public class Eqn extends Q
{
	public static void main(String args[])
	{
	Eqn var = new Eqn();
	//Scanner Obj = new Scanner (System.in);
	var.getnum();
	var.check(var.a,var.b,var.c);
	}
}