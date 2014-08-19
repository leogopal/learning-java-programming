   import java.util.Scanner;
    public class Array1
   {
       public static void main(String[]args)
      {
         Scanner a=new Scanner(System.in);
         double[] n=new double[100];
         int i=0;
         int c=0;
         System.out.print("Enter number:");
         n[i]=a.nextDouble();
         while(n[i]!=-1)
         {
            i=i+1;
            System.out.print("Enter number:");
            n[i]=a.nextDouble();
            c=c+1;
         }
         for(i=0;i<c;i++)
         {
            System.out.print(n[i]);
            System.out.print("  ");
         }
      
      }
   }