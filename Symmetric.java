import java.util.Scanner;
public class Symmetric
{
public static void main(String[] args)
{
int row,col,i,j,flag=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of rows");
row=in.nextInt();
System.out.println("Enter the number of cols");
col=in.nextInt();
int mat[][]=new int[row][col];
System.out.println("Enter the values");
for(i=0;i<row;i++)
for(j=0;j<row;j++)
mat[i][j]=in.nextInt();
for(i=0;i<row;i++)
for(j=0;j<row;j++)
if(mat[i][j]!=mat[j][i])
{
flag=1;
}
if(flag==1)
        System.out.println( "No");
    else
        System.out.println ( "Yes");
}
}
