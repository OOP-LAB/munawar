import java.util.Scanner;
public class method
{
void area(int r1)
{
double area_val=3.14*r1*r1;
System.out.println("\nArea of circle is radius"+r1+"="+area_val);
}
void area(int a1,int b1)
{
int area_val=a1*b1;
System.out.println("\nArea of rectangle is with dimensions"+a1+"x"+b1+"="+area_val);
}

void area(int a1,int b1,int c1)
{
int area_val=a1*b1*c1;
System.out.println("\nArea of cuboid is with dimensions"+a1+"x"+b1+"x"+c1+"="+area_val);
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("\nenter length");
int l=sc.nextInt();
System.out.println("\nenter bredth");
int b=sc.nextInt();
System.out.println("enter height");
int h=sc.nextInt();
System.out.println("enter radius");
int r=sc.nextInt();
method obj1=new method();
obj1.area(r);
obj1.area(l,b);
obj1.area(l,b,h);
}
}
