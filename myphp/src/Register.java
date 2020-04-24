import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Register extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Register() {
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
		String account=request.getParameter("student_no");
		String user=request.getParameter("student_user");
	    String password=request.getParameter("student_password");
			
	    try{
	    	 // 加载驱动  
	    	Class.forName("com.mysql.jdbc.Driver");
	        //   数据库连接
	        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/scores","root","1214478365");
	     // 插入注册信息的SQL语句(使用?占位符)  
	        String sql="insert into student(student_no,student_user,student_password) values(?,?,?)";
	     // 创建PreparedStatement对象  
	        PreparedStatement state=(PreparedStatement) conn.prepareStatement(sql);
	        state.setString(1,account);
	        state.setString(2,user);
	        state.setString(3,password);
	        // 执行更新操作
	        state.executeUpdate();
	        System.out.println("添加成功！");
	        request.getSession().setAttribute("user",user);//设置session标记
	        request.getSession().setAttribute("stu",account);
	        response.sendRedirect(request.getContextPath()+"/Score.jsp");
	    }catch(Exception e){
	    	System.out.println("出错了"+e);
	    }
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
