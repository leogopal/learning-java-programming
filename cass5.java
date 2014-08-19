import java.util.Scanner;
public class cass5
{
public static void main(String[]args)
{
Scanner a=new Scanner(System.in);
System.out.print("Enter string:");
String txt=a.nextLine();
for(int i=0;i<txt.length();i++)
{
char z=txt.charAt(i);
switch(z)
{
case'a':case'e':case'i':case'o':case'u':case'A':case'E':case'I':case'O':case'U':
break;
default:
System.out.print(z);
}
}
}
}