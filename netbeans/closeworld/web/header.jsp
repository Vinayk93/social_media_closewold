<%-- 
    Document   : header
    Created on : 11 Dec, 2014, 5:36:53 PM
    Author     : SACHIN KATIYAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="h" %>
<% String user=(String)session.getAttribute("user");%>
<% String first=(String)session.getAttribute("first");%>
<% String last=(String)session.getAttribute("last");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
body
{
    margin: 0px;
    padding:  0px;
    height:100%;
    width:100%;
}

#logo
{ 
    height:46px;
    width:100%;
    background:#3a5795;
    float:left;
    z-index: 1;
}

#w
{
    margin-left: 220px;
    float:left;
    margin-top: 5px;
    cursor:pointer;
}
#add
{
    z-index: 2;
}
        </style>
    </head>
    <body>
        
        <div id="logo" style="position:fixed;">
                   
                    <div id="w"><img width="150" height="40" src="image/close.png"></div>
                    <div  id="add" align="right">
                           
                       <input type="button" class="notification"  style="color:#ffffff;" align="right;" value="Notification"/>
                       <input type="button" class="message" style="color:#ffffff;" align="right;" value="Message"/>
                       <input type="button" class="friends" style="color:#ffffff;" align="right;" value="Friends"/>
                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            Welcome <%=first%>&nbsp;<%=last%>
                         </div>
                    
              </div>
        
    </body>
</html>