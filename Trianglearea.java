import java.util.*;
class TriangleArea
{
	private double base;
	private double height;
	double area;
	public double getBase()
	{
	return base;	
	}
	public void setBase(double b)
	{
	base=(b>0)?b:-b;
	}
	public double getHeight()
	{
	return height;	
	}
	public void setHeight(double h)
	{
	height=(h>0)?h:-h;
	}
	double calcArea(double c,double d)
	{
	area= (0.5*c*d);
	return area;
	}
	public static void main(String argv[])
	{
	double n,m;
	Scanner scan = new Scanner(System.in);
	TriangleArea Tri = new TriangleArea();
	System.out.println("Enter base");
	n=scan.nextDouble();
	System.out.println("Enter height");
	m=scan.nextDouble();
	Tri.setBase(n);
	Tri.setHeight(m);
	System.out.println("The area is"+Tri.calcArea(Tri.getBase(),Tri.getHeight()));
	}
}	