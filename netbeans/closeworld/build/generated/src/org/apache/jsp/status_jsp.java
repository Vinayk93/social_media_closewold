package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class status_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_link_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_h_link_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_h_link_action.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"dist/css/bootstrap.min.css\" rel=\"stylesheet\"> \n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/update.js\"></script>\n");
      out.write("        <style>\n");
      out.write("          \n");
      out.write("            textarea{resize:vertical; \n");
      out.write("            margin: 20px;\n");
      out.write("            padding: 10px;\n");
      out.write("            color:#000;\n");
      out.write("            font-size: 14px;\n");
      out.write("            background-color:white;\n");
      out.write("            font-family:  Comic Sans MS; }\n");
      out.write("            #butt1{\n");
      out.write("                width: 150px;\n");
      out.write("                height:25px;\n");
      out.write("    margin-top:  0px;\n");
      out.write("    margin-left: 35px;\n");
      out.write("    padding: .27em .63em;\n");
      out.write("box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;\n");
      out.write("-moz-box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;\n");
      out.write("background-color: #3a5795;\n");
      out.write("color: whitesmoke;\n");
      out.write("border: 1px #000 solid;\n");
      out.write("border-bottom-left-radius: 20px;\n");
      out.write("text-decoration: none;\n");
      out.write("cursor: pointer;\n");
      out.write("z-index: 0;\n");
      out.write("font-weight: bold;\n");
      out.write("            }\n");
      out.write("            #butt2{\n");
      out.write("                \n");
      out.write("                width: 150px;\n");
      out.write("                height:25px;\n");
      out.write("    margin-top:  0px;\n");
      out.write("    margin-left: 0px;\n");
      out.write("    padding: .27em .63em;\n");
      out.write("box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;\n");
      out.write("-moz-box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;\n");
      out.write("background-color: #3a5795;\n");
      out.write("color: whitesmoke;\n");
      out.write("border: 1px #000 solid;\n");
      out.write("text-decoration: none;\n");
      out.write("cursor: pointer;\n");
      out.write("z-index: 0;\n");
      out.write("font-weight: bold;\n");
      out.write("            }\n");
      out.write("            #butt3{\n");
      out.write("                width: 150px;\n");
      out.write("                height:25px;\n");
      out.write("    margin-top:  0px;\n");
      out.write("    margin-left: 0px;\n");
      out.write("    padding: .27em .63em;\n");
      out.write("box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;\n");
      out.write("-moz-box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;\n");
      out.write("background-color: #3a5795;\n");
      out.write("color: whitesmoke;\n");
      out.write("border: 1px #000 solid;\n");
      out.write("border-bottom-right-radius: 20px;\n");
      out.write("text-decoration: none;\n");
      out.write("cursor: pointer;\n");
      out.write("z-index: 0;\n");
      out.write("font-weight: bold;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #butt1:hover,#butt2:hover,#butt3:hover {\n");
      out.write("    \n");
      out.write("    -webkit-animation: mymove 2s infinite; /* Chrome, Safari, Opera */\n");
      out.write("    animation: mymove 2s infinite;\n");
      out.write("}\n");
      out.write("/* Chrome, Safari, Opera */\n");
      out.write("@-webkit-keyframes mymove {\n");
      out.write("    from {background-color: #3a5795;border-color:#3a5795;}\n");
      out.write("    to {background-color: #2c87f0;border-color:#2c87f0;}\n");
      out.write("}\n");
      out.write("#butt1:focus,#butt2:focus,#butt3:focus {\n");
      out.write("    outline: none;\n");
      out.write("        font-size:14px;\n");
      out.write("}\n");
      out.write(".gayab{\n");
      out.write("   display:none;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body  >\n");
      out.write("        \n");
      out.write("        <div class=\"notificationbar\">\n");
      out.write("        <div class=\"panel\" style=\"position:fixed;height:200px; width:300px; right:250px; z-index: 10;\">\n");
      out.write("             <div class=\"panel panel-default\">\n");
      out.write("                           <div class=\"panel-heading\">\n");
      out.write("                               <a href=\"#\" class=\"pull-right\" style=\"margin-top:0px;\">View all</a> <h4>NOTIFICATION  LIST</h4></div>\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("             notification 1 <br/>\n");
      out.write("         notification 2 <br/>\n");
      out.write("         notification 3 <br/>\n");
      out.write("         notification 4 <br/>\n");
      out.write("         notification 5 <br/>\n");
      out.write("         \n");
      out.write("                             </div>\n");
      out.write("              </div>\n");
      out.write("        </div>\n");
      out.write("         </div>\n");
      out.write("        <div class=\"messagebar\" >\n");
      out.write("         <div class=\"panel\" style=\"position:fixed;height:200px; width:300px; right:200px; z-index: 10;\">\n");
      out.write("             <div class=\"panel panel-default\">\n");
      out.write("                           <div class=\"panel-heading\">\n");
      out.write("                               <a href=\"#\" class=\"pull-right\" style=\"margin-top:10px;\">View all</a> <h4>MESSAGE LIST</h4></div>\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("         message 1<br/>\n");
      out.write("         message 2<br/>\n");
      out.write("         message 3<br/>\n");
      out.write("         message 4<br/>\n");
      out.write("         message 5<br/>\n");
      out.write("                             </div>\n");
      out.write("              </div>\n");
      out.write("        </div>\n");
      out.write("         </div>\n");
      out.write("        <div class=\"friendsbar\" >\n");
      out.write("         <div class=\"panel\" style=\"position:fixed;height:200px; width:300px; right:100px; z-index: 10; \">\n");
      out.write("             <div class=\"panel panel-default\">\n");
      out.write("                   <div class=\"panel-heading\">\n");
      out.write("                     <a href=\"#\" class=\"pull-right\" style=\"margin-top:10px; z-index:10;\">View all</a> <h4>FRIEND LIST</h4></div>\n");
      out.write("         <div class=\"panel-body\">\n");
      out.write("         friends 1<br/>\n");
      out.write("         friends 2<br/>\n");
      out.write("         friends 3<br/>\n");
      out.write("         friends 4<br/>\n");
      out.write("         friends 5<br/>\n");
      out.write("         </div>\n");
      out.write("       </div>\n");
      out.write("        </div>\n");
      out.write("         </div>\n");
      out.write("        ");
 String user=(String)session.getAttribute("user");
      out.write('\n');
 String first=(String)session.getAttribute("first");
      out.write('\n');
 String last=(String)session.getAttribute("last");
      out.write("\n");
      out.write("        <div style=\"position:fixed; z-index: 10;\">\n");
      out.write("        <div>\n");
      out.write("            <button type=\"button\" id=\"butt1\" class=\"button\">Update Status</button>\n");
      out.write("            <input type=\"button\" id=\"butt2\" value=\"Welcome ");
      out.print(first);
      out.write(' ');
      out.print(last);
      out.write("\" style=\"width:500px;\"/>\n");
      out.write("      ");
      if (_jspx_meth_h_link_0(_jspx_page_context))
        return;
      out.write("<br/>\n");
      out.write("        \n");
      out.write("       </div>\n");
      out.write("        \n");
      out.write("        <div class=\"wrapper\" style=\" z-index: 100;margin-top:30px; margin-left:20px; margin-right:20px; \">\n");
      out.write("            <div id=\"main\" >\n");
      out.write("                <div class=\"padding\" >\n");
      out.write("                     <div class=\"row\" style=\"margin-left:0px; margin-bottom:0px; margin-right:0px;\">\n");
      out.write("                          <div class=\"well\" style=\"margin-left:0px; margin-bottom:0px; margin-right: 0px; background: lightgrey;\"> \n");
      out.write("                              <form class=\"form-horizontal\" role=\"form\" action=\"newpost\">\n");
      out.write("                                  <br/>\n");
      out.write("                                    <h4>What's New</h4>\n");
      out.write("                                            <div class=\"form-group\" style=\"padding:14px;   \">\n");
      out.write("                                              <textarea class=\"form-control\" name=\"statusva\" placeholder=\"Update your status\"></textarea>\n");
      out.write("                                            </div>\n");
      out.write("                                    <input class=\"btn btn-primary pull-right\" type=\"submit\" value=\"post\" /><ul class=\"list-inline\"><li><a href=\"\"><i class=\"glyphicon glyphicon-upload\"></i></a></li><li><a href=\"\"><i class=\"glyphicon glyphicon-camera\"></i></a></li><li><a href=\"\"><i class=\"glyphicon glyphicon-map-marker\"></i></a></li></ul>\n");
      out.write("                               </form>\n");
      out.write("                            </div>\n");
      out.write("                         </div>\n");
      out.write("                     </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        <div class=\"chatbox\">\n");
      out.write("     <div style=\"height:100%;position: fixed;margin-top:400px; margin-left:550px; margin-bottom:0px; z-index: 125;\">\n");
      out.write("       <div style=\" background:red; width:300px;height:400px; float:left; position:fixed;\">\n");
      out.write("            <applet width=\"350\" height=\"200\" archive=\"mysql-connector-java-5.1.5.jar\" code=\"chatting.class\" ></applet>\n");
      out.write("    \n");
      out.write("             </div>\n");
      out.write("                </div>\n");
      out.write("                    </div>\n");
      out.write("        <script>\n");
      out.write("    $('.messagebar').toggleClass('gayab');\n");
      out.write("     \n");
      out.write("    $('.notificationbar').toggleClass('gayab');\n");
      out.write("      $('.friendsbar').toggleClass('gayab');       \n");
      out.write("    $('.wrapper').toggleClass('gayab');\n");
      out.write("    $('.button').click(function(){\n");
      out.write("     $('.wrapper').slideToggle(600);\n");
      out.write("     }); \n");
      out.write("    var n,f,m;\n");
      out.write("    $('.notification').click(function(){\n");
      out.write("     $('.notificationbar').toggleClass('gayab');\n");
      out.write("      n=1;\n");
      out.write("      if(f==1){ $('.friendsbar').addClass('gayab');}if(m==1){$('.messagebar').addClass('gayab');}\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    //chatbox on\n");
      out.write("    $('#bu').click(function(){\n");
      out.write("     $('.chatbox').toggleClass('gayab'); });\n");
      out.write("    \n");
      out.write("    $('.friends').click(function(){\n");
      out.write("      $('.friendsbar').toggleClass('gayab');\n");
      out.write("     f=1;\n");
      out.write("      if(n==1){ $('.notificationbar').addClass('gayab');}if(m==1){$('.messagebar').addClass('gayab');}\n");
      out.write("    });\n");
      out.write("    $('.message').click(function(){  \n");
      out.write("     $('.messagebar').toggleClass('gayab');\n");
      out.write("    m=1;\n");
      out.write("     if(f==1){ $('.friendsbar').addClass('gayab');}if(n==1){$('.notificationbar').addClass('gayab');}\n");
      out.write("       });      \n");
      out.write("        \n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("            \n");
      out.write("      \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         </body>\n");
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

  private boolean _jspx_meth_h_link_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_h_link_0 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_h_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_h_link_0.setPageContext(_jspx_page_context);
    _jspx_th_h_link_0.setParent(null);
    _jspx_th_h_link_0.setAction("/google");
    int _jspx_eval_h_link_0 = _jspx_th_h_link_0.doStartTag();
    if (_jspx_eval_h_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_link_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("        <button type=\"button\" id=\"butt3\" >Wiki Search</button>");
        int evalDoAfterBody = _jspx_th_h_link_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_link_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_link_action.reuse(_jspx_th_h_link_0);
      return true;
    }
    _jspx_tagPool_h_link_action.reuse(_jspx_th_h_link_0);
    return false;
  }
}
