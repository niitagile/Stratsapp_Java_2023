package jdbc;
import java.sql.*; 
class OracleCon{  
	public static void main(String args[]){  

		try{  
			//step1 load the driver class  
			Class.forName("com.mysql.cj.jdbc.Driver");  

			//step2 create  the connection object 

			/* Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@//10.113.18.158:1521:xe","sys","oracle123"); */

			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/studentdetail","root","Comnet@123");  

			//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
			//step3 create the statement object  
			Statement stmt=con.createStatement();  

			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from student");  
			//System.out.println(rs.next());
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString("name"));  

			//step5 close the connection object

			con.close();  

		}catch(Exception e){ e.printStackTrace();}  



	}  
}
