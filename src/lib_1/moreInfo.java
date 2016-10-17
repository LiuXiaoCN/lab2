package lib_1;

import java.util.*;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import lib_1.book;
import lib_1.author;
import org.apache.struts2.*;
import com.sun.xml.internal.bind.v2.runtime.Name;
import com.opensymphony.xwork2.ActionSupport;
import jdk.nashorn.internal.ir.RuntimeNode.Request;
public class moreInfo extends ActionSupport {
	public String authorid;
	public String title;
	
	public book bookInfo;
	public author authorInfo;
	public String moreInfo()
	{
		String ret = ERROR;
	    Connection conn = null;
	  
	    try {
	         String URL = "jdbc:mysql://cnkupipfazxq.rds.sae.sina.com.cn:10631/bookdb";
	         Class.forName("com.mysql.jdbc.Driver");
	         conn = DriverManager.getConnection(URL, "root", "522181");
	         String sql = "SELECT * FROM author WHERE";
	         sql+=" authorid = ?";
	         PreparedStatement ps = conn.prepareStatement(sql);
	         ps.setString(1, authorid);
	         ResultSet rs = ps.executeQuery();
	         HttpServletRequest request=ServletActionContext.getRequest();
	         
	         if (rs.next()) {
	             String name= rs.getString("name");
	             int age= rs.getInt("age");
	             String country= rs.getString("country");
	             authorInfo=new author(authorid,name,age,country);
	         }
	         else
	        	 return ERROR;
	         String sql2 = "SELECT * FROM book WHERE";
	         sql2+=" title = ?";
	         PreparedStatement ps2 = conn.prepareStatement(sql2);
	         ps2.setString(1, title);
	         ResultSet rst = ps2.executeQuery();
	         if(rst.next()){
	        	 String ISBN=rst.getString("ISBN");
	        	 String title=rst.getString("title");
	        	 String publisher =rst.getString("publisher");
	        	 String publishdate=rst.getString("publishdate");
	        	 String price = rst.getString("price");
	        	 bookInfo=new book(ISBN,title,authorid,publisher,publishdate,price);
	         }
	         request.setAttribute("bookInfo",bookInfo);
	         request.setAttribute("authorInfo", authorInfo);
	         ret=SUCCESS;
	      } catch (Exception e) {
	         ret = ERROR;
	      } finally {
	         if (conn != null) {
	            try {
	               conn.close();
	            } catch (Exception e) {
	            }
	         }
	      }
	      return ret;
	   }
	}
	
