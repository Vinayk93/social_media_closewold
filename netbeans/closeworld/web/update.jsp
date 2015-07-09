


<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.*"%>



<%
    PrintWriter out1 = response.getWriter();
       String p1=request.getParameter("file2");
String p="image/"+p1;
 
String name=request.getParameter("name-1");
String location=request.getParameter("location-1");
String education=request.getParameter("education-1");
String language=request.getParameter("language-1");
String contact_no=request.getParameter("contact_no-1");
String dob=request.getParameter("dob-1");

Integer userid= (Integer)session.getAttribute("userid");


try{
out1.print("update profile set education='"+education+"',dob='"+dob+"', name1='"+name+"',location='"+location+"',contact_no="+contact_no+",language='"+language+"' where userid="+userid+";");
    Connection conn = null;
Class.forName("com.mysql.jdbc.Driver").newInstance();
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/closeworld","root", "root");
Statement st,st2=null,st3=null;

st=conn.createStatement();
st2=conn.createStatement();
st3=conn.createStatement();

st.executeUpdate("update profile set pic_url='"+p+"', education='"+education+"',dob='"+dob+"', name1='"+name+"',location='"+location+"',contact_no="+contact_no+",language='"+language+"' where userid="+userid+";");
out1.print("update profile set pic_url='"+p+"' education='"+education+"',dob='"+dob+"', name1='"+name+"',location='"+location+"',contact_no="+contact_no+",language='"+language+"' where userid="+userid+"; "+"\n");

out1.print("<BR>");

out1.print("update coment set profilepic='"+p+"' , name='"+name+"'  where userid="+userid+";"+"\n");
st2.executeUpdate("update coment set profilepic='"+p+"' , name='"+name+"'  where userid="+userid+";");
out1.print("<BR>");
out1.print("update post set profile_pic='"+p+"', name='"+name+"'  where userid="+userid+";"+"\n");
st3.executeUpdate("update post set profile_pic='"+p+"' ,name='"+name+"'  where userid="+userid+";");
out1.print("<BR>");
}
catch(Exception e){
System.out.println(e);
    }
%>