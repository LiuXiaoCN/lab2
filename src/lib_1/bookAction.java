
package lib_1;

import java.util.*;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.*;
import com.sun.xml.internal.bind.v2.runtime.Name;
import com.opensymphony.xwork2.ActionSupport;
import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class bookAction extends ActionSupport {
	
	public String Name;
	public List<book> booklist=new ArrayList<book>();
	
	public void setname(String Name)
	{
		this.Name=Name;
	}
	
	public void setlist(List<book> booklist)
	{
		this.booklist=booklist;
	}
	
	public String getName()
	{
		return Name;
	}
	public List<book> getlist()
	{
		return booklist;
	}
	
	
	public String searchBookByName() {
	
	      String ret = ERROR;
	      Connection conn = null;
	      String authorid="";
	      try {
	         String URL = "jdbc:mysql://cnkupipfazxq.rds.sae.sina.com.cn:10631/bookdb";
	         Class.forName("com.mysql.jdbc.Driver");
	         conn = DriverManager.getConnection(URL, "root", "522181");
	         String sql = "SELECT * FROM author WHERE";
	         sql+=" name = ?";
	         PreparedStatement ps = conn.prepareStatement(sql);
	         ps.setString(1, Name);
	         ResultSet rs = ps.executeQuery();
	         HttpServletRequest request=ServletActionContext.getRequest();
	         
	         if (rs.next()) {
	            authorid = rs.getString("authorid");
	            
	         }
	         else
	        	 return ERROR;
	         String sql2 = "SELECT * FROM book WHERE";
	         sql2+=" authorid = ?";
	         PreparedStatement ps2 = conn.prepareStatement(sql2);
	         ps2.setString(1, authorid);
	         ResultSet rst = ps2.executeQuery();
	         while(rst.next()){
	        	 String ISBN=rst.getString("ISBN");
	        	 String title=rst.getString("title");
	        	 String publisher =rst.getString("publisher");
	        	 String publishdate=rst.getString("publishdate");
	        	 String price = rst.getString("price");
	        	 booklist.add(new book(ISBN,title,authorid,publisher,publishdate,price));
	         }
	         request.setAttribute("booklist",booklist);
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
