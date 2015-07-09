<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<!--[if IE 8 ]><html lang="en" class="ie8"><![endif]-->
<!--[if IE 9 ]><html lang="en" class="ie9"><![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="en">
<!--<![endif]-->
<head>
	<meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<!-- stylesheet for demo and examples -->
	<link rel="stylesheet" href="style.css">
	<!--[if lt IE 9]>
	<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
	<script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
	<![endif]-->
	
	<!-- custom scrollbar stylesheet -->
	<link rel="stylesheet" href="css/jquery.mCustomScrollbar.css">
	<link rel="stylesheet" href="css/style_1.css">
	 <link href="dist/css/bootstrap.min.css" rel="stylesheet"> 
         <style type="text/css">
body
{
    margin:0px;
    padding:0px;
    height:100%;
    float:left;
    
    }
.side
    {
        padding:10px;
        width:220px;
        height:100%;
        background:#2c87f0;
        }
#edit
{
    text-align:right;
    width:100%;
  
    }
#img
{
    padding:10px;
    height:200px;
    width:200px;
    }
#name
{
    padding:10px;
    }
 ::-webkit-input-placeholder {
    color:    black;
}
  
input
{
    background:transparent;
    border:0px solid;
    outline:none;
    color:Black;
    }

#head
{
margin:0.5em;
width:100%;
    }
#subhead
{
    margin:1em;
    margin-top:-0.5em;
    width:95%;
    }
</style>
</head>

<body>
    
    
    <form action="upload" method="post" enctype="multipart/form-data">
        <input type="file" name="file" id="file" onchange="f222()"  />
                <input type="submit" value="upload"  />
            </form>
   
    <form action="update.jsp">
    <div class="content mCustomScrollbar"
         style="background:gray; padding:0px; margin:0px;width:200px; height:600px; position:fixed">
        <%
            
Connection con = null;
String url = "jdbc:mysql://localhost:3306/";
String db = "closeworld";
String driver = "com.mysql.jdbc.Driver";
String userName ="root";
String password="root";
Statement st;

Integer userid1= (Integer)session.getAttribute("userid");
try{
Class.forName(driver).newInstance();
con = DriverManager.getConnection(url+db,userName,password);
st = con.createStatement();
String query = "select * from profile where userid="+userid1;
ResultSet rs = st.executeQuery(query);
while(rs.next()){
%>
<div id="edit">
<a onclick="edit()" 
   data-original-title="Edit this user" 
   data-toggle="tooltip" type="button" 
   class="btn btn-sm btn-warning">
<i class="glyphicon glyphicon-edit" ></i> 
<input type="button" width="90px" style=" background:transparent;border:0px solid;outline:none;color:Black;z-index:-1; " 
       name="button1" value="Edit" /></a>
    <input type="submit" value="save" />
</div>

<input type="text" name="file2" id="file2" style="display:none;" />
 <script type="text/javascript">
           
    function f222(){
            var x=document.getElementById("file").value;
            document.getElementById("file2").value=x;   
        }
        
    </script>
<img id="img" src="<%=rs.getString("pic_url")%>" />


<input name="name" id="head" type="text" disabled value="Name" style="display:none;"/>
<input name="name-1" type="text" id="head" class="form-control"  value="<%=rs.getString("name1")%>" disabled/>

<input name="location" id="head" type="text" disabled value="Location"/>
<input name="location-1" class="form-control" type="text" id="subhead" value="<%=rs.getString("location")%>" disabled/>

<input name="education" id="head" type="text" disabled value="education"/>
<input name="education-1" class="form-control" type="text"  id="subhead" value="<%=rs.getString("education")%>" disabled/>


<input name="language" id="head" type="text" disabled value="language"/>
<input name="language-1" type="text"  id="subhead" value="<%=rs.getString("language")%>" class="form-control" disabled/>


<input name="contact" id="head" type="text"  value="contact no" disabled/>
<input name="contact-1" type="text" id="subhead" value="<%=rs.getString("contact_no")%>" class="form-control" disabled/>


<input name="hometown" id="head" type="text" disabled value="Hometown" />
<input name="hometown-1" type="text"  id="subhead" value="<%=rs.getString("home_town")%>" class="form-control" disabled/>

<input name="dob" type="text" id="head" value="Date of birth"  disabled />
<input name="dob-1" type="text"  id="subhead" value="<%=rs.getString("dob")%>" class="form-control" disabled/>

 </div>
        <%
}
%>
<%
}
catch(Exception e){
e.printStackTrace();
}
%>

</form>
<script language="javascript" type="text/javascript" >
    function edit() {
        var i = document.getElementsByName("button1")[0].value;
        if (i == "Save") {
            //save
            
            document.getElementsByName("name")[0].disabled = true;
            document.getElementsByName("name")[0].style.border = "0 solid #0000ff";
            document.getElementsByName("name")[0].background = "#000000";
            
           
            document.getElementsByName("location-1")[0].disabled = true;
            document.getElementsByName("location-1")[0].style.border = "0 solid #0000ff";
            document.getElementsByName("location-1")[0].background = "#000000";
            
            document.getElementsByName("education-1")[0].disabled = true;
            document.getElementsByName("education-1")[0].style.border = "0 solid #0000ff";
            document.getElementsByName("education-1")[0].background = "#000000";
             
            document.getElementsByName("language-1")[0].disabled = true;
            document.getElementsByName("language-1")[0].style.border = "0 solid #0000ff";
            document.getElementsByName("language-1")[0].background = "#000000";
            
            document.getElementsByName("contact-1")[0].disabled = true;
            document.getElementsByName("contact-1")[0].style.border = "0 solid #0000ff";
            document.getElementsByName("contact-1")[0].background = "#000000";
            
            document.getElementsByName("hometown-1")[0].disabled = true;
            document.getElementsByName("hometown-1")[0].style.border = "0 solid #0000ff";
            document.getElementsByName("hometown-1")[0].background = "#000000";
            
            document.getElementsByName("dob-1")[0].disabled = true;
            document.getElementsByName("dob-1")[0].style.border = "0 solid #0000ff";
            document.getElementsByName("dob-1")[0].background = "#000000";
            
            document.getElementsByName("button1")[0].value = "Edit";
        }
        else {
            //edit
          

            document.getElementsByName("name-1")[0].disabled = false;
            document.getElementsByName("name-1")[0].style.border = "thin solid";
            
            document.getElementsByName("location-1")[0].disabled = false;
            document.getElementsByName("location-1")[0].style.border = "thin solid";
            
            document.getElementsByName("education-1")[0].disabled = false;
            document.getElementsByName("education-1")[0].style.border = "thin solid";
            
            document.getElementsByName("language-1")[0].disabled = false;
            document.getElementsByName("language-1")[0].style.border = "thin solid";
            
            document.getElementsByName("contact-1")[0].disabled = false;
            document.getElementsByName("contact-1")[0].style.border = "thin solid";
            
            document.getElementsByName("hometown-1")[0].disabled = false;
            document.getElementsByName("hometown-1")[0].style.border = "thin solid";
            
            document.getElementsByName("dob-1")[0].disabled = false;
            document.getElementsByName("dob-1")[0].style.border = "thin solid";
           
            document.getElementsByName("button1")[0].value = "Save";
        }
        }
</script>
	
       
</body>
</html>