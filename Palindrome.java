import java.util.Scanner;
public class Palindrome
{
public static void main(String[]args)
{
Scanner a=new Scanner(System.in);
System.out.print("Enter string:");
String txt=a.nextLine();
txt=txt.toLowerCase();
int b=1;
int j=txt.length();
for (int i=0;i<txt.length()/2;i++)
{

j=j-1;
if(txt.charAt(i)!=txt.charAt(j)) 
{
b=2;
break;
}
}
if(b==1) System.out.print("The string is a palindrome.");
else System.out.print("The string is not a palindrome.");
}
}