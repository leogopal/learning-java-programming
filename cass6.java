import java.util.Scanner;
public class cass6
{
public static void main(String[]args)
{
Scanner a=new Scanner(System.in);
System.out.print("Enter string:");
String txt=a.nextLine();
int c=1;
for(int i=0;i<txt.length();i++)
{
if (txt.charAt(i)==' ') c=c+1;
}
System.out.print("Number of words:"+c);
}
}