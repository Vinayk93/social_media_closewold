<%-- 
    Document   : c
    Created on : 18 Mar, 2015, 1:47:15 AM
    Author     : SACHIN KATIYAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="h" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <style>
            input[type="submit"]{
    width: 50px;
    margin: 10px;
    padding: .27em .63em;
box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;
-moz-box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;
background-color: #3a5795;
color: whitesmoke;
border: 1px solid #000 ;
text-decoration: none;
cursor: pointer;
}
#textit
{
     width: 200px;
    padding: 2px;   
    border: 1px solid #cccccc;
    box-shadow: 0 0 2px whitesmoke;
}
            </style>
    </head>
    <body>
        <table  width="100%" height="100%" border="1" cellpadding="0" cellspacing="0">
            <tr>
                <td width="420px"  valign="top">
                    <input type="text" id="textit"/> <br/>
                    <h:link action="/wiki">
                                         <input type="submit" value="submit">
                        </h:link>
                </td>
            </tr>
        </table>
        
    </body>
</html>
