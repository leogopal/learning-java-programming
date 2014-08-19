  
   import java.sql.*;
   import java.io.*;
   import javax.swing.JOptionPane;
   
    public class DiseasesDataBase
   {
      Connection conn;
               
   
       public DiseasesDataBase ()
      {
      //load the driver
         try
         {
            Class.forName ("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println ("Driver successfully loaded");
         }
             catch (ClassNotFoundException c)
            {
               System.out.println ("Unable to load database driver");
            }
      
      
      //connect to the database
         try
         {
         
            //conn = DriverManager.getConnection ("jdbc:odbc:diseases.mdb");
            
            System.out.print("Type in the exact location of your database (FOR EXAMPLE - C:/DiseasesDB.mdb)");   
            BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
         
            String filename = "C:/DiseasesDB.mdb";
          
            String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=";
            database += filename.trim () + ";DriverID=22;READONLY=true}"; 
            conn = DriverManager.getConnection (database, "", "");
         
            System.out.println ("Connection to Diseases database successfully established");
         
         }
             catch (Exception e)
            {
               System.out.println ("Unable to connect to the database");
            }
      } //end connect
    
       public void selectAllQuery ()throws SQLException
      {
         Statement stmt = conn.createStatement (); 
         
         String sql = "SELECT* FROM ConditionsTb ORDER BY CdtnName";
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-12s%-27s%-25s%-15s%-12s%-16s%-20s","PatientID","Condition Name","Type of condition","Age","WorkPlaceID"," DateAdmitted","Hours per Days");        
         System.out.println();
         System.out.println("================================================================================================================================");   
         while (rs.next())
         {
            String id = rs.getString ("PatientID");
            String cName = rs.getString ("CdtnName");
            String cType = rs.getString ("CdtnType");
            String age = rs.getString ("Age");
            String workID = rs.getString ("WorkPlaceID");
            String date = rs.getString("DateAdmitted");
            date = date.substring(0,10);
            String hours = rs.getString("HoursPerDay");
            System.out.printf("%-10s%-27s%-20s%-8s%-12s%-16s%-20s",id,cName,cType,age,workID,date,hours);
            System.out.println();   
         } 
         System.out.println(" ");  
         stmt.close ();
      } 
   
       public void selectAgeQuery ()throws SQLException
      {
         Statement stmt = conn.createStatement (); 
         String sql = "SELECT PatientID,CdtnName,CdtnType,Age FROM ConditionsTb WHERE Age>50 AND CdtnType LIKE 'Lung%'";
         
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-10s%-27s%-20s%-12s","PatientID","Condition Name","Condition Type", "Age");  
         System.out.println();
         System.out.println("======================================================================");  
         while (rs.next ())
         {
            
            String id = rs.getString ("PatientID");
            String cn = rs.getString ("CdtnName");
            String ct = rs.getString ("CdtnType");
            String age = rs.getString ("Age");
            System.out.printf("%-10s%-27s%-20s%-12s",id,cn,ct,age);
            System.out.println();
                    
         } 
         System.out.println(" "); 
         stmt.close ();
      } 
   
      
       public void updateQuery() throws SQLException
      {
         Statement stmt = conn.createStatement (); 
         ResultSet rs=stmt.executeQuery("SELECT* FROM WorkPlacesTb;");
      	
      	
         String sql = "UPDATE WorkPlacesTb SET PollutionRiskLevel='SEVERE' WHERE PollutionRiskLevel='HIGH'";
         PreparedStatement ps=conn.prepareStatement(sql);
         
         System.out.println (" Updated ");
         rs.close();
         stmt.close(); 
         
      }
   
   
       public void insertQuery() throws SQLException
           
      {
      
         Statement stmt = conn.createStatement ();
       String sql = "INSERT INTO WorkPlacesTb VALUES('Fac012','Factory','Sasolburg','HIGH');";
        int numRows = stmt.executeUpdate (sql);
      
         System.out.println (" Record inserted");
      
         stmt.close ();
      }
   
    
       public void getConditionQuery ()throws SQLException
      {
         System.out.println("\f");
         System.out.println();
         
         Statement stmt = conn.createStatement (); 
          
         
          String sql = "
                                                                              
          ResultSet rs = stmt.executeQuery (sql);
          System.out.printf("%-10s%-27s%-20s%-12s","PatientID","Condition Name","Condition Type", "Date Submitted");  
         System.out.println();
          System.out.println("======================================================================");  
       
          while (rs.next ())
          {
            String id = rs.getString ("PatientID");
           String name = rs.getString ("CdtnName");
            String type = rs.getString ("CdtnType");
           String sDate = rs.getString ("DateAdmitted");
           sDate = sDate.substring(0,10);
            System.out.printf("%-10s%-27s%-20s%-12s",id,name, type,sDate);
            System.out.println();
                    
          } 
          System.out.println(" ");  
         stmt.close ();
      }
      
       public void getMiddleAgeQuery ()throws SQLException
      {
         System.out.println("\f");
         System.out.println();
         
         Statement stmt = conn.createStatement (); 
       /** String sql = "..." Complete the SQL statement and then uncomment the commented statements
         
       /  ResultSet rs = stmt.executeQuery (sql);
       /  System.out.printf("%-10s%-10s%-15s%-15s","PatientID","Age","WorkType","PollutionRiskLevel");  
       /  System.out.println(); 
       /  System.out.println("======================================================================"); 
       /  while (rs.next ())
       /  {
           
       /     String id = rs.getString ("PatientID");
       /     String age = rs.getString ("Age");
       /     String wplace = rs.getString ("Type of workplace");
       /     String pollution = rs.getString ("PollutionRiskLevel");          
       /     System.out.printf("%-10s%-10s%-15s%-15s",id,age,wplace,pollution);
       /     System.out.println();       
       /  } 
       /  System.out.println(" ");   */
         stmt.close ();
      } 
       public void getSubsidyQuery()throws SQLException
      {
         System.out.println("\f");
         System.out.println();
         
         Statement stmt = conn.createStatement (); 
          /** String sql = "..." Complete the SQL statement and then uncomment the commented statements  
                            
         /ResultSet rs = stmt.executeQuery (sql);
         /System.out.printf("%10s%10s%15s%15s","PatientID","Age", "HoursPerDay","Subsidy");  
         /System.out.println();  
         /System.out.println("================================================================");
        
         /while (rs.next ())
         /{
        
         /   String id = rs.getString ("PatientID");
         /   String age = rs.getString ("Age");
         /   String hours = rs.getString ("HoursPerDay");
         /   String subsidy = rs.getString("Subsidy");
         /   System.out.printf("%10s%10s%10s%22s",id,age,hours,subsidy);
         /   System.out.println();        
         / } 
         /System.out.println(" ");    */
         stmt.close ();
      } 
     
       public void countHeartQuery()throws SQLException
      {
         System.out.println("\f");
         System.out.println();
          
         Statement stmt = conn.createStatement (); 
       /** String sql = "..." Complete the SQL statement and then uncomment the commented statements
                              
        /  ResultSet rs = stmt.executeQuery(sql);   
        /  System.out.println();  
        /  System.out.println();
        /  while (rs.next ())
        / {
        /  String num = rs.getString ("Total");
        
        /  System.out.println("Number of patients with heart conditions: " + num);     
        /} 
        / System.out.println();    */
         System.out.println();
         stmt.close ();
      } 
   
       public void getNotJhbQuery()throws SQLException
      {
         System.out.println("\f");
         System.out.println();
         
         Statement stmt = conn.createStatement (); 
          /** String sql = "..." Complete the SQL statement and then uncomment the commented statements
        
       /  ResultSet rs = stmt.executeQuery (sql);
       /  System.out.printf("%-20s%-20s%-15s","Town","Type of Condition", "Type of Workplace");  
       /  System.out.println();  
       /  System.out.println("==================================================================");
       /  while (rs.next ())
       /  {
       /     String town = rs.getString ("Town");
       /     String con = rs.getString("Type of Condition");
       /     String work = rs.getString("Type of Workplace");
       /     System.out.printf("%-20s%-20s%-15s",town,con,work);
       /     System.out.println();        
       /   } 
       /  System.out.println(" ");   */
         stmt.close ();
      } // 
   
   
    
     
     
       public void disconnect () throws SQLException
      {
      
         conn.close ();
      }
   
   
   
   
   }

