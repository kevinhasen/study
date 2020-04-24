import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Update extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Update() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String javaweb = request.getParameter("javaweb");
		String computer = request.getParameter("computer");
		String english = request.getParameter("english");
		String math = request.getParameter("math");
		String student = request.getParameter("student_no");
		
		try{
			//注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//连接数据库
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scores","root","1214478365");
			String sql1="update course set javaweb=?,computer=?,english=?,math=? where student_no=?";
			PreparedStatement state1=(PreparedStatement) conn.prepareStatement(sql1);
			state1.setString(1, javaweb);
			state1.setString(2,computer);
			state1.setString(3,english);
			state1.setString(4,math);
			state1.setString(5,student);
			state1.executeUpdate();
			System.out.println("写入成功");
		}catch(Exception e){
			System.out.println("出错了"+e);
		}
		
		List listProjectName = new ArrayList();  
		String Tem = "";
		try{
			//注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//连接数据库
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scores","root","1214478365");
			//获取连接
			Statement st=(Statement) conn.createStatement();
			//获取动态name值
			String sql4 = "select * from course where student_no = "+student;
			ResultSet rs = st.executeQuery(sql4);
			ResultSetMetaData md = rs.getMetaData();
			//读取列表
			while (rs.next()){
				 Map rowData = new HashMap();  
				 for (int i = 1; i <= md.getColumnCount(); i++) {  
		                rowData.put(md.getColumnName(i), rs.getObject(i));  
		            }  
				 listProjectName.add(rowData); 
				 }
			 rs.close();  
				//获取session对象
		        request.setAttribute("listProjectName", listProjectName);  
		        Tem = "/Show.jsp";  
			}catch(Exception e){
				System.out.println("出错了"+e);
			}
			//不带值的跳转
			//response.sendRedirect(request.getContextPath()+"/show_inf.jsp");
			//准备跳转到此页面
			RequestDispatcher rd = request.getRequestDispatcher(Tem);
			rd.forward(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
