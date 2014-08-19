import java.util.Scanner;
public class CassJul1
{
public static void main (String[]args)
{
Scanner z=new Scanner(System.in);
System.out.print("Enter string:");
String txt=z.nextLine();
int n=txt.length();
System.out.println("String length:"+n);
System.out.println(txt);
int c=0;
for(int i=0;i<txt.length();i++)
{
char a=txt.charAt(i);
switch(a)
{
case'a':case'e':case'i':case'o':case'u':case'A':case'E':case'I':case'O':case'U':
a='x';
c=c+1;
break;
}
System.out.print(a);
}
System.out.print("\n"+"Number of vowels:"+c);
}
}