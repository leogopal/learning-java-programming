public class CircleCircum
{
  private double radius;
  
  public CircleCircum()     //constructor gives an initial value
  {
    radius = 11.56;
  }
  
  public double getCircum()   //method
  {
     double circum = 2 * (22/7) * radius;   //making use of radius value from above
     return circum;
   }
	
}