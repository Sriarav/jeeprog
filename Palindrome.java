import java.util.*;
class Palindrome
{
public static void main(String argv[])
{
int num,temp,result=0,s;
Scanner scan = new Scanner(System.in);
System.out.println("Enter the number to check:");
num=scan.nextInt();
temp=num;
while(num>0)
{
s=num%10;
result=(result*10)+s;
num=num/10;
}
if(temp==result)
{
System.out.println("Number is a palindrome");
}
else
System.out.println("Number is not a palindrome");
}
}