   import java.io.*;
   import java.sql.*;

    public class TestDatabase
   
   {
       public static void main (String[] args) throws SQLException,IOException
      {
         BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
      
         DiseasesDataBase DB = new DiseasesDataBase();
        
        // System.out.println("\f");
         System.out.println();
         char choice = ' '; 
         do
         {         
            System.out.println("        MENU");
            System.out.println();
            System.out.println("    A -Sorted records ");
            System.out.println("    B -lung conditions over 50 ");
            System.out.println("    C - change high to severe");
            System.out.println("    D - insert record");
            System.out.println("    E - certain conditions");
            System.out.println("    F - middle age");
            System.out.println("    G -subsidy ");
            System.out.println("    H -count heart conditions ");
            System.out.println("    I -low pollution outside jhb ");  
            
            System.out.println("    Q - QUIT");
            System.out.print("    Your Choice - ");
            choice = inKb.readLine().toUpperCase().charAt(0);
            System.out.println(" ");
            switch(choice)
            {
                case 'A':{
                            DB.selectAllQuery();
                            break;
                        }
                case 'B':{
                            DB.selectAgeQuery();
                            break;
                        }
                case 'C':{
                            DB.updateQuery();
                            break;
                         }  
                case 'D':{
                            DB.insertQuery();
                            break;
                        }
                case 'E':{
                            DB.getConditionQuery();
                            break;
                        }
                case 'F':{
                            DB.getMiddleAgeQuery();
                            break;
                        }
                case 'G':{
                            DB.getSubsidyQuery();
                            break;
                        }
                case 'H':{
                            DB.countHeartQuery();
                            break;
                        }
                case 'I':{
                            DB.getNotJhbQuery();
                            break;
                        }
            }
          }
          while (choice != 'Q');    
      
          DB.disconnect();
          System.out.println("Done");     
      }
   }