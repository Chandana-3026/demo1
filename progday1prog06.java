//Program with more than 1 main method()
class B
{
public static void main()
{
System.out.println("Main Method without argument called");
}
//there can be array of integers(int x[])
public static void main(int x)
{
System.out.println("Main Method with argument call"+x*2);
}
//there cannot be array of strings[String s[])]this is same as(string args[])
public static void main(String s)
{
System.out.println("Welcome" +s);
}
public static void main(String args[])
{
System.out.println("She is typing");
main();
main(20);
main("vardhan");
}
}
  