package org.fasttrackit.dao;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
						" (id INTEGER not NULL auto_increment primary key,user_name VARCHAR(60) NOT NULL,full_name VARCHAR(60) NULL,"
						+ "adress VARCHAR(150) NULL," + "phone_number VARCHAR(25) NULL,comment VARCHAR(500) NULL,"
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
					+ "(user_name,full_name,adress,phone_number,comment,"
					+ " statute)"+ " values (?,?,?,?,?,?)"; 
			
			
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
			
			String insertUser = "UPDATE blackList set"+ 
					" id=?,full_name=?,user_name=?,adress=?,phone_number=?,comment=?,statute=? where id ='"+blackList.getId()+"'";
			
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
		
		public void deleteBlackList(BlackList blackList) throws SQLException {
			DBHelper helper = new DBHelper();
			Connection con = helper.getConnectionSocietate();
			String deleteRow = "DELETE FROM blackList WHERE id=?";
			PreparedStatement ps = con.prepareStatement(deleteRow);
			ps.setInt(1, blackList.getId());
			ps.executeUpdate();
			helper.closeConnection(con);
		}
		
		// get blackList by id
		
		public BlackList getBlackListId(int id) throws SQLException{
			DBHelper helper = new DBHelper();
			Connection con = helper.getConnectionSocietate();
			String getUser = "SELECT*FROM blackList where id ='"+id+"'";
		      Statement stmt = con.createStatement();
		      ResultSet rst = stmt.executeQuery(getUser);
		      BlackList blackList = null;
			while(rst.next()) {
		    	 
		    	     String userName = rst.getString("user_name");
		    	     String fullName = rst.getString("full_name");
		    		 String adress = rst.getString("adress");
		    		 String phoneNumber = rst.getString("phone_number");
		    		 String comment = rst.getString("comment");
			    	 String statute = rst.getString("statute");
			    	blackList = new BlackList(id,userName,fullName,adress,phoneNumber,comment,statute);
		    		 
			    	  }
			
			return blackList;	
		}
		
		// get all announcement form blackList
		
				public ArrayList<BlackList> getAllBlackList() throws SQLException{
					BlackList blackList =null;
					ArrayList<BlackList> blackList1 = new ArrayList<BlackList>();
					DBHelper helper = new DBHelper();
					Connection con = helper.getConnectionSocietate();
					String getUser = "SELECT*FROM blackList";
				      Statement stmt = con.createStatement();
				      ResultSet rst = stmt.executeQuery(getUser);
				      while(rst.next()) {
				    	     int id = rst.getInt("id");
				    	     String userName = rst.getString("user_name");
				    	     String fullName = rst.getString("full_name");
				    		 String adress = rst.getString("adress");
				    		 String phoneNumber = rst.getString("phone_number");
				    		 String comment = rst.getString("comment");
				    		 String statute = rst.getString("statute");
				    		 blackList = new BlackList(id,userName,fullName,adress,phoneNumber,comment,statute);				    		
				    		 blackList1.add(blackList);
					    	  }
					
					return blackList1;
					
				}
				
				
	// get allblackList by userName
				
           public ArrayList<BlackList> getAllBlackListUser(String user_name) throws SQLException{
        	   BlackList blackList= null;
					ArrayList<BlackList> allBlackList = new ArrayList<BlackList>();
					DBHelper helper = new DBHelper();
					Connection con = helper.getConnectionSocietate();
					String getUser = "SELECT*FROM blackList where user_name ='"+user_name+"'";
				      Statement stmt = con.createStatement();
				      ResultSet rst = stmt.executeQuery(getUser);
				      while(rst.next()) {
				    	     int id = rst.getInt("id");
				    	     String userName = rst.getString("user_name");
				    	     String fullName = rst.getString("full_name");
				    	     String adress = rst.getString("adress");
				    	     String phoneNumber = rst.getString("phone_number");
				    		 String comment = rst.getString("comment");
				    		 String statute = rst.getString("statute");
				    		 blackList = new BlackList(id,userName,fullName,adress,phoneNumber,comment,statute);
				    		allBlackList.add(blackList);
					    	  }
					
					return allBlackList;
           }
}



