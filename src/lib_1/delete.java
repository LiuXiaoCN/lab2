package lib_1;

import java.util.*;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.*;
import com.sun.xml.internal.bind.v2.runtime.Name;
import com.opensymphony.xwork2.ActionSupport;
import jdk.nashorn.internal.ir.RuntimeNode.Request;
public class delete extends ActionSupport {
	public String ISBN;
	
	public String delete()
	{
		String ret=ERROR;
	    Connection conn = null;
	  
	    try {
	         String URL = "jdbc:mysql://cnkupipfazxq.rds.sae.sina.com.cn:10631/bookdb";
	         Class.forName("com.mysql.jdbc.Driver");
	         conn = DriverManager.getConnection(URL, "root", "522181");
	         
	         Statement stmt=conn.createStatement(); 
			 int i=stmt.executeUpdate("delete from book where ISBN='"+ISBN+"'");
			 if(i==1)
				 ret=SUCCESS;
			 else
				 ret=ERROR;
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
	

