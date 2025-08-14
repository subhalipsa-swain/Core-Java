package Optimize;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import JDBCStatement.DbConnection;

public class LaptopOperation {
	private Connection con=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String query=null;
	private int status=0;
	
	public int addLaptop(Laptop l)throws SQLException {
		int status=0;
		try {
			con=DbConnection.getCon();
			query="insert into Laptops(Brandname,RAM,price,email,pass)values(?,?,?,?,?)";
			ps=con.prepareStatement(query);
			ps.setString(1, l.getBrandName());
			ps.setString(2, l.getRam());
			ps.setFloat(3, l.getPrice());
			ps.setString(4, l.getEmail());
			ps.setString(5, l.getPass());
			
			status=ps.executeUpdate();
			ps.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();

		}
		return status;
	}
	//view
	public List<Laptop> viewLaptop()throws SQLException{
		List<Laptop> listL=new ArrayList<>();
		try {
			 con=DbConnection.getCon();
			 query=" select id,brandname,ram,price,email,pass from laptops";
			 ps=con.prepareStatement(query);
			 rs=ps.executeQuery();
			while (rs.next()) {
				Laptop l=new Laptop();
				l.setId(rs.getInt(1));
				l.setBrandName(rs.getString(2));
				l.setRam(rs.getString(3));
				l.setPrice(rs.getFloat(4));
				l.setEmail(rs.getString(5));
				l.setPass(rs.getString(6));
				listL.add(l);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listL;
	}
	//update
	public int updateLaptop(Laptop l) throws SQLException {
		int status=0;
		try {
			con=DbConnection.getCon();
			query="update Laptops set Brandname=?,RAM=?,Price=?,email=?,pass=?where id=?"; 
			ps=con.prepareStatement(query);
			ps.setString(1, l.getBrandName());
			ps.setString(2, l.getRam());
			ps.setFloat(3, l.getPrice());
			ps.setString(4, l.getEmail());
			ps.setString(5, l.getPass());
			ps.setInt(6, l.getId());
			status=ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}	
	//delete
	public int deleteLaptop(int id) throws SQLException{
		int status=0;
		try {
			con=DbConnection.getCon();
			query="Delete from Laptops where id =?";
			ps=con.prepareStatement(query);
			ps.setInt(1, id);
			status=ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	//login
	public int login(String email,String pass) throws SQLException {
		int status=0;
		try {
			con=DbConnection.getCon();
			query="select count(*) from Laptops where email=? and pass=?";
			System.out.println(query);
			
			ps=con.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, pass);
			
			rs=ps.executeQuery();
			while (rs.next()) {
				status=rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}




	

