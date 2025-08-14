package Preparedstatement;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import JDBCStatement.DbConnection;
public class LaptopOperationPre {
	
		//insert
		public static int addLaptop(String brandName,String ram,float price,String email,String pass) {
			int status=0;
			try {
				Connection con=DbConnection.getCon();
				String query="insert into Laptops(Brandname,RAM,price,email,pass)values(?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1, brandName);
				ps.setString(2, ram);
				ps.setFloat(3, price);
				ps.setString(4, email);
				ps.setString(5, pass);
				
				status=ps.executeUpdate();
				
			} catch (Exception e) {
				e.printStackTrace();

			}
			return status;
		}
		//view
		public static void viewLaptop() {
			try {
				Connection con=DbConnection.getCon();
				String query=" select id,brandname,ram,price,email,pass from laptops";
				PreparedStatement ps=con.prepareStatement(query);
				ResultSet rs=ps.executeQuery();
				while (rs.next()) {
					System.out.println("Laptop ID : "+rs.getInt(1));
					System.out.println("Laptop BrandName : "+rs.getString(2));
					System.out.println("Laptop RAM : "+rs.getString(3));
					System.out.println("Laptop Rs : "+rs.getFloat(4));
					System.out.println("Laptop email :"+rs.getString(5));
					System.out.println("Laptop pass :"+rs.getString(6));
					System.out.println("---------------------------");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//update
		public static int updateLaptop(int id,String brandName,String ram,float price,String email,String pass) {
			int status=0;
			try {
				Connection con=DbConnection.getCon();
				String query="update Laptops set Brandname=?,RAM=?,Price=?,email=?,pass=?where id=?"; 
				PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1, brandName);
				ps.setString(2, ram);
				ps.setFloat(3, price);
				ps.setString(4, email);
				ps.setString(5, pass);
				ps.setInt(6, id);
				status=ps.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}
			return status;
		}	
		//delete
		public static int deleteLaptop(int id) {
			int status=0;
			try {
				Connection con=DbConnection.getCon();
				String query="Delete from Laptops where id =?";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setInt(1, id);
				status=ps.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}
			return status;
		}
		//login
		public static int login(String email,String pass) {
			int status=0;
			try {
				Connection con=DbConnection.getCon();
				String query="select count(*) from student where email=? and pass=?";
				System.out.println(query);
				
				PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1, email);
				ps.setString(2, pass);
				
				ResultSet rs=ps.executeQuery();
				while (rs.next()) {
					status=rs.getInt(1);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return status;
		}
}



