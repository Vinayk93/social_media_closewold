<%-- 
    Document   : newjsp
    Created on : Mar 26, 2015, 9:12:38 PM
    Author     : vinay
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<html lang="en">
<!--<![endif]-->
<head>
	<!-- custom scrollbar stylesheet -->
	 <link href="css/style_1.css" rel="stylesheet"> 
     <link href="dist/css/bootstrap.min.css" rel="stylesheet"> 
     <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/update.js"></script>
        <link rel="stylesheet" href="css/jquery.mCustomScrollbar.css">
</head>
<body>
    <div id="bigone">
    <style type="text/css">
        
       
        .allpost{
            margin: 10px;
            padding: 10px;
             }
        .post{
            margin: 3px;
            padding: 3px;
             }
            #poststatus{
               color: grey; 
               }
            #pic{
                margin: 3px;
            padding: 3px;
                width:100px;
                height:100px;
                float: left;
              padding: 5px;
                }
                #aboutpost{
                  font-size:20px;
                  }
            #desc{
                overflow: auto;
            }
                 #postcontent{
                   }
                 #replies{
                     margin-left: 70px;
                    
                        }
                 #replydesc{
                
               
                overflow: auto;
                 
                 }
                 #replypostcontent{
                     }
                     .stuck{
                         position: fixed;
                         z-index: 100;
                         top:0;
                         
                     }
    </style>
     <%
            
Connection con = null;
String url = "jdbc:mysql://localhost:3306/";
String db = "closeworld";
String driver = "com.mysql.jdbc.Driver";
String userName ="root";
String password="root";
Statement st;
try{

Class.forName(driver).newInstance();
con = DriverManager.getConnection(url+db,userName,password);
st = con.createStatement();

String query = "select * from post";
ResultSet rs = st.executeQuery(query);

while(rs.next()){
%>
    <div class="content mCustomScrollbar" style="padding:0px; margin:0px;width:100%; height:100%;">
        <div class="allpost">
         
            <div class="panel panel-default">
                 <div class="panel-body" style="background: #c4e3f3 ; ">
      <div class="post" >
        <div id="pic">
         <img src="<%=rs.getString("profile_pic")%>" style="width:100%;height:100%;"  />
         </div>
            <div id="desc"  >
                <div id="aboutpost" >
                    <%=rs.getString("name")%>
                </div>
                <div id="poststatus">              
                <%=rs.getString("timeanddate")%> </div>
         <div id="postcontent"> 
             <%=rs.getString("status")%>
       </div>
       
       <%
       if(rs.getString("statuspic").equals("")){
       }else{
       %>
       <img width=300; height=300; src="<%=rs.getString("statuspic")%>" ></img>
       <%
       }
       %>      
              <br/>
                <br/>
           <div id="feedback" >
               <form action="like" >
                   <input type="text" name="postid" value="<%=rs.getInt("postid")%>" style="display:none;" />
                
    <%
    try{
        
       
Statement stlike = con.createStatement();

    String querylike = "SELECT count(*) FROM likepost where post_id="+rs.getInt("postid");
ResultSet rslike = stlike.executeQuery(querylike);

while(rslike.next()){
%>              
                   
                   
                   
                   <input type="submit" value="Like"   />
                  <%=rslike.getInt("count(*)")%>
                   
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
                <form action="coment">
               <input type="text" name="postid" value="<%=rs.getInt("postid")%>" style="display:none" />
               <input type="button" value="Commment" onclick="f2()"/>
               </form>
               
               
           <br/>
                <br/>
                 <%
try{
    
    
Class.forName(driver).newInstance();
con = DriverManager.getConnection(url+db,userName,password);
st = con.createStatement();
String query1 = "SELECT * FROM coment where commenton="+rs.getInt("postid")+"";
ResultSet rs1 = st.executeQuery(query1);
while(rs1.next()){
%>

<div class="panel-body" style="padding:5px; background: #b2dba1; ">                   
 
     <div id="pic">
      <img src="<%=rs1.getString("profilepic")%>" style="width:100%;height:100%;"  />
    </div>
    <div id="replydesc">
    <div id="aboutpost">
     <%=rs1.getString("name")%>
        </div>
        <div id="poststatus">              
     <%=rs1.getString("timeanddate")%>
             </div>
                                   <div id="replypostcontent"> 
                                       <%=rs1.getString("status")%>
                                    </div>
                                    </div>
                                    
                                    <div id="feedback">
                                       <form action="likecomment">
                                   
                                    <input type="text" name="ccccid" value="<%=rs1.getString("commentid")%>" style="display:none;" />
                                    <input  type="submit" value="Like"/>
                                    
                                   <%
    try{
        
       
Statement stlike = con.createStatement();

    String querylike2 = "SELECT count(*) FROM likecomment where coment_id="+rs1.getString("commentid");
ResultSet rslike2 = stlike.executeQuery(querylike2);

while(rslike2.next()){
%>              
                   
                   
                   
                   
                  <%=rslike2.getInt("count(*)")%>
                   
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
                                    
                                    
                                    <input type="button" value="Commment" onclick="f()"/>
                                    
                                    <br>
                                    <style>
                                        .gayab{
                                            display:none;
                                        }           
                                    </style>
                                    <script>
    function f(){                                   
    $('.sad').toggleClass('gayab');
    }
    function f2(){
       $('.fs').toggleClass('gayab');
     
    }</script>

<%
       try{
    Statement stee = con.createStatement();
String query4 = "SELECT * FROM coment c where c.replyon='"+rs1.getInt("commentid")+"'";
ResultSet rs4 = stee.executeQuery(query4);
while(rs4.next()){
%>
   <div class="panel-body" style="padding:5px; background: #b2dba1;">
 
<div id="replies" >
    <%//=rs1.getInt("commentid")%>
    <%//=rs4.getInt("replyon")%>
    <br>
    
  <div id="pic" >  
 <img src="<%=rs4.getString("profilepic")%>" style="width:100%;height:100%;"  />
  </div>
  <div id="replydesc"  >
   <form action="likecomment">
   <div id="aboutpost">
<%=rs4.getString("name")%>
       </div>
     <div id="replypostcontent"> 
<%=rs4.getString("status")%>
 </div>
 <div id="feedback">

     

     
<input type="text" name="ccccid" value="<%=rs4.getString("commentid")%>" style="display:none;"/>
<input type="submit" value="Like" />
                                 <%
    try{
Statement stlike1 = con.createStatement();

    String querylike22 = "SELECT count(*) FROM likecomment where coment_id="+rs4.getString("commentid");
ResultSet rslike22 = stlike1.executeQuery(querylike22);

while(rslike22.next()){
%>              
                   
                   
                   
                   
                  <%=rslike22.getInt("count(*)")%>
                   
                    <%
}
%>
<%
}
catch(Exception e){
e.printStackTrace();
}
%>     


<!--coment on comment-->
      </div>
 <br>
    </form> 
             </div>
       </div> 
   
                                    
        <%
}
}
catch(Exception e){
e.printStackTrace();
}
%>                                
<br>
<br>
  
    <div class="sad">
        <div id="replies">
        <!--
            <div id="pic" >
                    <img src="<%=rs1.getString("profilepic")%>" style="width:100%;height:100%;"  />
       
        </div>
        -->     
                    <div id="replydesc"  >
            <form action="addreply">
            <div id="aboutpost">
<input type="text" name="commentid" value="<%=rs1.getInt("commentid")%>" style="display:none;"/>
             </div>
              <div id="replypostcontent"> 
<input type="text" name="reply" />    
        </div>
        <div id="feedback">
<input type="submit" value="reply this comment"/>
             <!--coment on comment-->
                    </div>
                         </form> 
                   </div>
              </div>
    </div>
             </div>  
             
            </div>
<%
}
%>

           
  </div>
<%
}
catch(Exception e){
e.printStackTrace();
}

%>

     
           
              



             <!-- here we gonna take the coment id and send to the reply chamber -->
             <div class="fs">
             <div class="panel-body">
               <div id="replies">
                    
                   
    <%
    try{
Statement stlike12 = con.createStatement();
Integer userid1= (Integer)session.getAttribute("userid");

    String querylike223 = "select * from post where userid="+userid1+" or postid="+rs.getString("postid");
ResultSet rslike223 = stlike12.executeQuery(querylike223);

while(rslike223.next()){
%>              
                   
                  
               <!--  <div id="pic">
                     <img src="<%=rslike223.getString("profile_pic")%>" style="width:100%;height:100%;"  />
                    </div>
               -->
                   <form action="addpost">
                      <div id="replydesc">
                      <div id="aboutpost">
                          <input type="text" name="name" value="" style="display:none;" />
                     </div>
                       <input type="text" name="post" value="<%=rs.getString("postid")%>"  style="display:none;" />
                      <div id="replypostcontent"> 
                        <input type="text" name="content" />
                     </div>
                       <br>
                     <input type="submit" style="width:100px; height:50px;" class="form-control" value="post it" />
                     </div>
                    </form>
                      
                    <%
                    break;
}
%>
<%
}
catch(Exception e){
e.printStackTrace();
}
%>     
                   
                    
                  </div> 
             
                </div>
                    
</div>
         </div>
                      </div>
 </div>
        </div>
                       </div>
   </div>
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
    
    <script>window.jQuery || document.write('<script src="js/jquery-1.11.0.min.js"><\/script>')</script>
	
	<!-- custom scrollbar plugin -->
	
    
    <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
	</div>
</body>
</html>