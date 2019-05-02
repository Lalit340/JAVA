import java.sql.*;

/* A demo show how to use Statement.executeUpdate(sql). */
public class Example2
{
    public static void main(String argv[])
    {
        try
        {
            Class.forName("com.hxtt.sql.text.TextDriver").newInstance();

            //Please change "." to your database directory
            //Please see Connecting to the Database section of Chapter 2. Installation in Development Document
            String url = "jdbc:Text:/.";

            //Please replace it with an SQL CREATE, INSERT, UPDATE, DELETE or DROP statement.
            //You should read SQL syntax in HXTT Text (CSV) Development Document
            String sql="update test set boolean1=not boolean1 where int1%2=0";

            Connection con = DriverManager.getConnection(url, "", "");

            Statement stmt=con.createStatement();

            int updateCount=stmt.executeUpdate(sql);
            System.out.println(sql+" : "+updateCount);

            stmt.close();
            con.close();
        }
        catch( Exception e )
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
