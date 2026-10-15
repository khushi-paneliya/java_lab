import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.sql.*;
public class insert
{
   public static void main(String[] args)
   {
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con= DriverManager.getConnection("jdbc:mysql:///db_connect","root","");
           Statement st =con.createStatement();

           String qry="insert into info(id,name) values(1,'khushi')";
           int ans = st.executeUpdate(qry);
           System.out.println(ans + "record inserted ");
       }
       catch (Exception e)
       {
           System.out.println(e);
       }
   }
}
