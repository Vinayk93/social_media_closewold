package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if IE 8 ]><html lang=\"en\" class=\"ie8\"><![endif]-->\n");
      out.write("<!--[if IE 9 ]><html lang=\"en\" class=\"ie9\"><![endif]-->\n");
      out.write("<!--[if (gt IE 9)|!(IE)]><!-->\n");
      out.write("<html lang=\"en\">\n");
      out.write("<!--<![endif]-->\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\" />\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("\t<!-- stylesheet for demo and examples -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\t<script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("\t<script src=\"http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js\"></script>\n");
      out.write("\t<![endif]-->\n");
      out.write("\t\n");
      out.write("\t<!-- custom scrollbar stylesheet -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style_1.css\">\n");
      out.write("\t <link href=\"dist/css/bootstrap.min.css\" rel=\"stylesheet\"> \n");
      out.write("         <style type=\"text/css\">\n");
      out.write("body\n");
      out.write("{\n");
      out.write("    margin:0px;\n");
      out.write("    padding:0px;\n");
      out.write("    height:100%;\n");
      out.write("    float:left;\n");
      out.write("    \n");
      out.write("    }\n");
      out.write(".side\n");
      out.write("    {\n");
      out.write("        padding:10px;\n");
      out.write("        width:220px;\n");
      out.write("        height:100%;\n");
      out.write("        background:#2c87f0;\n");
      out.write("        }\n");
      out.write("#edit\n");
      out.write("{\n");
      out.write("    text-align:right;\n");
      out.write("    width:100%;\n");
      out.write("  \n");
      out.write("    }\n");
      out.write("#img\n");
      out.write("{\n");
      out.write("    padding:10px;\n");
      out.write("    height:200px;\n");
      out.write("    width:200px;\n");
      out.write("    }\n");
      out.write("#name\n");
      out.write("{\n");
      out.write("    padding:10px;\n");
      out.write("    }\n");
      out.write(" ::-webkit-input-placeholder {\n");
      out.write("    color:    black;\n");
      out.write("}\n");
      out.write("  \n");
      out.write("input\n");
      out.write("{\n");
      out.write("    background:transparent;\n");
      out.write("    border:0px solid;\n");
      out.write("    outline:none;\n");
      out.write("    color:Black;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("#head\n");
      out.write("{\n");
      out.write("margin:0.5em;\n");
      out.write("width:100%;\n");
      out.write("    }\n");
      out.write("#subhead\n");
      out.write("{\n");
      out.write("    margin:1em;\n");
      out.write("    margin-top:-0.5em;\n");
      out.write("    width:95%;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <form action=\"update.jsp\">\n");
      out.write("    <div class=\"content mCustomScrollbar\"\n");
      out.write("         style=\"background:gray; padding:0px; margin:0px;width:200px; height:600px; position:fixed\">\n");
      out.write("        ");

            
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

      out.write("\n");
      out.write("<div id=\"edit\">\n");
      out.write("<a onclick=\"edit()\" \n");
      out.write("   data-original-title=\"Edit this user\" \n");
      out.write("   data-toggle=\"tooltip\" type=\"button\" \n");
      out.write("   class=\"btn btn-sm btn-warning\">\n");
      out.write("<i class=\"glyphicon glyphicon-edit\" ></i> \n");
      out.write("<input type=\"button\" width=\"90px\" style=\" background:transparent;border:0px solid;outline:none;color:Black;z-index:-1; \" \n");
      out.write("       name=\"button1\" value=\"Edit\" /></a>\n");
      out.write("    <input type=\"submit\" value=\"save\" />\n");
      out.write("</div>\n");
      out.write("<input type=\"file\" name=\"p\" />\n");
      out.write("<img id=\"img\" src=\"");
      out.print(rs.getString("pic_url"));
      out.write("\" />\n");
      out.write("<div id=\"name\"></div>\n");
      out.write("ID of CloseWorld:\n");
      out.write("\n");
      out.write("<input name=\"name\" id=\"head\" type=\"text\" disabled value=\"Name\" style=\"display:none;\"/>\n");
      out.write("<input name=\"name-1\" type=\"text\" id=\"head\" class=\"form-control\"  value=\"");
      out.print(rs.getString("name1"));
      out.write("\" disabled/>\n");
      out.write("\n");
      out.write("<input name=\"location\" id=\"head\" type=\"text\" disabled value=\"Location\"/>\n");
      out.write("<input name=\"location-1\" class=\"form-control\" type=\"text\" id=\"subhead\" value=\"");
      out.print(rs.getString("location"));
      out.write("\" disabled/>\n");
      out.write("\n");
      out.write("<input name=\"education\" id=\"head\" type=\"text\" disabled value=\"education\"/>\n");
      out.write("<input name=\"education-1\" class=\"form-control\" type=\"text\"  id=\"subhead\" value=\"");
      out.print(rs.getString("education"));
      out.write("\" disabled/>\n");
      out.write("\n");
      out.write("\n");
      out.write("<input name=\"language\" id=\"head\" type=\"text\" disabled value=\"language\"/>\n");
      out.write("<input name=\"language-1\" type=\"text\"  id=\"subhead\" value=\"");
      out.print(rs.getString("language"));
      out.write("\" class=\"form-control\" disabled/>\n");
      out.write("\n");
      out.write("\n");
      out.write("<input name=\"contact\" id=\"head\" type=\"text\"  value=\"contact no\" disabled/>\n");
      out.write("<input name=\"contact-1\" type=\"text\" id=\"subhead\" value=\"");
      out.print(rs.getString("contact_no"));
      out.write("\" class=\"form-control\" disabled/>\n");
      out.write("\n");
      out.write("\n");
      out.write("<input name=\"hometown\" id=\"head\" type=\"text\" disabled value=\"Hometown\" />\n");
      out.write("<input name=\"hometown-1\" type=\"text\"  id=\"subhead\" value=\"");
      out.print(rs.getString("home_town"));
      out.write("\" class=\"form-control\" disabled/>\n");
      out.write("\n");
      out.write("<input name=\"dob\" type=\"text\" id=\"head\" value=\"Date of birth\"  disabled />\n");
      out.write("<input name=\"dob-1\" type=\"text\"  id=\"subhead\" value=\"");
      out.print(rs.getString("dob"));
      out.write("\" class=\"form-control\" disabled/>\n");
      out.write("\n");
      out.write(" </div>\n");
      out.write("        ");

}

      out.write('\n');

}
catch(Exception e){
e.printStackTrace();
}

      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\" >\n");
      out.write("    function edit() {\n");
      out.write("        var i = document.getElementsByName(\"button1\")[0].value;\n");
      out.write("        if (i == \"Save\") {\n");
      out.write("            //save\n");
      out.write("            \n");
      out.write("            document.getElementsByName(\"name\")[0].disabled = true;\n");
      out.write("            document.getElementsByName(\"name\")[0].style.border = \"0 solid #0000ff\";\n");
      out.write("            document.getElementsByName(\"name\")[0].background = \"#000000\";\n");
      out.write("            \n");
      out.write("           \n");
      out.write("            document.getElementsByName(\"location-1\")[0].disabled = true;\n");
      out.write("            document.getElementsByName(\"location-1\")[0].style.border = \"0 solid #0000ff\";\n");
      out.write("            document.getElementsByName(\"location-1\")[0].background = \"#000000\";\n");
      out.write("            \n");
      out.write("            document.getElementsByName(\"education-1\")[0].disabled = true;\n");
      out.write("            document.getElementsByName(\"education-1\")[0].style.border = \"0 solid #0000ff\";\n");
      out.write("            document.getElementsByName(\"education-1\")[0].background = \"#000000\";\n");
      out.write("             \n");
      out.write("            document.getElementsByName(\"language-1\")[0].disabled = true;\n");
      out.write("            document.getElementsByName(\"language-1\")[0].style.border = \"0 solid #0000ff\";\n");
      out.write("            document.getElementsByName(\"language-1\")[0].background = \"#000000\";\n");
      out.write("            \n");
      out.write("            document.getElementsByName(\"contact-1\")[0].disabled = true;\n");
      out.write("            document.getElementsByName(\"contact-1\")[0].style.border = \"0 solid #0000ff\";\n");
      out.write("            document.getElementsByName(\"contact-1\")[0].background = \"#000000\";\n");
      out.write("            \n");
      out.write("            document.getElementsByName(\"hometown-1\")[0].disabled = true;\n");
      out.write("            document.getElementsByName(\"hometown-1\")[0].style.border = \"0 solid #0000ff\";\n");
      out.write("            document.getElementsByName(\"hometown-1\")[0].background = \"#000000\";\n");
      out.write("            \n");
      out.write("            document.getElementsByName(\"dob-1\")[0].disabled = true;\n");
      out.write("            document.getElementsByName(\"dob-1\")[0].style.border = \"0 solid #0000ff\";\n");
      out.write("            document.getElementsByName(\"dob-1\")[0].background = \"#000000\";\n");
      out.write("            \n");
      out.write("            document.getElementsByName(\"button1\")[0].value = \"Edit\";\n");
      out.write("        }\n");
      out.write("        else {\n");
      out.write("            //edit\n");
      out.write("          \n");
      out.write("\n");
      out.write("            document.getElementsByName(\"name-1\")[0].disabled = false;\n");
      out.write("            document.getElementsByName(\"name-1\")[0].style.border = \"thin solid\";\n");
      out.write("            \n");
      out.write("            document.getElementsByName(\"location-1\")[0].disabled = false;\n");
      out.write("            document.getElementsByName(\"location-1\")[0].style.border = \"thin solid\";\n");
      out.write("            \n");
      out.write("            document.getElementsByName(\"education-1\")[0].disabled = false;\n");
      out.write("            document.getElementsByName(\"education-1\")[0].style.border = \"thin solid\";\n");
      out.write("            \n");
      out.write("            document.getElementsByName(\"language-1\")[0].disabled = false;\n");
      out.write("            document.getElementsByName(\"language-1\")[0].style.border = \"thin solid\";\n");
      out.write("            \n");
      out.write("            document.getElementsByName(\"contact-1\")[0].disabled = false;\n");
      out.write("            document.getElementsByName(\"contact-1\")[0].style.border = \"thin solid\";\n");
      out.write("            \n");
      out.write("            document.getElementsByName(\"hometown-1\")[0].disabled = false;\n");
      out.write("            document.getElementsByName(\"hometown-1\")[0].style.border = \"thin solid\";\n");
      out.write("            \n");
      out.write("            document.getElementsByName(\"dob-1\")[0].disabled = false;\n");
      out.write("            document.getElementsByName(\"dob-1\")[0].style.border = \"thin solid\";\n");
      out.write("           \n");
      out.write("            document.getElementsByName(\"button1\")[0].value = \"Save\";\n");
      out.write("        }\n");
      out.write("        }\n");
      out.write("</script>\n");
      out.write("\t\n");
      out.write("       \n");
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
