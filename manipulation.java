import java.util.Scanner;
public class manipulation
{
  public static void main(String args[])
  {
    System.out.println("Enter string");
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    System.out.println("Length of string="+s1.length());
    System.out.println("Character at first position="+s1.charAt(1));
    System.out.println("String contains 'Col' sequence:"+s1.contains("Col"));
    System.out.println("String ends with e:"+s1.endsWith("e"));
    System.out.println("Replace 'col' with 'kol':"+s1.replaceAll("Col","kol"));
    System.out.println("LOWER CASE:"+s1.toLowerCase());
    System.out.println("UPPER CASE:"+s1.toUpperCase());
  }
}
