package jdbc;


import java.sql.*;
import java.util.*;
public class InsertDemo {
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement ps=null;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter ID : ");
        int id=s.nextInt();
        System.out.print("Enter Name : ");
        String name=s.next();
        System.out.print("Enter english marks : ");
        int marks=s.nextInt();
        
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver"); 
        	 con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/studentdetail","root","Comnet@123");  

            
            String str="Insert into student(rollno,name, marks) values(?,?,?)";
            ps=con.prepareStatement(str);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, marks);
            int ans =ps.executeUpdate();
            if(ans>0)
            	System.out.println("Record inserted");
            
            //System.out.println("Record Inserted");
            
        } catch (Exception e) {
            System.out.println("Problem");
            e.printStackTrace();
        }
    }
}
