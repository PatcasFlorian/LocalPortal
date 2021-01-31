package org.fasttrackit.dao;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.fasttrackit.helper.DBHelper;
import org.fasttrackit.pojo.Annoncement;
import org.fasttrackit.pojo.BlackList;
import org.fasttrackit.pojo.User;

public class BlackListDAO {

	//Create table
		public void createTableBlackList() throws SQLException {
				
			    
				DBHelper helper = new DBHelper();
				Connection con = helper.getConnectionSocietate();
				String insertUser = "CREATE TABLE IF NOT EXISTS blackList"+ 
						" (id INTEGER not NULL auto_increment primary key,user_name VARCHAR(50) NOT NULL,full_name VARCHAR(60) NULL,"
						+ "adress VARCHAR(150) NULL," + "phone_number VARCHAR(15) NULL,comment VARCHAR(300) NULL,"
						+ "statute VARCHAR(30) NULL)";
						
			      Statement stmt = con.createStatement();
			      
			       stmt.execute(insertUser);
			       helper.closeConnection(con);
			       
			}
		
		
		//Insert  into table blackList
		public int insertBlackList( 
				BlackList blackList) throws SQLException, FileNotFoundException {
			
			int row = 0; 
			DBHelper helper = new DBHelper();
			Connection con = helper.getConnectionSocietate();
			
			String insertUser = "INSERT INTO blackList "
					+ "(user_name,full_name,adress,phone_number,comment, "
					+ "statute)"+ " values ( ?, ?,?,?,?,?,?,?,?,?,?,?,?)"; 
			
			
			PreparedStatement ps = con.prepareStatement(insertUser);
			ps.setString(1, blackList.getUserName());
			ps.setString(2, blackList.getFullName());
			ps.setString(3,blackList.getAdress());
			ps.setString(4, blackList.getPhoneNumber());
			ps.setString(5, blackList.getComment());
			ps.setString(6,blackList.getStatute());
			row = ps.executeUpdate();
			
			 helper.closeConnection(con);
		     
				 return row; 
		}
		
		
		//update user blackList
		
		public void updateblackList(BlackList blackList) throws SQLException {
			DBHelper helper = new DBHelper();
			Connection con = helper.getConnectionSocietate();
			String fullName = null;
			String insertUser = "UPDATE user set"+ 
					" id=?,full_name=?,user_name=?,adress=?,phone_number=?,comment=?,statute=?, where full_name ='"+fullName+"'";
			
			PreparedStatement ps = con.prepareStatement(insertUser);
			ps.setInt(1,blackList.getId());
			ps.setString(2,blackList.getFullName());
			ps.setString(3,blackList.getUserName());
			ps.setString(4,blackList.getAdress());
			ps.setString(5, blackList.getPhoneNumber());
			ps.setString(6,blackList.getComment());
			ps.setString(7, blackList.getStatute());
			
			ps.executeUpdate();
			
			 helper.closeConnection(con);
			 
		}
		
		
		//delete blackList
		
		public void deleteBlackList(int id) throws SQLException {
			DBHelper helper = new DBHelper();
			Connection con = helper.getConnectionSocietate();
			String deleteRow = "DELETE FROM blackList WHERE id=?";
			PreparedStatement ps = con.prepareStatement(deleteRow);
			ps.setInt(1, id);
			ps.executeUpdate();
			helper.closeConnection(con);
		}
		
		
}


