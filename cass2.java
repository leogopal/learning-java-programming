import java.util.Scanner;
public class cass2
{
public static void main (String[]args)
{
Scanner a=new Scanner(System.in);
String sid,sdy,sdm,sdd,c,mon="";
int y,m,d,dy,dm,dd,age;
System.out.println("Enter all values in numbers, not words.");
System.out.print("Enter ID number:");
sid=a.nextLine();
System.out.print("Which century were you born in:");
c=a.nextLine();
System.out.print ("Enter current year:");
y=a.nextInt();
System.out.print ("Enter current month:");
m=a.nextInt();
System.out.print ("Enter current day:");
d=a.nextInt();
sdy=c+sid.substring(0,2);
sdm=sid.substring(2,4);
sdd=sid.substring(4,6);
dy=Integer.parseInt(sdy)-100;
dm=Integer.parseInt(sdm);
dd=Integer.parseInt(sdd);
age=y-dy;
if (m<dm) age=age-1;
else if (d<dd) age=age-1;
else age=age;
if (dm==1)mon="January";
if (dm==2)mon="February";
if (dm==3)mon="March";
if (dm==4)mon="April";
if (dm==5)mon="May";
if (dm==6)mon="June";
if (dm==7)mon="July";
if (dm==8)mon="August";
if (dm==9)mon="September";
if (dm==10)mon="October";
if (dm==11)mon="November";
if (dm==12)mon="December";
System.out.println("Age:"+age);
System.out.print("Date of birth:"+dd+" "+mon+" "+dy);
}
}