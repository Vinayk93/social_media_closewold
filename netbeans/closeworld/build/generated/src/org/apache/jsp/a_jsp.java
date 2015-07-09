package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public final class a_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<!--<![endif]-->\n");
      out.write("<head>\n");
      out.write("\t<!-- custom scrollbar stylesheet -->\n");
      out.write("\t <link href=\"css/style_1.css\" rel=\"stylesheet\"> \n");
      out.write("     <link href=\"dist/css/bootstrap.min.css\" rel=\"stylesheet\"> \n");
      out.write("     <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/update.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("       \n");
      out.write("        .allpost{\n");
      out.write("            margin: 10px;\n");
      out.write("            padding: 10px;\n");
      out.write("             }\n");
      out.write("        .post{\n");
      out.write("            margin: 3px;\n");
      out.write("            padding: 3px;\n");
      out.write("             }\n");
      out.write("            #poststatus{\n");
      out.write("               color: grey; \n");
      out.write("               }\n");
      out.write("            #pic{\n");
      out.write("                margin: 3px;\n");
      out.write("            padding: 3px;\n");
      out.write("                width:100px;\n");
      out.write("                height:100px;\n");
      out.write("                float: left;\n");
      out.write("              padding: 5px;\n");
      out.write("                }\n");
      out.write("                #aboutpost{\n");
      out.write("                  font-size:15px;\n");
      out.write("                  font-family: Comic Sans MS;\n");
      out.write("                  font-weight: bold;\n");
      out.write("                  }\n");
      out.write("            #desc{\n");
      out.write("                overflow: auto;\n");
      out.write("            }\n");
      out.write("                 #postcontent{margin-top: -10px;\n");
      out.write("                   }\n");
      out.write("                 #replies{\n");
      out.write("                     margin-left: 70px;\n");
      out.write("                    \n");
      out.write("                        }\n");
      out.write("                 #replydesc{\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                overflow: auto;\n");
      out.write("                 \n");
      out.write("                 }\n");
      out.write("                 #replypostcontent{\n");
      out.write("                     }\n");
      out.write("                     .stuck{\n");
      out.write("                         position: fixed;\n");
      out.write("                         z-index: 100;\n");
      out.write("                         top:0;\n");
      out.write("                         \n");
      out.write("                     }\n");
      out.write("    </style>\n");
      out.write("     ");

            
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

      out.write("\n");
      out.write("    <div class=\"content mCustomScrollbar\" style=\"padding:0px; margin:0px;width:100%; height:100%;\">\n");
      out.write("        <div class=\"allpost\">\n");
      out.write("         \n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("                 <div class=\"panel-body\" style=\"background: whitesmoke ; \">\n");
      out.write("      <div class=\"post\" >\n");
      out.write("        <div id=\"pic\">\n");
      out.write("         <img src=\"");
      out.print(rs.getString("profile_pic"));
      out.write("\" style=\"width:100%;height:100%; border-style: solid;border-width: 3px;border-color: black\"  />\n");
      out.write("         </div>\n");
      out.write("            <div id=\"desc\"  >\n");
      out.write("                <div id=\"aboutpost\" >\n");
      out.write("                    ");
      out.print(rs.getString("name").toUpperCase());
      out.write(" at (");
      out.print(rs.getString("timeanddate"));
      out.write(")\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("         <div id=\"postcontent\"> \n");
      out.write("             <br>");
      out.print(rs.getString("status"));
      out.write("\n");
      out.write("             \n");
      out.write("                          <hr width=\"1000px\" align=\"left\" color=\"skyblue\" style=\"margin-top:-0.5px\"/><br>\n");
      out.write("       </div>\n");
      out.write("             \n");
      out.write("              \n");
      out.write("           <div id=\"feedback\" >\n");
      out.write("               <form action=\"like\" >\n");
      out.write("                   \n");
      out.write("                \n");
      out.write("    ");

    try{
        
       
Statement stlike = con.createStatement();

    String querylike = "SELECT count(*) FROM likepost where post_id="+rs.getInt("postid");
ResultSet rslike = stlike.executeQuery(querylike);

while(rslike.next()){

      out.write("              \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                   <input type=\"submit\" value=\"Like\"   />\n");
      out.write("                  (");
      out.print(rslike.getInt("count(*)"));
      out.write(")\n");
      out.write("                   \n");
      out.write("                    ");

}


}
catch(Exception e){
e.printStackTrace();
}
 
      out.write("       \n");
      out.write("                </form>\n");
      out.write("                <form action=\"coment\">\n");
      out.write("               <input type=\"button\" value=\"Comment on this...\" onclick=\"f2()\" />\n");
      out.write("               </form>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("           <br/>\n");
      out.write("                <br/>\n");
      out.write("                 ");

try{
    
    
Class.forName(driver).newInstance();
con = DriverManager.getConnection(url+db,userName,password);
st = con.createStatement();
String query1 = "SELECT * FROM coment where commenton="+rs.getInt("postid")+"";
ResultSet rs1 = st.executeQuery(query1);
while(rs1.next()){

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"panel-body\" style=\"padding:5px; background: whitesmoke ;border-style: solid;border-width: 1px;border-color: black\">                   \n");
      out.write(" \n");
      out.write("     <div id=\"pic\">\n");
      out.write("      <img src=\"");
      out.print(rs1.getString("profilepic"));
      out.write("\" style=\"width:50px;height:50px;\"  />\n");
      out.write("    </div>\n");
      out.write("    <div id=\"replydesc\">\n");
      out.write("    <div id=\"aboutpost\">\n");
      out.write("     ");
      out.print(rs1.getString("name").toUpperCase());
      out.write(" at ");
      out.print(rs1.getString("timeanddate"));
      out.write("<br>\n");
      out.write("        </div>\n");
      out.write("                     \n");
      out.write("     \n");
      out.write("             \n");
      out.write("                                   <div id=\"replypostcontent\"> \n");
      out.write("                                       ");
      out.print(rs1.getString("status"));
      out.write("\n");
      out.write("                                       <hr width=\"500px\" align=\"left\" color=\"blue\" style=\"margin-top:-0.5px\"/>\n");
      out.write("                                   <br>\n");
      out.write("                                       \n");
      out.write("                                    </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div id=\"feedback\">\n");
      out.write("                                       <form action=\"likecomment\">\n");
      out.write("                                   \n");
      out.write("                                    \n");
      out.write("                                    <input  type=\"submit\" value=\"Like\"/>\n");
      out.write("                                    \n");
      out.write("                                   ");

    try{
        
       
Statement stlike = con.createStatement();

    String querylike2 = "SELECT count(*) FROM likecomment where coment_id="+rs1.getString("commentid");
ResultSet rslike2 = stlike.executeQuery(querylike2);

while(rslike2.next()){

      out.write("              \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                  (");
      out.print(rslike2.getInt("count(*)"));
      out.write(")\n");
      out.write("                   \n");
      out.write("                    ");

}

      out.write('\n');

}
catch(Exception e){
e.printStackTrace();
}

      out.write("   \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    </form>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    <input type=\"button\" value=\"Comment\" onclick=\"f()\"/>\n");
      out.write("                                    \n");
      out.write("                                    <br>\n");
      out.write("                                    <style>\n");
      out.write("                                        .gayab{\n");
      out.write("                                            display:none;\n");
      out.write("                                        }           \n");
      out.write("                                    </style>\n");
      out.write("                                    <script>\n");
      out.write("    function f(){                                   \n");
      out.write("    $('.sad').toggleClass('gayab');\n");
      out.write("    }\n");
      out.write("    function f2(){\n");
      out.write("       $('.fs').toggleClass('gayab');\n");
      out.write("     \n");
      out.write("    }</script>\n");
      out.print(rs1.getInt("commentid"));
      out.write('\n');

       try{
    Statement stee = con.createStatement();
String query4 = "SELECT * FROM coment c where c.replyon="+rs1.getInt("commentid")+"";
ResultSet rs4 = stee.executeQuery(query4);
while(rs4.next()){

      out.write("\n");
      out.write("   <div class=\"panel-body\" style=\"padding:5px; background: #b2dba1;\">\n");
      out.write(" \n");
      out.write("<div id=\"replies\" >\n");
      out.write("    ");
//=rs1.getInt("commentid")
      out.write("\n");
      out.write("    ");
//=rs4.getInt("replyon")
      out.write("\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("  <div id=\"pic\" >  \n");
      out.write(" <img src=\"");
      out.print(rs4.getString("profilepic"));
      out.write("\" style=\"width:50px;height:50px;\"  />\n");
      out.write("  </div>\n");
      out.write("  <div id=\"replydesc\"  >\n");
      out.write("   <form action=\"likecomment\">\n");
      out.write("   <div id=\"aboutpost\">\n");
      out.print(rs4.getString("name"));
      out.write("\n");
      out.write("       </div>\n");
      out.write("     <div id=\"replypostcontent\"> \n");
      out.print(rs4.getString("status"));
      out.write("\n");
      out.write(" </div>\n");
      out.write(" <div id=\"feedback\">\n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("     \n");
      out.write("<input type=\"text\" name=\"ccccid\" value=\"");
      out.print(rs4.getString("commentid"));
      out.write("\" style=\"display:none;\"/>\n");
      out.write("<input type=\"submit\" value=\"Like\" />\n");
      out.write(" ");

    try{
Statement stlike1 = con.createStatement();

    String querylike22 = "SELECT count(*) FROM likecomment where coment_id="+rs4.getString("commentid");
ResultSet rslike22 = stlike1.executeQuery(querylike22);

while(rslike22.next()){

      out.write("              \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                  (");
      out.print(rslike22.getInt("count(*)"));
      out.write(")\n");
      out.write("                   \n");
      out.write("                    ");

}

      out.write('\n');

}
catch(Exception e){
e.printStackTrace();
}

      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("<!--coment on comment-->\n");
      out.write("      </div>\n");
      out.write(" <br>\n");
      out.write("    </form> \n");
      out.write("             </div>\n");
      out.write("       </div> \n");
      out.write("   \n");
      out.write("                                    \n");
      out.write("        ");

}
}
catch(Exception e){
e.printStackTrace();
}

      out.write("                                \n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("  \n");
      out.write("    \n");
      out.write("            \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                   <div class=\"sad\">\n");
      out.write("        <div id=\"replies\">  \n");
      out.write("        <div id=\"pic\" >\n");
      out.write("            ");

    try{
Statement stlike1 = con.createStatement();
Integer userid= (Integer)session.getAttribute("userid");


    String quer1 = "SELECT pic_url FROM profile where userId="+userid;
ResultSet rs222 = stlike1.executeQuery(quer1);

while(rs222.next()){

      out.write("                      \n");
      out.write("            \n");
      out.write("            <img src=\"");
      out.print(rs222.getString("pic_url"));
      out.write("\" style=\"width:70px;height:70px;\"  />\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                      ");

}

      out.write('\n');

}
catch(Exception e){
e.printStackTrace();
}

      out.write("     \n");
      out.write("                    <div id=\"replydesc\"  >\n");
      out.write("            <form action=\"addreply\">\n");
      out.write("           \n");
      out.write("              <div id=\"replypostcontent\"> \n");
      out.write("<input type=\"text\" name=\"reply\" style=\"border: none; border-color: transparent; outline-width: 0;\"><hr width=\"200px\" align=\"left\" color=\"skyblue\" style=\"margin-top:-0.5px\">    \n");
      out.write("<input type=\"text\" value=\"");
      out.print(rs1.getInt("commentid"));
      out.write("\" name=\"commentid\" />\n");
      out.write("              </div>\n");
      out.write("        <div id=\"feedback\">\n");
      out.write("<br><input type=\"submit\" value=\"Reply...\"/>\n");
      out.write("             <!--coment on comment-->\n");
      out.write("                    </div>\n");
      out.write("                         </form> \n");
      out.write("                   </div>\n");
      out.write("                  </div>\n");
      out.write("            </div>\n");
      out.write("             </div>    \n");
      out.write("               </div> \n");
      out.write("  </div>\n");
      out.write("                  \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("         \n");
      out.write("         \n");
      out.write("           \n");

}

      out.write('\n');

}
catch(Exception e){
e.printStackTrace();
}


      out.write("\n");
      out.write("\n");
      out.write("     \n");
      out.write("           \n");
      out.write("           \n");
      out.write("\n");
      out.write("\n");
      out.write("             <!-- here we gonna take the coment id and send to the reply chamber -->\n");
      out.write("             <div class=\"fs\">\n");
      out.write("             <div class=\"panel-body\">\n");
      out.write("               <div id=\"replies\">\n");
      out.write("                   \n");
      out.write("                   <div id=\"pic\">\n");
      out.write("                    \n");
      out.write("                       ");

    try{
Statement stlike1 = con.createStatement();
Integer userid= (Integer)session.getAttribute("userid");


    String quer1 = "SELECT pic_url FROM profile where userId="+userid;
ResultSet rs222 = stlike1.executeQuery(quer1);

while(rs222.next()){

      out.write("                      \n");
      out.write("            \n");
      out.write("            <img src=\"");
      out.print(rs222.getString("pic_url"));
      out.write("\" style=\"width:100%;height:100%;\"  />\n");
      out.write("            </div>   \n");
      out.write("                  \n");
      out.write("                      ");

}

      out.write('\n');

}
catch(Exception e){
e.printStackTrace();
}

      out.write("     \n");
      out.write("                    </div>\n");
      out.write("                   <form action=\"addpost\">\n");
      out.write("                      <div id=\"replydesc\">\n");
      out.write("                      \n");
      out.write("                      <div id=\"replypostcontent\"> \n");
      out.write("                          <input type=\"text\" name=\"content\" style=\"border: none; border-color: transparent; outline-width: 0;\">\n");
      out.write("                          <hr width=\"200px\" align=\"left\" color=\"skyblue\" style=\"margin-top:-0.5px\"/>\n");
      out.write("                     </div>\n");
      out.write("                       <br>\n");
      out.write("                     <input type=\"submit\" style=\"width:100px; height:50px;\" class=\"form-control\" value=\"post it\" />\n");
      out.write("                     </div>\n");
      out.write("                    </form>\n");
      out.write("                  </div> \n");
      out.write("             \n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("</div>\n");
      out.write("         </div>\n");
      out.write("                      </div>\n");
      out.write(" </div>\n");
      out.write("        </div>\n");
      out.write("                       </div>\n");
      out.write("   </div>\n");
      out.write("                 </div>\n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("      ");

}



      out.write('\n');

}
catch(Exception e){
e.printStackTrace();
}


      out.write("\n");
      out.write("    \n");
      out.write("    <script>window.jQuery || document.write('<script src=\"js/jquery-1.11.0.min.js\"><\\/script>')</script>\n");
      out.write("\t\n");
      out.write("\t<!-- custom scrollbar plugin -->\n");
      out.write("\t\n");
      out.write("    \n");
      out.write("    <script src=\"js/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
