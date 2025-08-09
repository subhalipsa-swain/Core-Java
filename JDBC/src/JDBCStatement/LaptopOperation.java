package JDBCStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import LaptopCRUD.DbConnection;

public class LaptopOperation {
	//insert
	public static int addLaptop(String brandName,String ram,float price) {
		int status=0;
		try {
			Connection con=DbConnection.getCon();
			String query="insert into Laptops(Brandname,RAM,price)values('"+brandName+"','"+ram+"','"+price+"')" ;
			Statement st=con.createStatement();
			status=st.executeUpdate(query);
			
		} catch (Exception e) {
			e.printStackTrace();

		}
		return status;
	}
	//view
	public static void viewLaptop() {
		try {
			Connection con=DbConnection.getCon();
			String query=" select id,brandname,ram,price from laptops";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while (rs.next()) {
				System.out.println("Laptop ID : "+rs.getInt(1));
				System.out.println("Laptop BN : "+rs.getString(2));
				System.out.println("Laptop RM : "+rs.getString(3));
				System.out.println("Laptop Rs : "+rs.getFloat(4));
				System.out.println("---------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//update
	public static int updateLaptop(int id,String brandName,String ram,float price) {
		int status=0;
		try {
			Connection con=DbConnection.getCon();
			String query="update Laptops set Brandname='"+brandName+"',RAM='"+ram+"',Price='"+price+"'where id="+id; 
			Statement st=con.createStatement();
			status=st.executeUpdate(query);
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
			String query="Delete from Laptops where id ="+id;
			Statement st=con.createStatement();
			status=st.executeUpdate(query);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
