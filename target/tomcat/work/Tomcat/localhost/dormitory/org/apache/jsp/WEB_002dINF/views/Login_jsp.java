/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-12-15 11:31:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>校园宿舍管理系统</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/index.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"center\">\r\n");
      out.write("\t\t\t<h4 class=\"title\">校园宿舍管理系统</h4>\r\n");
      out.write("\t\t\t<form class=\"box\" action=\"login\" method=\"post\" name=\"myForm\">\r\n");
      out.write("\t\t\t\t<div class=\"identity\">\r\n");
      out.write("\t\t\t\t\t<label>身份:</label>\t\r\n");
      out.write("\t\t\t\t\t<select name=\"people\">\r\n");
      out.write("\t\t\t\t\t<option value=\"请选择\">请选择</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"系统管理员\">系统管理员</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"楼宇管理员\">楼宇管理员</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"学生\">学生</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"username\">\r\n");
      out.write("\t\t\t\t\t<label >用户名:</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"username\"  value=\"\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"password\">\r\n");
      out.write("\t\t\t\t\t<label >密码:</label>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"password\"  value=\"\" />\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t<div class=\"land\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"登录\" onclick=\"return mycheck()\"></input>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function mycheck(){\r\n");
      out.write("\r\n");
      out.write("    if(document.myForm.people.value==\"请选择\"){\r\n");
      out.write("\r\n");
      out.write("        alert(\"请选择登录身份\");\r\n");
      out.write("\t\treturn false\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (document.myForm.username.value==\"\"){\r\n");
      out.write("\r\n");
      out.write("        alert(\"请输入用户名\");\r\n");
      out.write("        return false}\r\n");
      out.write("    else if (document.myForm.password.value==\"\"){\r\n");
      out.write("\r\n");
      out.write("        alert(\"请输入密码\");\r\n");
      out.write("        return false}\r\n");
      out.write("\r\n");
      out.write("else\r\n");
      out.write("    {return ture;}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
