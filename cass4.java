import java.util.*;
public class cass4
{
public static void main(String[]args)
{
Scanner z=new Scanner (System.in);
System.out.print("Enter a word:");
String word=z.nextLine();
int x=word.length();
while(x!=0)
{
word=word.substring(0,x);
System.out.println(word);
x=x-1;
}
}
}