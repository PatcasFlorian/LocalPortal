package org.fasttrackit.dao;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.fasttrackit.helper.DBHelper;
import org.fasttrackit.pojo.Annoncement;

public class BuyDAO {
	//Create table
	public void createTableSales() throws SQLException {
			
		    
			DBHelper helper = new DBHelper();
			Connection con = helper.getConnectionSocietate();
			String insertUser = "CREATE TABLE IF NOT EXISTS buy"+ 
					" (id INTEGER not NULL auto_increment primary key,user_name VARCHAR(50) NOT NULL,titlu_anunt VARCHAR(200) NULL,data_anunt VARCHAR(30) NULL,"
					+ "text_anunt VARCHAR(1000) NULL,pret_anunt VARCHAR(30) NULL,phone_number VARCHAR(30) NULL,adress VARCHAR(100) NULL,photo1 MEDIUMBLOB NULL,photo2 MEDIUMBLOB NULL,"
					+ "photo3 MEDIUMBLOB NULL,photo4 MEDIUMBLOB NULL,"
					+ "photo5 MEDIUMBLOB NULL,statute VARCHAR(30) NULL)";
					
		      Statement stmt = con.createStatement();
		      
		       stmt.execute(insertUser);
		       helper.closeConnection(con);
		       
		}
	
	//Insert  into table anunt_vanzare
	public int insertAnunt( 
			Annoncement anunt) throws SQLException, FileNotFoundException {
		
		int row = 0; 
		DBHelper helper = new DBHelper();
		Connection con = helper.getConnectionSocietate();
		InputStream fs1=anunt.getPhoto1();
		InputStream fs2=anunt.getPhoto2();
		InputStream fs3=anunt.getPhoto3();
		InputStream fs4=anunt.getPhoto4();
		InputStream fs5=anunt.getPhoto5();
		
		String insertUser = "INSERT INTO buy "
				+ "(user_name,titlu_anunt,data_anunt,text_anunt,pret_anunt, "
				+ "phone_number,adress,photo1,photo2,photo3,photo4,photo5,statute) values ( ?, ?,?,?,?,?,?,?,?,?,?,?,?)"; 
		
		
		PreparedStatement ps = con.prepareStatement(insertUser);
		ps.setString(1, anunt.getUserName());
		ps.setString(2, anunt.getTitluAnunt());
		ps.setString(3,anunt.getDataAnunt());
		ps.setString(4, anunt.getTextAnunt());
		ps.setString(5, anunt.getPretAnunt());
		ps.setString(6, anunt.getPhoneNumber());
		ps.setString(7, anunt.getAdress());
		ps.setBlob(8,fs1);
		ps.setBlob(9,fs2);
		ps.setBlob(10,fs3);
		ps.setBlob(11,fs4);
		ps.setBlob(12,fs5);
		ps.setString(13,anunt.getStatute());
		row = ps.executeUpdate();
		
		 helper.closeConnection(con);
	     
		 return row; 
	}

}
