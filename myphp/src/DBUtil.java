import java.sql.*;
public class DBUtil {
	boolean bInited = false;
	 //加载驱动
	 public void initJDBC() throws ClassNotFoundException {
	 //加载MYSQL JDBC驱动程序
	 Class.forName("com.mysql.jdbc.Driver");
	 bInited = true;
	 System.out.println("Success loading Mysql Driver!");
	 }
	 
	 public Connection getConnection() throws ClassNotFoundException,
	 SQLException{
	 if(!bInited){
	 initJDBC();
	 }
	 Connection conn = DriverManager.getConnection(
	 "jdbc:mysql://localhost:3306/scores","root","1214478365");
	 return conn;
	 }
	 
	 
	 public boolean loginSuccess(String userName,String password){
	 boolean returnValue = false;
	 String sql = "SELECT * FROM student";
	 Connection conn = null;
	 Statement stmt = null;
	 ResultSet rs = null;
	 
	 try{
	 conn = getConnection();
	 stmt = conn.createStatement();
	 rs = stmt.executeQuery(sql);
	 while(rs.next()){
	 String userNameInDB = rs.getString("student_no");
	 String passwordInDB = rs.getString("student_Password");
	 if(userNameInDB.equals(userName) &&
	 passwordInDB.equals(password)){
	 returnValue = true;
	 break;
	 }
	 }
	 }catch (ClassNotFoundException e) {
	 e.printStackTrace();
	 }catch (SQLException e) {
	 e.printStackTrace();
	 }
	 
	 return returnValue;
	 
	 }
}
