import java.sql.*;
public class create_tab
    {
        public static void main(String args[])
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql:///db_connect","root","");
                Statement st=con.createStatement();
                String qry="create table first(roll_no int,name varchar(10))";
                int ans=st.executeUpdate(qry);
                System.out.print("Table created first try..."+ans);
            }
            catch(SQLException e)
            {
                System.out.println("error..."+e);
            }
            catch(ClassNotFoundException e)
            {
                System.out.println("error..."+e);
            }

        }
}
