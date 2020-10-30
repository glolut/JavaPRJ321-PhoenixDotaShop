package org.apache.jsp.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html> \n");
      out.write("<html> \n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title> Login Page </title>\n");
      out.write("<style> \n");
      out.write("Body {\n");
      out.write("  font-family: Calibri, Helvetica, sans-serif;\n");
      out.write("  background-color: white;\n");
      out.write("}\n");
      out.write("button { \n");
      out.write("       background-color: #008CBA; \n");
      out.write("       width: 100%;\n");
      out.write("        color: white; \n");
      out.write("        padding: 15px; \n");
      out.write("        margin: 10px 0px; \n");
      out.write("        border: none; \n");
      out.write("        cursor: pointer; \n");
      out.write("         } \n");
      out.write(" form { \n");
      out.write("        border: 3px solid #f1f1f1; \n");
      out.write("        width: 50%\n");
      out.write("    } \n");
      out.write("label {display:block; width:x; height:y; text-align:left;}\n");
      out.write(" input[type=text], input[type=password] { \n");
      out.write("        width: 100%; \n");
      out.write("        margin: 8px 0;\n");
      out.write("        padding: 12px 20px; \n");
      out.write("        display: inline-block; \n");
      out.write("        border: 2px solid lightblue; \n");
      out.write("        box-sizing: border-box; \n");
      out.write("    }\n");
      out.write(" button:hover { \n");
      out.write("        opacity: 0.7; \n");
      out.write("    } \n");
      out.write("  .signupbtn { \n");
      out.write("        background-color: #f44336;\n");
      out.write("        width: auto; \n");
      out.write("        padding: 10px 18px;\n");
      out.write("        margin: 10px 5px;\n");
      out.write("    } \n");
      out.write("      \n");
      out.write("   \n");
      out.write(" .container { \n");
      out.write("        padding: 25px; \n");
      out.write("        background-color: white;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("</style> \n");
      out.write("</head>  \n");
      out.write("<body>  \n");
      out.write("    <center> <h1>Login</h1> </center> \n");
      out.write("    <center>\n");
      out.write("        <form action=\"DotaPhoenixShop/Login\" method=\"POST\">\n");
      out.write("            <div class=\"container\"> \n");
      out.write("               <label>Username :</label>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Username\" name=\"username\" required></br>\n");
      out.write("                <label>Password : </label>\n");
      out.write("                <input type=\"password\" placeholder=\"Enter Password\" name=\"password\" required>\n");
      out.write("                <input type=\"checkbox\" > Remember me </br>\n");
      out.write("                <center><button type=\"submit\">Lqogin</button></center> </br>\n");
      out.write("                <button type=\"button\" class=\"signupbtn\"> Sign Up</button> </br>\n");
      out.write("                Forgot <a href=\"\"> password? </a> \n");
      out.write("            </div> \n");
      out.write("        </form>\n");
      out.write("    </center> \n");
      out.write("</body>   \n");
      out.write("</html>\n");
      out.write("\n");
      out.write(" \n");
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
