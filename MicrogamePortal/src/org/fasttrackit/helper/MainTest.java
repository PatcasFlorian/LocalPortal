package org.fasttrackit.helper;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

import org.fasttrackit.dao.BlackListDAO;
import org.fasttrackit.dao.BuyDAO;
import org.fasttrackit.dao.MesageDAO;
import org.fasttrackit.dao.SaleDAO;
import org.fasttrackit.dao.UserDAO;
import org.fasttrackit.password.PasswordUtils;
import org.fasttrackit.pojo.Annoncement;
import org.fasttrackit.pojo.BlackList;
import org.fasttrackit.pojo.Mesage;
import org.fasttrackit.pojo.Roles;
import org.fasttrackit.pojo.State;
import org.fasttrackit.pojo.User;

public class MainTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PasswordUtils uPassword = new PasswordUtils();
		String salt = null ;
		String adminPassword = "admin33202510";
		salt = uPassword.getSalt(30);
		String generatePassword = null;
		 generatePassword = uPassword.generateSecurePassword( adminPassword,salt);
		User superAdmin = new User("Ovidiu Milosan","+40733551555","Microgame S.R.L",
              "33202510","J05/844/2014","Oradea,Str. Muntele Gaina,Nr. 18",
             "ovidiu.milo@gmail.com",salt,generatePassword,"SUPERADMIN","ACTIVE");	
		/*
		User superAdmin1 = new User("Ovidiu Milosan Dorin","+40733551555","Microgame S.R.L",
                "33202510","J05/844/2014","Oradea,Str. Muntele Gaina,Nr. 18",
              "ovidiu.milo@gmail.com","1234","admin33202510","SUPERADMIN","ACTIVE");
              */
		Annoncement anuntCumparare = new Annoncement("Tina","cumpar","24","ceva","50","07344657823","Oradea");
		Annoncement anuntCumparare1 = new Annoncement("Gina","cumpar","24","ceva","50","07344657823","Oradea");
		Annoncement anuntCumparare2 = new Annoncement(7,"Gina","cumpar","24","ceva","50","07344657823","Oradea","active");
		Annoncement anuntCumparare3 = new Annoncement(9,"Alinaa","cumpar","56","bicicleta","50","07344657823","Oradea","active");
		BlackList blk= new BlackList(1,"Tina","Codruta","Ciucea,nr25","0656343423","ffgdfdhd","active");
		BlackList blk1= new BlackList(2,"George1","Codruta","Ciucea,nr25","0656343423","ffgdfdhd","active");
		Mesage mgs= new Mesage(1,"tina","Florin", "25","eroare","jdsjkdgfjk");
		MesageDAO msgDao= new MesageDAO();
		BlackList blk2= new BlackList();
		ArrayList<Annoncement> anuntCumparare4= new ArrayList<Annoncement>();
		ArrayList<BlackList>listBlk=new ArrayList<BlackList>();
UserDAO udao = new UserDAO();
SaleDAO sales = new SaleDAO();
BuyDAO buy= new BuyDAO();
BlackListDAO blst= new BlackListDAO();

 try {
	 msgDao.createTableMesage();
	udao.createTableUser();
	sales.createTableSales();
	blst.createTableBlackList();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 int count=0;
 try {
	// blst.insertBlackList(blk);
//buy.insertAnunt(anuntCumparare2);
// buy.updateAnunt(anuntCumparare2);
	// buy.deleteAnunt(4);
	// blst.updateblackList(blk1);
	// blst.deleteBlackList(blk);
	// blk2= blst.getBlackListId(2);
	// System.out.println("id: "+blk2.getId()+" fullName "+blk2.getUserName()+" titluAnunt "+blk2.getFullName()); 
	// listBlk=blst.getAllBlackListUser("Tina");
	 msgDao.insertMesage(mgs);
	 anuntCumparare4=buy.getAllAnuncement();
	 for(BlackList blk3:listBlk) {
		 System.out.println("id: "+blk3.getId()+" fullName "+blk3.getUserName()+" titluAnunt "+blk3.getFullName()); 
	 }
	
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
/*
if(count==0) {
	   try {
		//udao.insertUser(superAdmin);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
 }

/*
try {
	User u=udao.getOneUser("Maritan Ioan");
	System.out.println("Id "+u.getId()+"fullName "+u.getFullName()+" Role "+u.getRole1()+" Statut "+u.getStatute1()+"salt: "+u.getSalt()+ " password: "+u.getPassword());
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

try {
	ArrayList<User> user1 = udao.getUser();
	for(User u:user1) {
		System.out.println("Id "+u.getId()+"fullName "+u.getFullName()+" Role "+u.getRole1()+" Statut "+u.getStatute1()+"salt: "+u.getSalt()+ " password: "+u.getPassword());
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


try {
	udao.insertUser(superAdmin1);
} catch (SQLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
  
try {
	udao.updateUser(superAdmin, 2);
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

try {
	udao.deleteUser(2);
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
*/
        }

	

	 }


