   import java.util.Scanner;
    public class code
   {
       public static void main (String[]args)
      {
         Scanner z=new Scanner(System.in);
         System.out.print("Enter name:");
         String name=z.nextLine();
         int b=1;
         int j=name.length();
         int rep=name.length()/2;
         int split=name.length()-(name.length()/2);
         char x='x';
         String txt=name.toLowerCase();
         for (int i=0;i<name.length()/2;i++)
         {
            j=j-1;
            if(txt.charAt(i)!=txt.charAt(j)) 
            {
               b=2;
               break;
            }
         }
         System.out.print("CODE:");
         if(b==1)   
         {
            System.out.print(name.substring(0,split));
            for(int i=0;i<rep;i++)
            {
               System.out.print(x);
            }
         }
         if (b==2)
         {
            for(int i=0;i<name.length();i++)
            {
               char q=name.charAt(i);
               switch(q)
               {
                  case'a':case'e':case'i':case'o':case'u':case'A':case'E':case'I':case'O':case'U':
                     q=x;
               }
               System.out.print(q);
            }
         }
      }
   }