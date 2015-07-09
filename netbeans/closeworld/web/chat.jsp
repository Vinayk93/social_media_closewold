<%-- 
    Document   : footer
    Created on : 11 Dec, 2014, 5:42:50 PM
    Author     : SACHIN KATIYAR
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          </head>
    <style type="text/css">
        body{
            padding:0px;
            margin:0px;
            height: 1024px;
        }
        
    </style>
    
    
    <body>
        <div class="container" style="width:320px; padding: 0px;height:100%;position: fixed;">
            <div class="panel" style=" padding: 0px;width:240px; background: red; ">
                <div class="panel-body" style="width:100%; height:220px; background: plum;">
                </div>
                <div class="panel-body" style="width:100%; height:390px; background: firebrick; padding:0px;">
                    <div class="content mCustomScrollbar" style="height:100%; margin:0px;padding:0px; width:100%; background: #9acfea;">
                        <!--repaeat this-->
                          <button class="crm" style="border:0px; padding:0px; width:100%;height:100%;">
                            <div style=" height:100%;width:100%; background: #9acfea; text-align: left; font-size:15px; float: left;">
                                <img src="image/1.jpg" style="border-radius:23px; width:60px;height:40px;">
                                Vinay Kumar
                            </div> 
                            
                            </button>
                            
                        <hr style="padding: 0px;margin: 0px;">
                <!--repaeat this-->
                        
                               
                    </div>
                </div>
            </div> 
        </div>
         
         <script>
    $('.chatbox').toggleClass('gayab'); 

    $('.crm').click(function(){
     $('.chatbox').toggleClass('gayab'); 
 });
    </script>
    </body>
</html>