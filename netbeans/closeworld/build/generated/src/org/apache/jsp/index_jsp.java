package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_javascript_formName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_text_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_errors_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form_onsubmit_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form_onsubmit_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_submit_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_password_property_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_h_javascript_formName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_text_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_html = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_errors_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_form_onsubmit_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_form_onsubmit_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_submit_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_password_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_h_javascript_formName_nobody.release();
    _jspx_tagPool_h_text_property_nobody.release();
    _jspx_tagPool_h_html.release();
    _jspx_tagPool_h_errors_nobody.release();
    _jspx_tagPool_h_form_onsubmit_action.release();
    _jspx_tagPool_h_form_onsubmit_method_action.release();
    _jspx_tagPool_h_submit_value_nobody.release();
    _jspx_tagPool_h_password_property_nobody.release();
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
      if (_jspx_meth_h_html_0(_jspx_page_context))
        return;
      out.write("          ");
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

  private boolean _jspx_meth_h_html_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:html
    org.apache.struts.taglib.html.HtmlTag _jspx_th_h_html_0 = (org.apache.struts.taglib.html.HtmlTag) _jspx_tagPool_h_html.get(org.apache.struts.taglib.html.HtmlTag.class);
    _jspx_th_h_html_0.setPageContext(_jspx_page_context);
    _jspx_th_h_html_0.setParent(null);
    int _jspx_eval_h_html_0 = _jspx_th_h_html_0.doStartTag();
    if (_jspx_eval_h_html_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("<head>\n");
        out.write("<title>CloseWorlD</title>\n");
        out.write("<script>\n");
        out.write("    var digitsOnly = /[1234567890]/g;\n");
        out.write("function restrictCharacters(myfield, e, restrictionType) {\n");
        out.write("\tif (!e) var e = window.event;\n");
        out.write("\tif (e.keyCode) code = e.keyCode;\n");
        out.write("\telse if (e.which) code = e.which;\n");
        out.write("\tvar character = String.fromCharCode(code);\n");
        out.write("\t// if they pressed esc... remove focus from field...\n");
        out.write("\tif (code==27) { this.blur(); return false; }\n");
        out.write("\t// ignore if they are press other keys\n");
        out.write("\t// strange because code: 39 is the down key AND ' key...\n");
        out.write("\t// and DEL also equals .\n");
        out.write("\tif (!e.ctrlKey && code!=9 && code!=8 && code!=36 && code!=37 && code!=38 && (code!=39 || (code==39 && character==\"'\")) && code!=40) {\n");
        out.write("\t\tif (character.match(restrictionType)) {\n");
        out.write("\t\t\treturn true;\n");
        out.write("\t\t} else {\n");
        out.write("\t\t\treturn false;\n");
        out.write("\t\t}\n");
        out.write("\t}\n");
        out.write("}\n");
        out.write("</script>\n");
        out.write("<style type=\"text/css\">\n");
        out.write("body\n");
        out.write("{\n");
        out.write("    margin:0px;\n");
        out.write("    padding:0px;\n");
        out.write("    height:100%;\n");
        out.write("    width:100%;\n");
        out.write("    \n");
        out.write("}\n");
        out.write(".header\n");
        out.write("{\n");
        out.write("    height:82px;\n");
        out.write("    width:100%;\n");
        out.write("    background:#3a5795;\n");
        out.write("}\n");
        out.write("#logo\n");
        out.write("{ \n");
        out.write("    height:100%;\n");
        out.write("    width:50%;\n");
        out.write("    float:left;\n");
        out.write("}\n");
        out.write("#login\n");
        out.write("{\n");
        out.write("    margin-top: 0px;\n");
        out.write("    padding-top: 0px;\n");
        out.write("    width:50%;\n");
        out.write("    height:100%;\n");
        out.write("    float:left;\n");
        out.write("}\n");
        out.write("#c\n");
        out.write("{\n");
        out.write("    margin-left: 220px;\n");
        out.write("    float:left;\n");
        out.write("    font-size: 50px;\n");
        out.write("    font-family: Magneto;\n");
        out.write("    color:whitesmoke;\n");
        out.write("    cursor:pointer;\n");
        out.write("    \n");
        out.write("}\n");
        out.write("#loseorld\n");
        out.write("{\n");
        out.write("    float:left;\n");
        out.write("    text-decoration: underline;\n");
        out.write("    font-size: 48px;\n");
        out.write("    font-family: Monotype Corsiva;\n");
        out.write("    color:whitesmoke;\n");
        out.write("     cursor:pointer;\n");
        out.write("}\n");
        out.write("#w\n");
        out.write("{\n");
        out.write("    float:left;\n");
        out.write("    margin-top: 10px;\n");
        out.write("    cursor:pointer;\n");
        out.write("}\n");
        out.write(".section\n");
        out.write("{\n");
        out.write("    \n");
        out.write("    height:90%;\n");
        out.write("    width:100%;\n");
        out.write("    background:lavender;\n");
        out.write("    }\n");
        out.write("    #aim{\n");
        out.write("        font-size: large;\n");
        out.write("   \n");
        out.write("    height:100%;\n");
        out.write("    width:50%;\n");
        out.write("    float:left;\n");
        out.write("   \n");
        out.write("    }\n");
        out.write("\n");
        out.write("#quotes\n");
        out.write("{\n");
        out.write("    font-size: large;\n");
        out.write("    \n");
        out.write("    height:100%;\n");
        out.write("    width:50%;\n");
        out.write("    float:left;\n");
        out.write("}\n");
        out.write(".footer\n");
        out.write("{\n");
        out.write("    height:100px;\n");
        out.write("    width:100%;\n");
        out.write("    background:lightsteelblue;\n");
        out.write("}\n");
        out.write(".head2{\n");
        out.write("          text-align: left;\n");
        out.write("          position: relative;\n");
        out.write("      }\n");
        out.write(".head2 input[type=\"text\"],.head2 input[type=\"password\"],.head2 input[type=\"date\"]\n");
        out.write("   {\n");
        out.write("       border:.2px solid;\n");
        out.write("       border-radius:5px;\n");
        out.write("       color:black;\n");
        out.write("       padding:7.5px;\n");
        out.write("       width:100%;\n");
        out.write("       font-size:20px;\n");
        out.write("       border:1px solid #3a5795;\n");
        out.write("       }\n");
        out.write("       .head2 input[type=\"text\"]:hover,.head2 input[type=\"submit\"]:hover,.head2 input[type=\"password\"]:hover,.head2 input[type=\"date\"]:hover,.head2 input[type=\"button\"]:hover\n");
        out.write("{\n");
        out.write("    box-shadow:0 0 2px #000;\n");
        out.write("    \n");
        out.write("}\n");
        out.write(".head2 input[type=\"text\"]:focus ,.head2 input[type=\"submit\"]:focus,.head2 input[type=\"password\"]:focus,.head2 input[type=\"date\"]:focus,.head2 input[type=\"button\"]:focus\n");
        out.write("{\n");
        out.write("    \n");
        out.write("     box-shadow:0 0 2px #000;\n");
        out.write("}\n");
        out.write("\n");
        out.write("       \n");
        out.write("table\n");
        out.write("    {\n");
        out.write("      margin-left:80px;\n");
        out.write("      margin-top:0px;\n");
        out.write("      margin-right:80px;\n");
        out.write("      width:450px;\n");
        out.write("      \n");
        out.write("    }\n");
        out.write("td\n");
        out.write("    {\n");
        out.write("    font-size:large;\n");
        out.write("    padding: 5px;\n");
        out.write("    }\n");
        out.write("    \n");
        out.write("input[type=\"submit\"],input[type=\"button\"]{\n");
        out.write("    width: 50px;\n");
        out.write("    margin: 10px;\n");
        out.write("    padding: .27em .63em;\n");
        out.write("box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;\n");
        out.write("-moz-box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;\n");
        out.write("background-color: #3a5795;\n");
        out.write("color: whitesmoke;\n");
        out.write("border: 1px solid #000 ;\n");
        out.write("text-decoration: none;\n");
        out.write("cursor: pointer;\n");
        out.write("}\n");
        out.write("\n");
        out.write(".head2 input[type=\"submit\"],.head2 input[type=\"button\"]{\n");
        out.write("    width: 200px;\n");
        out.write("    height:35px;\n");
        out.write("    margin: 10px;\n");
        out.write("    padding: 5px;\n");
        out.write("box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;\n");
        out.write("-moz-box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;\n");
        out.write("background-color: #3a5795;\n");
        out.write("border: 1px solid #000 ;\n");
        out.write("border-radius:5px;\n");
        out.write("text-decoration: underline;\n");
        out.write("cursor: pointer;\n");
        out.write("}\n");
        out.write(" input[type=\"text\"], input[type=\"password\"]{\n");
        out.write("    width: 100%;\n");
        out.write("    padding: 2px;   \n");
        out.write("    border: 1px solid #cccccc;\n");
        out.write("    box-shadow: 0 0 2px whitesmoke;\n");
        out.write("    \n");
        out.write("}\n");
        out.write("input[type=\"text\"]:hover,input[type=\"submit\"]:hover,input[type=\"password\"]:hover,input[type=\"date\"]:hover, input[type=\"button\"]:hover\n");
        out.write("{\n");
        out.write("    box-shadow:0 0 2px #000;\n");
        out.write("    \n");
        out.write("}\n");
        out.write("input[type=\"text\"]:focus ,input[type=\"submit\"]:focus,input[type=\"password\"]:focus,input[type=\"date\"]:focus,input[type=\"button\"]:focus\n");
        out.write("{\n");
        out.write("    \n");
        out.write("    border:1px solid #000;\n");
        out.write("    \n");
        out.write("}\n");
        out.write("     \n");
        out.write("</style>\n");
        out.write("</head>\n");
        if (_jspx_meth_h_javascript_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_html_0, _jspx_page_context))
          return true;
        out.write('\n');
        if (_jspx_meth_h_javascript_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("<body>\n");
        out.write("    <div class=\"header\" >\n");
        out.write("      <div id=\"logo\"  >\n");
        out.write("        <br/>\n");
        out.write("        <div id=\"c\">C</div>\n");
        out.write("        <div id=\"loseorld\">lose</div>\n");
        out.write("        <div id=\"w\"><img width=\"50px\" height=\"50px\" src=\"image/cw3.gif\" /></div>\n");
        out.write("        <div id=\"loseorld\">orld</div>\n");
        out.write("      </div>\n");
        out.write("        \n");
        out.write("<div id=\"login\">\n");
        if (_jspx_meth_h_form_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("</div>\n");
        out.write("</div>\n");
        out.write("<div class=\"section\">\n");
        out.write("<div id=\"aim\">\n");
        out.write("<table>\n");
        out.write("<tr>\n");
        out.write("<td colspan=3><center>\n");
        out.write("<big>Close World Welcomes you !!</big>\n");
        out.write("<br/>\n");
        out.write("Plz help us to improve.<br />\n");
        out.write("Our main developer\n");
        out.write("</td></tr>\n");
        out.write("<tr>\n");
        out.write("<td>Vinay\n");
        out.write("\n");
        out.write("</td>\n");
        out.write("<td>Sachin</td>\n");
        out.write("<td>Jay</td>\n");
        out.write("</tr>\n");
        out.write("</table>\n");
        out.write("</div>\n");
        out.write("<div id=\"quotes\">\n");
        out.write("<table style=\"margin-top:0px;\">\n");
        out.write("<tr>\n");
        out.write("<td colspan=\"2\" style=\"font-family: Arial; font-size:36px; font-weight: bolder;\">Sign up</td>\n");
        out.write("</tr>\n");
        out.write("<tr>\n");
        out.write("<td colspan=\"2\" style=\"font-family: Arial; font-size:20px;\">The future is purchased by the present.</td>\n");
        out.write("</tr>\n");
        out.write("</table>\n");
        if (_jspx_meth_h_form_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("</div>\n");
        out.write("</div>\n");
        out.write("<div class=\"footer\">\n");
        out.write("    </div>\n");
        out.write("</body>\n");
        int evalDoAfterBody = _jspx_th_h_html_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_h_html_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_html.reuse(_jspx_th_h_html_0);
      return true;
    }
    _jspx_tagPool_h_html.reuse(_jspx_th_h_html_0);
    return false;
  }

  private boolean _jspx_meth_h_javascript_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:javascript
    org.apache.struts.taglib.html.JavascriptValidatorTag _jspx_th_h_javascript_0 = (org.apache.struts.taglib.html.JavascriptValidatorTag) _jspx_tagPool_h_javascript_formName_nobody.get(org.apache.struts.taglib.html.JavascriptValidatorTag.class);
    _jspx_th_h_javascript_0.setPageContext(_jspx_page_context);
    _jspx_th_h_javascript_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_html_0);
    _jspx_th_h_javascript_0.setFormName("loginbean");
    int _jspx_eval_h_javascript_0 = _jspx_th_h_javascript_0.doStartTag();
    if (_jspx_th_h_javascript_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_javascript_formName_nobody.reuse(_jspx_th_h_javascript_0);
      return true;
    }
    _jspx_tagPool_h_javascript_formName_nobody.reuse(_jspx_th_h_javascript_0);
    return false;
  }

  private boolean _jspx_meth_h_javascript_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:javascript
    org.apache.struts.taglib.html.JavascriptValidatorTag _jspx_th_h_javascript_1 = (org.apache.struts.taglib.html.JavascriptValidatorTag) _jspx_tagPool_h_javascript_formName_nobody.get(org.apache.struts.taglib.html.JavascriptValidatorTag.class);
    _jspx_th_h_javascript_1.setPageContext(_jspx_page_context);
    _jspx_th_h_javascript_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_html_0);
    _jspx_th_h_javascript_1.setFormName("registerbean");
    int _jspx_eval_h_javascript_1 = _jspx_th_h_javascript_1.doStartTag();
    if (_jspx_th_h_javascript_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_javascript_formName_nobody.reuse(_jspx_th_h_javascript_1);
      return true;
    }
    _jspx_tagPool_h_javascript_formName_nobody.reuse(_jspx_th_h_javascript_1);
    return false;
  }

  private boolean _jspx_meth_h_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    org.apache.struts.taglib.html.FormTag _jspx_th_h_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_h_form_onsubmit_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_h_form_0.setPageContext(_jspx_page_context);
    _jspx_th_h_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_html_0);
    _jspx_th_h_form_0.setAction("/login");
    _jspx_th_h_form_0.setOnsubmit("return validateLoginbean(this)");
    int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
    if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("   \n");
        out.write("<table border=\"0\">\n");
        out.write("    <tr>\n");
        out.write("        <td style=\"color:red;font-family:arial; font-size: small;font-style: italic;\">");
        if (_jspx_meth_h_errors_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("    </tr>\n");
        out.write("<tr>\n");
        out.write("     <td style=\"color:whitesmoke;font-family:arial; font-size: small;\">Email-Id");
        if (_jspx_meth_h_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("     <td style=\"color:whitesmoke;font-family:arial; font-size: small;\">Password");
        if (_jspx_meth_h_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("     <td>");
        if (_jspx_meth_h_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("</tr>\n");
        out.write("</table>\n");
        int evalDoAfterBody = _jspx_th_h_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_form_onsubmit_action.reuse(_jspx_th_h_form_0);
      return true;
    }
    _jspx_tagPool_h_form_onsubmit_action.reuse(_jspx_th_h_form_0);
    return false;
  }

  private boolean _jspx_meth_h_errors_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_h_errors_0 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_h_errors_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_h_errors_0.setPageContext(_jspx_page_context);
    _jspx_th_h_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    int _jspx_eval_h_errors_0 = _jspx_th_h_errors_0.doStartTag();
    if (_jspx_th_h_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_errors_nobody.reuse(_jspx_th_h_errors_0);
      return true;
    }
    _jspx_tagPool_h_errors_nobody.reuse(_jspx_th_h_errors_0);
    return false;
  }

  private boolean _jspx_meth_h_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:text
    org.apache.struts.taglib.html.TextTag _jspx_th_h_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_h_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_h_text_0.setPageContext(_jspx_page_context);
    _jspx_th_h_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_text_0.setProperty("user");
    int _jspx_eval_h_text_0 = _jspx_th_h_text_0.doStartTag();
    if (_jspx_th_h_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_text_property_nobody.reuse(_jspx_th_h_text_0);
      return true;
    }
    _jspx_tagPool_h_text_property_nobody.reuse(_jspx_th_h_text_0);
    return false;
  }

  private boolean _jspx_meth_h_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_h_password_0 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_h_password_property_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_h_password_0.setPageContext(_jspx_page_context);
    _jspx_th_h_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_password_0.setProperty("pass");
    int _jspx_eval_h_password_0 = _jspx_th_h_password_0.doStartTag();
    if (_jspx_th_h_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_password_property_nobody.reuse(_jspx_th_h_password_0);
      return true;
    }
    _jspx_tagPool_h_password_property_nobody.reuse(_jspx_th_h_password_0);
    return false;
  }

  private boolean _jspx_meth_h_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_h_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_h_submit_value_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_h_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_h_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_submit_0.setValue("Log In");
    int _jspx_eval_h_submit_0 = _jspx_th_h_submit_0.doStartTag();
    if (_jspx_th_h_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_submit_value_nobody.reuse(_jspx_th_h_submit_0);
      return true;
    }
    _jspx_tagPool_h_submit_value_nobody.reuse(_jspx_th_h_submit_0);
    return false;
  }

  private boolean _jspx_meth_h_form_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    org.apache.struts.taglib.html.FormTag _jspx_th_h_form_1 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_h_form_onsubmit_method_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_h_form_1.setPageContext(_jspx_page_context);
    _jspx_th_h_form_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_html_0);
    _jspx_th_h_form_1.setAction("/register");
    _jspx_th_h_form_1.setMethod("post");
    _jspx_th_h_form_1.setOnsubmit("return validateRegisterbean(this)");
    int _jspx_eval_h_form_1 = _jspx_th_h_form_1.doStartTag();
    if (_jspx_eval_h_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("<div class=\"head2\">\n");
        out.write("<table>\n");
        out.write("<tr>\n");
        out.write("<td style=\"color:red;font-family:arial; font-size: small;font-style: italic;\">  ");
        if (_jspx_meth_h_errors_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_1, _jspx_page_context))
          return true;
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.regmsg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("</tr>\n");
        out.write("<tr>\n");
        out.write("<td><input type=\"text\" name=\"fname\" placeholder=\"First name\" /></td>\n");
        out.write("<td><input type=\"text\" name=\"lname\" placeholder=\"Last name\"/></td>\n");
        out.write("</tr>\n");
        out.write("<tr>\n");
        out.write("<td colspan=2><input type=\"text\" name=\"email\" placeholder=\"Email-ID\" /></td>\n");
        out.write("</tr>\n");
        out.write("<tr>\n");
        out.write("<td  colspan=2><input type=\"password\" name=\"pass\" placeholder=\"Password\"  /></td>\n");
        out.write("</tr>\n");
        out.write("<tr>\n");
        out.write("<td  colspan=2><input type=\"password\" name=\"pass1\" placeholder=\"Re-Enter Password\"  /></td>\n");
        out.write("</tr>\n");
        out.write("<tr>\n");
        out.write("<td  colspan=2><input type=\"text\" name=\"contact\" placeholder=\"Contact Number\" id=\"input1\" onkeypress=\"return restrictCharacters(this, event, digitsOnly);\"/></td>\n");
        out.write("</tr>\n");
        out.write("<tr>\n");
        out.write("<td colspan=\"2\"><input type=\"submit\" value=\"Sign Up\" style=\"font-weight: bold; font-size: medium;\"></td>\n");
        out.write("</tr>\n");
        out.write("</table>\n");
        out.write("    <hr width=\"75%\" align=\"center\"/>\n");
        out.write("</div>\n");
        int evalDoAfterBody = _jspx_th_h_form_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_h_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_form_onsubmit_method_action.reuse(_jspx_th_h_form_1);
      return true;
    }
    _jspx_tagPool_h_form_onsubmit_method_action.reuse(_jspx_th_h_form_1);
    return false;
  }

  private boolean _jspx_meth_h_errors_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_h_errors_1 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_h_errors_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_h_errors_1.setPageContext(_jspx_page_context);
    _jspx_th_h_errors_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_1);
    int _jspx_eval_h_errors_1 = _jspx_th_h_errors_1.doStartTag();
    if (_jspx_th_h_errors_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_errors_nobody.reuse(_jspx_th_h_errors_1);
      return true;
    }
    _jspx_tagPool_h_errors_nobody.reuse(_jspx_th_h_errors_1);
    return false;
  }
}
