

<%@page import="java.sql.*"%>
<%!private static final String INSERT_QUERY = "INSERT INTO STUDENT_JSP VALUES(?,?,?)";
	private static final String SELECT_QUERY = "SELECT * FROM STUDENT_JSP";
	private Connection con;
	private PreparedStatement ps1, ps2;
	private ResultSet rs;

	public void jspInit() {
		try {
			//create Servlet config obj.
			ServletConfig sc = null;
			String s1 = null, s2 = null, s3 = null, s4 = null;

			sc = getServletConfig();
			//read input values
			s1 = sc.getInitParameter("driver");
			s2 = sc.getInitParameter("url");
			s3 = sc.getInitParameter("user");
			s4 = sc.getInitParameter("pwd");
			//load driver class
			Class.forName(s1);
			//get connection object
			con = DriverManager.getConnection(s2, s3, s4);
			//create preparedStatement obj
			ps1 = con.prepareStatement(INSERT_QUERY);
			ps2 = con.prepareStatement(SELECT_QUERY);
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (ClassNotFoundException cfn) {
			cfn.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}%>

<%
	String pval = null;
	int sid = 0, result = 0;
	String name = null, addr = null;
	ResultSetMetaData rsm = null;

	//read param value
	pval = request.getParameter("reg");
	//if condition
	if (pval.equalsIgnoreCase("Registration")) {
		//read form data
		sid = Integer.parseInt(request.getParameter("id"));
		name = request.getParameter("name");
		addr = request.getParameter("addr");
		//set ps values
		ps1.setInt(1, sid);
		ps1.setString(2, name);
		ps1.setString(3, addr);
		//execute query
		result = ps1.executeUpdate();
		if (result == 0){
%>
<b>Registration failed</b>
<%
		}//inner if 
		else {
%>
<b>Registration Succeded</b>
<%    }//inner else
	} //outer if()
	else {

		//execute query
		rs = ps2.executeQuery();
		//resultset meta data
		rsm = rs.getMetaData();
%>
<
<table>
	<tr>
		<%
			for (int i = 1; i <= rsm.getColumnCount(); i++) {
		%>
		<td><%=rsm.getColumnLabel(i)%></td>
		<%
			}
		%>
	</tr>
	<%
		while (rs.next()) {
	%>
	<tr>
		<%
			for (int i = 1; i < rsm.getColumnCount(); i++) {
		%>
		<td><%=rs.getString(i)%></td>
		<%
			}
		%>
	</tr>
	<%
		} //while
	%>
</table>

<%
	} //else
%>

   <a href="form.html">Go to Home</a>
   
   <%!
     public void destroy(){
	   //close all objects
	   try{
		   if(rs!=null)
			   rs.close();
	   }catch(SQLException se){
		   se.printStackTrace();
	   }
	   try{
		   if(ps1!=null)
			   ps1.close();
	   }catch(SQLException se){
		   se.printStackTrace();
	   }  try{
		   if(ps2!=null)
			   ps2.close();
	   }catch(SQLException se){
		   se.printStackTrace();
	   }
	   try{
		   if(con!=null)
			   con.close();
	   }catch(SQLException se){
		   se.printStackTrace();
	   }
   }
   %>
  