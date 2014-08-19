   import java.util.*;
    public class ArrayofNumbers
   {
       public static void main(String[]args)
      {
         double[] noslist=new double[7];
         Scanner a=new Scanner(System.in);
         int i;
         double x=noslist[0];
         double tot=0;
         double y=0;;
         for(i=0;i<7;i++)
         {
            System.out.print("Enter number "+(i+1));
            System.out.print(" : ");
            noslist[i]=a.nextDouble();
            tot=tot+noslist[i];
            if (noslist[i]>=x)
            {
               x=noslist[i];
               y=i+1;
            }
         }
         System.out.println();
         System.out.println();
         System.out.println("THE FOLLOWING ARE NUMBERS IN THE ARRAY");
         for(i=0;i<7;i++)
         {
            System.out.print(noslist[i]);
            System.out.print("  ");
         }
         double avg=tot/7;
         System.out.println("\n"+"Average:"+avg);
         System.out.println("Largest number:"+x);
         System.out.println("Position of largest number:"+y);
      
      
      }
   }