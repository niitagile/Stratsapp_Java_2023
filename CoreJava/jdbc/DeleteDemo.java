package jdbc;
import java.sql.*;
import java.util.*;
public class DeleteDemo {
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement ps=null;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter ID : ");
        int id=s.nextInt();
        
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver"); 
       	 con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/studentdetail","root","Comnet@123");  

            
            String str="Delete from student  where rollno=?";
            ps=con.prepareStatement(str);
            ps.setInt(1, id);
            int ans=ps.executeUpdate();
            
            if (ans>0)
            System.out.println("Record Deleted");
            else
            	System.out.println("Record not found");
            
        } catch (Exception e) {
            System.out.println("Problem");
            e.printStackTrace();
        }
    }
}
