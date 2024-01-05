import java.util.Scanner;
class Demo3
{
public static int add(int a,int b)
{
return a+b;
}
public static void printTable(int a)
{
for(int i=0;i<=10;i++)
System.out.println(a+"*"+i+"="+a*i);
}
public static void main(String args[])
{
Scanner scobj=new Scanner(System.in);
int n1=scobj.nextInt();
int n2=scobj.nextInt();
int res=Demo3.add(n1,n2);
System.out.println(res);
Demo3.printTable(n1);
Demo3.printTable(n2);
}
}
