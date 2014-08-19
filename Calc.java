public class Calc
{
private double ht;
private double rad;
public Calc(double height,double radius)
{
ht=height;
rad=radius;
}
public double Volume()
{
double x=3.14*rad*rad*ht;
return x;
}
public double Lids()
{
double y=3.14*rad*rad*2;
return y;
}
}