   import java.util.Scanner;
    public class Array2
   {
       public static void main(String[]args)
      {
         Scanner a=new Scanner(System.in);
         int[] n=new int[20];
         int x=n[0];
         for(int i=0;i<=19;i++)
         {
            n[i]=(int)(Math.random()*30)+5;
            System.out.println(n[i]);
            if(n[i]>=x) x=n[i];
         }
         System.out.print("Largest number:"+x);
      }
   }