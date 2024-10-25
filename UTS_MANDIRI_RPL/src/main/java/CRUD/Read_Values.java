package CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import common.DB_Connection;
import common.User_Bean;
public class Read_Values {
public static void main(String[] args) {
	Read_Values obj_Read_Values=new Read_Values();
	obj_Read_Values.get_values();
}
public List get_values(){
	DB_Connection obj_DB_Connection=new DB_Connection();
	Connection connection=obj_DB_Connection.get_connection();
	PreparedStatement ps=null;
	ResultSet rs=null;
	List list=new ArrayList();
	try {
	String querry="select * from karyawan";
	ps=connection.prepareStatement(querry);		
	rs=ps.executeQuery();
	while(rs.next()){
	  User_Bean obj_User_Bean=new User_Bean();
	  System.out.println(rs.getString("sl_no"));
	  System.out.println(rs.getString("email"));
	  System.out.println(rs.getString("user_name"));
	  System.out.println(rs.getString("phone"));
	  System.out.println(rs.getString("hire_date"));
	  System.out.println(rs.getString("salary"));
	  System.out.println(rs.getString("job_title"));
	  obj_User_Bean.setSl_no(rs.getString("sl_no"));
          obj_User_Bean.setEmail(rs.getString("email"));
	  obj_User_Bean.setUser_name(rs.getString("user_name"));
	  obj_User_Bean.setPhone(rs.getString("phone"));
	  obj_User_Bean.setHire_date(rs.getString("hire_date"));
	  obj_User_Bean.setSalary(rs.getString("salary"));
	  obj_User_Bean.setJob_title(rs.getString("job_title"));
	list.add(obj_User_Bean);
	}
	} catch (Exception e) {
	System.out.println(e);
	}
	return list;
	}
}