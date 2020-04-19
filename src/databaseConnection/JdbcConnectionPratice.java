package databaseConnection;
import java.sql.*;

public class JdbcConnectionPratice {

	public static void main(String[] args) {
		
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");//Class is a class name  and forName is a method--Register the Driver
		
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "Chennai321");// estabilish a connection
		
		//Connection is a interface
		
		//getConnection is a static method
		
		Statement st =con.createStatement();   //Statement is a interface  --Create the statement
		
		String sql="Select EMPlOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE,JOB_ID,SALARY,DEPARTMENT_ID from HR.Employees";
		
		
		
		ResultSet rs =st.executeQuery(sql); //Execute Query
		//ResultSet is a interface
		
		int rowCount =0;
		while (rs.next()){
			
			int Employee_ID =rs.getInt("Employee_ID");
			
			String FIRST_NAME =rs.getString("FIRST_NAME");
			
			String LAST_NAME =rs.getString("LAST_NAME");
			
			String EMAIL =rs.getString("EMAIL");
			
			String Phone_Number =rs.getString("PHONE_NUMBER");
			
			String Hire_date =rs.getString("HIRE_DATE");
			
			String Job_ID =rs.getString("JOB_ID");
			
			int Salary =rs.getInt("SALARY");
			
			int department_id =rs.getInt("DEPARTMENT_ID");
			
			//System.out.println(rs.getInt("EMPlOYEE_ID")+"   "+rs.getString("FIRST_NAME"));
			
			System.out.println(Employee_ID + "," +FIRST_NAME + "," +LAST_NAME + "," +EMAIL+ "," +Phone_Number + "," +Hire_date+ "," +Job_ID+ "," +Salary+ "," +department_id);
			
			
			//System.out.println(Employee_ID + "," +FIRST_NAME + "," +LAST_NAME + "," +EMAIL);
			++rowCount;
		}
			System.out.println("Total number of records" + rowCount);
		
			st.close();
			con.close();
			
		}
		catch(Exception e){
			
			System.out.println(e);
			e.printStackTrace();
			
		}
		
		
			
		}
		
}
