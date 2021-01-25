package org.fasttrackit.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import org.fasttrackit.dao.SaleDAO;
import org.fasttrackit.helper.DBHelper;
import org.fasttrackit.pojo.Annoncement;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.util.Base64;
/**
 * Servlet implementation class DownloadImage
 */
@WebServlet("/DownloadImage")
public class DownloadImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	public void service(ServletRequest req,ServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
	byte[] img1 = null;
	byte[] img2 = null;
	byte[] img3 = null;
	byte[] img4 = null;
	byte[] img5 = null;
	ServletOutputStream sos = null;
	SaleDAO sdao =new SaleDAO();
	Annoncement anunt = null;
	
		try {
			anunt = sdao.getAnuncementId(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		  anunt.setPoza1( Base64.getEncoder().encodeToString(anunt.getImg1()));
         anunt.setPoza2(Base64.getEncoder().encodeToString(anunt.getImg2()));
         anunt.setPoza3(Base64.getEncoder().encodeToString(anunt.getImg3()));
         anunt.setPoza4(Base64.getEncoder().encodeToString(anunt.getImg4())); 
         anunt.setPoza5(Base64.getEncoder().encodeToString(anunt.getImg5()));
         
			req.setAttribute("anunt", anunt);
            
            String page = "WEB-INF/Home/view-annoncement.jsp";
            RequestDispatcher requestDispatcher = req.getRequestDispatcher(page);
            requestDispatcher.forward(req, resp);   
		
	}
	
	
}
