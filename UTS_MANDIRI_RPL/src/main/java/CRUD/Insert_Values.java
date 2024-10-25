package CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import common.DB_Connection;
public class Insert_Values {
public void insert_values(String sl_no,String user_name,String email,String phone,String hire_date,String salary,String job_title)
{
	 DB_Connection obj_DB_Connection=new DB_Connection();
	 Connection connection=obj_DB_Connection.get_connection();
	 PreparedStatement ps=null;
	try {
String query="insert into karyawan(sl_no,user_name,email,phone,hire_date,salary,job_title) values(?,?,?,?,?,?,?)";
	 ps=connection.prepareStatement(query);
	 ps.setString(1, sl_no);
	 ps.setString(2, user_name);
	 ps.setString(3, email);
	 ps.setString(4, phone);
	 ps.setString(5, hire_date);
	 ps.setString(6, salary);
	 ps.setString(7, job_title);
	 ps.executeUpdate();
	} catch (Exception e) {
	 System.err.println(e);
	}
}
}