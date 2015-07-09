<%-- 
    Document   : layout
    Created on : 11 Dec, 2014, 5:53:57 PM
    Author     : SACHIN KATIYAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-tiles" prefix="p"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CloseWorlD</title>
        <style>
            body{
                padding:0px;
                margin:0px;
                }
        </style>
    <link rel="stylesheet" href="css/jquery.mCustomScrollbar.css">
 <link rel="stylesheet" href="css/style_1.css">

    </head >
    <body style="position:fixed;">
        <div  style="overflow: hidden; width:100%;height:100%;">
          <div style="width:100% ;height:46px;">
                <p:insert attribute="header">
                    </p:insert>
            </div>
             <div style="width:100%;height:100%; float:left;">
             
                 <div style="width:220px;height:100%; float:left;">
                <p:insert attribute="menu">
                    </p:insert>
                 
                </div>
                 <div style="width:900px; height:100%;float: left;">
                  <div style="z-index:10;">
                   <p:insert attribute="status">
                   </p:insert>
                   </div>
                  <div class="content mCustomScrollbar" style="width:100%;height:600px; overflow: no; z-index: 1;">
                    <p:insert attribute="body">
                  </p:insert>
                   </div>
                </div>
                 <div style="width:340px; height:100%;margin-left:1125px;z-index:9; margin-top:0px;position:fixed;">
                     <p:insert attribute="chat">
                      </p:insert>
                 </div>
              </div>
           </div>
     </body>
</html>