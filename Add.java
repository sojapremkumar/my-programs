import java.io.*;
import java.util.Scanner;
class Add
{
public static void main(String arg[])
{
int a ,b,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE  1st NUMBER");
a=s.nextInt();
System.out.println("ENTER THE  2nd NUMBER");
b=s.nextInt();
s.close();
sum=a+b;
System.out.println("SUM = "+sum);
}
}

