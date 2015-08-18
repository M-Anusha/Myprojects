package com.anusha.copy;
import java.util.Scanner;

public class Ass1
{ 
int a,b,c; 
static double k; 
public double sol()
{
System.out.println("Enter the coefficients");
Scanner in=new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
double l,j,x;
k=b*b-(4*a*c);
Math.sqrt(k);
l=-b/(2*a);
j=k/(2*a);
x=l+j;
return k;
}
public static void main(String verizon[])throws Exception
{
Ass1 r= new Ass1();
r.sol();
if (k<0)
{
System.out.println("Exception Raised");
throw new Exception("Roots are imaginary");
}
else 
{
System.out.println("Roots are real");
}
}
}



