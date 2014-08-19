import java.util.*;
public class cass1
{
public static void main(String[]args)
{
Scanner z=new Scanner (System.in);
String n,s,t;
System.out.print("Enter 6-digit phone number:");
n=z.nextLine();
s=n.substring(0,1);
t=n.substring(1);
System.out.print("New number:"+s+"0"+t);
}
}