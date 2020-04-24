import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Login() {
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
		 response.setContentType("text/html;charset=utf-8");
		String userName = request.getParameter("student_no");//取得用户名
		 String password = request.getParameter("student_Password");//取得密码
		 DBUtil db = new DBUtil();//构建数据库对象
		 boolean canLogin = db.loginSuccess(userName, password);
		
		 String user="";
		 try{
				//注册驱动
				Class.forName("com.mysql.jdbc.Driver");
				//连接数据库
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scores","root","1214478365");
				//获取连接
				Statement st=(Statement) conn.createStatement();
				//获取动态name值
				String sql5 = "select * from student where student_no = "+userName;
				ResultSet rs = st.executeQuery(sql5);
				while (rs.next()){user=rs.getString("student_user");}
		 }catch(Exception e){
			 System.out.println("出错了"+e);
		 }
		 
		 
		 if(canLogin){//根据登陆情况，跳转页面
			 request.getSession().setAttribute("user", user);//设置session标记
			 request.getSession().setAttribute("stu", userName);
			 response.sendRedirect(request.getContextPath()+"/index.jsp");
			 return;
		 }else{
			 response.getWriter().write("用户名密码不正确!");
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
