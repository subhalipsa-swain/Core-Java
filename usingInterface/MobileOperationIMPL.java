package usingInterface;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MobileOperationIMPL implements MobileOperation{
	private Connection con=null;
	private String query=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private int status=0;
	//insert
	public int addMobile(Mobile mobile) {
		try {
			con=DatabaseConnection.getConnection();
			query="insert into mobile(brandName,price,modelNo,ram,storage,createdDate)values(?,?,?,?,?,now())";
			ps=con.prepareStatement(query);
			ps.setString(1, mobile.getBrandName());
			ps.setDouble(2, mobile.getPrice());
			ps.setString(3, mobile.getModelNo());
			ps.setString(4, mobile.getRam());
			ps.setString(5, mobile.getStorage());
			status=ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}
	//view
	public List<Mobile> viewMobiles(){
		List<Mobile> listMobile = new ArrayList<Mobile>();
		try {
			con=DatabaseConnection.getConnection();
			query="Select id,brandName,price,modelNo,ram,storage,createdDate,updatedDate from Mobile";
			ps=con.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next()) {
				Mobile m=new Mobile();
				m.setId(rs.getInt(1));
				m.setBrandName(rs.getString(2));
				m.setPrice(rs.getDouble(3));
				m.setModelNo(rs.getString(4));
				m.setRam(rs.getString(5));
				m.setStorage(rs.getString(6));
				m.setCreatedDate(rs.getString(7));
				m.setUpdatedDate(rs.getString(8));
				
				listMobile.add(m);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listMobile;
	}
	public int updateMobile(Mobile mobile) {
		try {
			con=DatabaseConnection.getConnection();
			query="update Mobile set brandName=?,price=?,modelNo=?,ram=?,storage=?,updatedDate=now()where id=?";
			ps=con.prepareStatement(query);
			ps.setString(1,mobile.getBrandName());
			ps.setDouble(2, mobile.getPrice());
			ps.setString(3, mobile.getModelNo());
			ps.setString(4, mobile.getRam());
			ps.setString(5, mobile.getStorage());
			ps.setInt(6, mobile.getId());
			status=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	public int deleteMobile(int id) {
		try {
			con=DatabaseConnection.getConnection();
			query="Delete from mobile where id=?";
			ps=con.prepareStatement(query);
			ps.setInt(1,id);
			status=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
