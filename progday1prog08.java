class A
{
public  static void funA1()
{
System.out.println("FunA1 called from class A");
}
public  static void funA2()
{
System.out.println("FunA2 called from class A");
}
}
class C1
{
public static void main(String args[])
{
A.funA1();
A.funA2();
}
}