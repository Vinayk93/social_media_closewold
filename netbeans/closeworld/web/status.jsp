<%-- 
    Document   : status
    Created on : 17 Mar, 2015, 10:30:10 PM
    Author     : SACHIN KATIYAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="h" %>
<!DOCTYPE html>

<html>
    <head>
        <link href="dist/css/bootstrap.min.css" rel="stylesheet"> 
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/update.js"></script>
        <style>
          
            textarea{resize:vertical; 
            margin: 20px;
            padding: 10px;
            color:#000;
            font-size: 14px;
            background-color:white;
            font-family:  Comic Sans MS; }
            #butt1{
                width: 150px;
                height:25px;
    margin-top:  0px;
    margin-left: 35px;
    padding: .27em .63em;
box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;
-moz-box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;
background-color: #3a5795;
color: whitesmoke;
border: 1px #000 solid;
border-bottom-left-radius: 20px;
text-decoration: none;
cursor: pointer;
z-index: 0;
font-weight: bold;
            }
            #butt2{
                
                width: 150px;
                height:25px;
    margin-top:  0px;
    margin-left: 0px;
    padding: .27em .63em;
box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;
-moz-box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;
background-color: #3a5795;
color: whitesmoke;
border: 1px #000 solid;
text-decoration: none;
cursor: pointer;
z-index: 0;
font-weight: bold;
            }
            #butt3{
                width: 150px;
                height:25px;
    margin-top:  0px;
    margin-left: 0px;
    padding: .27em .63em;
box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;
-moz-box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;
background-color: #3a5795;
color: whitesmoke;
border: 1px #000 solid;
border-bottom-right-radius: 20px;
text-decoration: none;
cursor: pointer;
z-index: 0;
font-weight: bold;
            }
            
            #butt1:hover,#butt2:hover,#butt3:hover {
    
    -webkit-animation: mymove 2s infinite; /* Chrome, Safari, Opera */
    animation: mymove 2s infinite;
}
/* Chrome, Safari, Opera */
@-webkit-keyframes mymove {
    from {background-color: #3a5795;border-color:#3a5795;}
    to {background-color: #2c87f0;border-color:#2c87f0;}
}
#butt1:focus,#butt2:focus,#butt3:focus {
    outline: none;
        font-size:14px;
}
.gayab{
   display:none;
}
        </style>
    </head>
    <body  >
        
        <div class="notificationbar">
        <div class="panel" style="position:fixed;height:200px; width:300px; right:250px; z-index: 10;">
             <div class="panel panel-default">
                           <div class="panel-heading">
                               <a href="#" class="pull-right" style="margin-top:0px;">View all</a> <h4>NOTIFICATION  LIST</h4></div>
                                <div class="panel-body">
             notification 1 <br/>
         notification 2 <br/>
         notification 3 <br/>
         notification 4 <br/>
         notification 5 <br/>
         
                             </div>
              </div>
        </div>
         </div>
        <div class="messagebar" >
         <div class="panel" style="position:fixed;height:200px; width:300px; right:200px; z-index: 10;">
             <div class="panel panel-default">
                           <div class="panel-heading">
                               <a href="#" class="pull-right" style="margin-top:10px;">View all</a> <h4>MESSAGE LIST</h4></div>
                                <div class="panel-body">
         message 1<br/>
         message 2<br/>
         message 3<br/>
         message 4<br/>
         message 5<br/>
                             </div>
              </div>
        </div>
         </div>
        <div class="friendsbar" >
         <div class="panel" style="position:fixed;height:200px; width:300px; right:100px; z-index: 10; ">
             <div class="panel panel-default">
                   <div class="panel-heading">
                     <a href="#" class="pull-right" style="margin-top:10px; z-index:10;">View all</a> <h4>FRIEND LIST</h4></div>
         <div class="panel-body">
         friends 1<br/>
         friends 2<br/>
         friends 3<br/>
         friends 4<br/>
         friends 5<br/>
         </div>
       </div>
        </div>
         </div>
        <% String user=(String)session.getAttribute("user");%>
<% String first=(String)session.getAttribute("first");%>
<% String last=(String)session.getAttribute("last");%>
        <div style="position:fixed; z-index: 10;">
        <div>
            <button type="button" id="butt1" class="button">Update Status</button>
            <input type="button" id="butt2" value="Welcome <%=first%> <%=last%>" style="width:500px;"/>
      <h:link action="/google">
        <button type="button" id="butt3" >Wiki Search</button></h:link><br/>
        
       </div>
        
        <div class="wrapper" style=" z-index: 100;margin-top:30px; margin-left:20px; margin-right:20px; ">
            <div id="main" >
                <div class="padding" >
                     <div class="row" style="margin-left:0px; margin-bottom:0px; margin-right:0px;">
                          <div class="well" style="margin-left:0px; margin-bottom:0px; margin-right: 0px; background: lightgrey;"> 
                              <form class="form-horizontal" role="form" action="newpost">
                                  <br/>
                                    <h4>What's New</h4>
                                            <div class="form-group" style="padding:14px;   ">
                                              <textarea class="form-control" name="statusva" placeholder="Update your status"></textarea>
                                            </div>
                                    <input class="btn btn-primary pull-right" type="submit" value="post" /><ul class="list-inline"><li><a href=""><i class="glyphicon glyphicon-upload"></i></a></li><li><a href=""><i class="glyphicon glyphicon-camera"></i></a></li><li><a href=""><i class="glyphicon glyphicon-map-marker"></i></a></li></ul>
                               </form>
                            </div>
                         </div>
                     </div>
                </div>
            </div>
            </div>
        
        <div class="chatbox">
     <div style="height:100%;position: fixed;margin-top:420px; margin-left:550px; margin-bottom:0px; z-index: 125;">
       <div style=" background:red; width:300px;height:400px; float:left; position:fixed;">
            <applet width="350" height="200" archive="mysql-connector-java-5.1.5.jar" code="chatting.class" ></applet>
    
             </div>
                </div>
                    </div>
        <script>
    $('.messagebar').toggleClass('gayab');
     
    $('.notificationbar').toggleClass('gayab');
      $('.friendsbar').toggleClass('gayab');       
    $('.wrapper').toggleClass('gayab');
    $('.button').click(function(){
     $('.wrapper').slideToggle(600);
     }); 
    var n,f,m;
    $('.notification').click(function(){
     $('.notificationbar').toggleClass('gayab');
      n=1;
      if(f==1){ $('.friendsbar').addClass('gayab');}if(m==1){$('.messagebar').addClass('gayab');}
    });
    
    //chatbox on
    $('#bu').click(function(){
     $('.chatbox').toggleClass('gayab'); });
    
    $('.friends').click(function(){
      $('.friendsbar').toggleClass('gayab');
     f=1;
      if(n==1){ $('.notificationbar').addClass('gayab');}if(m==1){$('.messagebar').addClass('gayab');}
    });
    $('.message').click(function(){  
     $('.messagebar').toggleClass('gayab');
    m=1;
     if(f==1){ $('.friendsbar').addClass('gayab');}if(n==1){$('.notificationbar').addClass('gayab');}
       });      
        
            
        </script>
            
      
        
        
         </body>
</html>