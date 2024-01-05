//+-*/%CommandLineArgumentProgram
class DDemo
{
public static int add(int a,int b){
return a+b;
}
public static int sub(int a,int b){
return a-b;
}
public static int mul(int a,int b){
return a*b;
}
public static int div(int a,int b){
return a/b;
}
public static int mod(int a,int b){
return a%b;
}
public static void main(String args[])
{
int n1=Integer.parseInt(args[0]);
int n2=Integer.parseInt(args[1]);
int res=DDemo.add(n1,n2);
int res1=DDemo.sub(n1,n2);
int res2=DDemo.mul(n1,n2);
int res3=DDemo.div(n1,n2);
int res4=DDemo.mod(n1,n2);
System.out.println(res);
System.out.println(res1);
System.out.println(res2);
System.out.println(res3);
System.out.println(res4);

}
}
