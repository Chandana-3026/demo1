//java program to find whether the input character is an alphabet or not
//for input we have "scanner class"
//ascii vlaue of A starts from 65 and ascii value of a starts from 97
import java.util.Scanner;
class Test3
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);
if((c>='A' && c<='Z')||(c>='a' && c<='z'))
System.out.println("YES");
else
System.out.println("NO");
}
}
