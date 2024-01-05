//used another if stmt to find even or odd
import java.util.Scanner;
class Test1
{
public static void checkEvenOdd(int a)
{
if((a/2)*2==a)
System.out.println("EVEN");
else
System.out.println("ODD");
}
public static void main(String args[])
{
Scanner scobj=new Scanner(System.in);
int n=scobj.nextInt();
Test1.checkEvenOdd(n);
}
}

