package CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import common.DB_Connection;
import common.User_Bean;
public class Edit_values {
public User_Bean get_value_of_user(String sl_no){
	DB_Connection obj_DB_Connection=new DB_Connection();
	Connection connection=obj_DB_Connection.get_connection();
	PreparedStatement ps=null;
	ResultSet rs=null;
	User_Bean obj_User_Bean=new User_Bean();
	try {
	 String querry="select * from karyawan where sl_no=?";
	 ps=connection.prepareStatement(querry);		
	 ps.setString(1, sl_no);;
	 rs=ps.executeQuery();
	 while(rs.next()){
	  obj_User_Bean.setSl_no(rs.getString("sl_no"));
	  obj_User_Bean.setEmail(rs.getString("email"));
	  obj_User_Bean.setUser_name(rs.getString("user_name"));
	  obj_User_Bean.setPhone(rs.getString("phone"));
	  obj_User_Bean.setJob_title(rs.getString("job_title"));
	  obj_User_Bean.setHire_date(rs.getString("hire_date"));
	  obj_User_Bean.setSalary(rs.getString("salary"));
         }
	} catch (Exception e) {
	System.out.println(e);
	}
	return obj_User_Bean;
}
public void edit_user(User_Bean obj_User_Bean){
	DB_Connection obj_DB_Connection=new DB_Connection();
	Connection connection=obj_DB_Connection.get_connection();
	PreparedStatement ps=null;
	try {
	String querry="update karyawan set user_name=?,email=?,phone=?,job_title=? ,hire_date =?,salary=? where sl_no=?";
	 ps=connection.prepareStatement(querry);		
	 ps.setString(1, obj_User_Bean.getUser_name());;
	 ps.setString(2, obj_User_Bean.getEmail());;
	 ps.setString(3, obj_User_Bean.getPhone());;
	 ps.setString(4, obj_User_Bean.getJob_title());;
	 ps.setString(5, obj_User_Bean.getHire_date());;
	 ps.setString(6, obj_User_Bean.getSalary());;
	 ps.setString(7, obj_User_Bean.getSl_no());;
	 ps.executeUpdate();
	} catch (Exception e) {
	System.out.println(e);
	}
}
}