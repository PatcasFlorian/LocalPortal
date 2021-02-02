package org.fasttrackit.dao;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.fasttrackit.helper.DBHelper;
import org.fasttrackit.pojo.BlackList;
import org.fasttrackit.pojo.Mesage;

public class MesageDAO {
	
	//Create table
			public void createTableMesage() throws SQLException {
					
					DBHelper helper = new DBHelper();
					Connection con = helper.getConnectionSocietate();
					String insertUser = "CREATE TABLE IF NOT EXISTS message"+ 
							" (id INTEGER not NULL auto_increment primary key,expeditor VARCHAR(60) NOT NULL,"
							+ "destinatar VARCHAR(150) NULL," + "date VARCHAR(25) NULL,title VARCHAR(500) NULL,"
							+ "content VARCHAR(30) NULL)";
							
				      Statement stmt = con.createStatement();
				      
				       stmt.execute(insertUser);
				       helper.closeConnection(con);
				       
				}
			
			//Insert  into table mesage
			public int insertMesage( 
					Mesage mesage) throws SQLException, FileNotFoundException {
				int row = 0; 
				DBHelper helper = new DBHelper();
				Connection con = helper.getConnectionSocietate();
				
				String insertUser = "INSERT INTO message "+ "(expeditor,destinatar,date,title, "
				+ "content) values (?,?,?,?,?)"; 
				
				PreparedStatement ps = con.prepareStatement(insertUser);
				ps.setString(1, mesage.getExpeditor());
				ps.setString(2,mesage.getDestinatar());
				ps.setString(3, mesage.getDate());
				ps.setString(4, mesage.getTitle());
				ps.setString(5,mesage.getContent());
				row = ps.executeUpdate();
				
				 helper.closeConnection(con);
			     
					 return row; 
			
			}
			
			
			//update user mesage
			
			public void updateMesage(Mesage mesage) throws SQLException {
				DBHelper helper = new DBHelper();
				Connection con = helper.getConnectionSocietate();
				String insertUser = "UPDATE message set"+ 
						" id=?,expeditor=?,destinatar=?,date=?,title=?,content=? where id ='"+mesage.getId()+"'";
				
				PreparedStatement ps = con.prepareStatement(insertUser);
				ps.setInt(1,mesage.getId());
				ps.setString(2,mesage.getExpeditor());
				ps.setString(3,mesage.getDestinatar());
				ps.setString(4,mesage.getDate());
				ps.setString(5, mesage.getTitle());
				ps.setString(6,mesage.getContent());
				
				ps.executeUpdate();
				
				 helper.closeConnection(con);
				 
			}
			
}
