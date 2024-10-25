<%@page import="CRUD.Edit_values"%>
<%@page import="common.User_Bean"%>
<%@page import="CRUD.Insert_Values"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String sl_no=request.getParameter("sl_no");
String email=request.getParameter("email");
String phone=request.getParameter("phone");
String user_name=request.getParameter("user_name");
String hire_date=request.getParameter("hire_date");
String salary=request.getParameter("salary");
String job_title=request.getParameter("job_title");
User_Bean obj_User_Bean=new User_Bean();
obj_User_Bean.setSl_no(sl_no);
obj_User_Bean.setUser_name(user_name);
obj_User_Bean.setPhone(phone);
obj_User_Bean.setEmail(email);
obj_User_Bean.setHire_date(hire_date);
obj_User_Bean.setSalary(salary);
obj_User_Bean.setJob_title(job_title);
Edit_values obj_Edit_values=new Edit_values();
obj_Edit_values.edit_user(obj_User_Bean);
%>
<script type="text/javascript">
window.location.href="http://localhost:8080/UTS_MANDIRI_RPL/insert_values.jsp"
</script>
</body>
</html>