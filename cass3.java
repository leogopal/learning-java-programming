import java.util.Scanner;
public class cass3
{
public static void main(String[]args)
{
Scanner a=new Scanner(System.in);
System.out.print("Enter string:");
String txt=a.nextLine();
txt=txt.toLowerCase();
int c=0;
for(int i=0;i<txt.length();i++)
{
char z=txt.charAt(i);
switch(z)
{
case'a':case'e':case'i':case'o':case'u':
c=c+1;
break;
}
}
System.out.print("Number of vowels:"+c);
}
}