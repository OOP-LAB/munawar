
import java.util.*;
	class Main
	{
	  public static void main(String args[])
	  {
	    int count,eno,salary,key;
	    String ename;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter no. of employees");
	    count=sc.nextInt();
	    employee[] e= new employee[count];
	    System.out.println("Enter employee details");
	    for(int i=0;i<count;i++)
	    {
	      System.out.println("Enter eno");
	      eno=sc.nextInt();
	      System.out.println("Enter ename");
	      ename=sc.next();
	      System.out.println("Enter salary");
	      salary=sc.nextInt();
	      e[i]=new employee(eno,ename,salary);
	    }
	System.out.println("Enter eno to be searched");
	key=sc.nextInt();
	int flag=0;
	for(int i=0;i<count;i++)
	{
	  if(key==e[i].eno)
	  {
	    flag=1;
	    break;
	   }
	}
	if(flag==0)
	System.out.println("Employee is not present");
	else
	System.out.println("Employee is present");
	}
	}
	class employee
	{
	  int eno;
	  String ename;
	  int salary;
	  employee(int eid,String ename,int salary)
	  {
	    eno=eid;
	    ename=ename;
	    salary=salary;
	  }
	}
	      


