import java.util.*;
class Arithmetic
{
    public static void main(String argv[])
	{
		int base,power,num;
		double root,result;
		Scanner Obj=new Scanner(System.in);
		System.out.println("Enter the root number");
		num= Obj.nextInt();
		System.out.println("Enter the base number");
		base= Obj.nextInt();
		System.out.println("Enter the power number");
		power= Obj.nextInt();
		root = Math.sqrt(num);
		result = Math.pow(base,power);
		System.out.println("The squareroot:"+root);
		System.out.println("The result:"+result);
	}
}
