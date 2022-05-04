package Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Createtable {
	
		
		final static String create_table="create_table EMP(int password,String username)";
		public static void main(String[] args) {
			try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		
		String url="jdbc:mysql://localhost:3306/Student";
		String username="root";
		String password="kalyani";
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","kalyani");
		System.out.println("DB connection is done");
		
		Statement statement=connection.createStatement();
		String Query="select * from EMP";
		
		int resultSet=statement.executeUpdate(create_table);
		System.out.println("table created");
		}catch(Exception e)
			{
			System.out.println(e);
			}

}
}
