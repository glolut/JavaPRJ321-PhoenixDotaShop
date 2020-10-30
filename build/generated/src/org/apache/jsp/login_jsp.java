package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Account;

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
      out.write("\n");
      out.write("<!DOCTYPE html> \n");
      out.write("<html> \n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title> Login Page </title>\n");
      out.write("<style> \n");
      out.write("Body {\n");
      out.write("    margin: 0;\n");
      out.write("  font-family: Calibri, Helvetica, sans-serif;\n");
      out.write("  background-image: url('images/login_background.jpg');\n");
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
      out.write("     border: 3px solid #6699ff;    /* #00cccc */\n");
      out.write("     width: 50%;\n");
      out.write("    margin: 5%;\n");
      out.write(" }\n");
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
      out.write("    .homebutton{\n");
      out.write("        background-color: #4CAF50; /* Green */\n");
      out.write("        width: auto;\n");
      out.write("        border: 2px solid;\n");
      out.write("        color: white;\n");
      out.write("        padding: 15px 32px;\n");
      out.write("        text-align: left;\n");
      out.write("        text-decoration: none;\n");
      out.write("        display: inline-block;\n");
      out.write("        font-size: 20px;\n");
      out.write("    }\n");
      out.write("      \n");
      out.write("   \n");
      out.write(" .container { \n");
      out.write("        padding: 25px; \n");
      out.write("        background-color: #cccccc;\n");
      out.write("    }\n");
      out.write("    img {\n");
      out.write("    width: 150px;\n");
      out.write("    height: 100px;\n");
      out.write("    position: fixed;\n");
      out.write("    top: 0;\n");
      out.write("    right:0;\n");
      out.write("}\n");
      out.write(".text-block {\n");
      out.write("  position: absolute;\n");
      out.write("\n");
      out.write("  justify-content: center;\n");
      out.write("  align-items: center;\n");
      out.write("  top: 3%;\n");
      out.write("  background-color: black;\n");
      out.write("  color: white;\n");
      out.write("  padding-left: 15%;\n");
      out.write("  padding-right: 15%;\n");
      out.write("}\n");
      out.write("</style> \n");
Account acc = (Account)session.getAttribute("acc");
if (acc != null){
    response.sendRedirect("AccountMenu.jsp");
}

      out.write("\n");
      out.write("</head> \n");
      out.write("\n");
      out.write("<body>  \n");
      out.write("    <center> <h1> </h1> </center> \n");
      out.write("   <button onclick=\"location.href='Home.html'\" type=\"button\" class=\"homebutton\">&#60&#60 Back to Home</button>\n");
      out.write("   <a href=\"Home.html\">\n");
      out.write("       <img src=\"images/logo.png\" alt=\"DotaPhoenixShop\">\n");
      out.write("   </a>\n");
      out.write("    <center>\n");
      out.write("        <form action=\"Login\" method=\"POST\">\n");
      out.write("            \n");
      out.write("            <div class=\"container\"> \n");
      out.write("               <label>Username :</label>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Username\" name=\"username\" required></br>\n");
      out.write("                <label>Password : </label>\n");
      out.write("                <input type=\"password\" placeholder=\"Enter Password\" name=\"password\" required>\n");
      out.write("                <input type=\"checkbox\" name=\"remeber\" value=\"remember\"> Remember me </br>\n");
      out.write("                <center><button type=\"submit\">Login</button></center> </br>\n");
      out.write("                <button type=\"button\" class=\"signupbtn\"> Sign Up</button> </br>\n");
      out.write("                ");
 try{
                    boolean check = false;
                    check = (boolean)request.getAttribute("loginFailed");
                    if (check== true){
                        out.println("<div class=\"text-block\"\n>" +
                        "<h4>Something's wrong</h4>\n" +
                        "<p>Incorrect username or password</p>\n"+
                        "</div>");
                    }
                }catch(Exception e){
                    e.getMessage();
                }
                
      out.write("\n");
      out.write("                ");
 try{
                    boolean checkLoggedIn = (boolean)session.getAttribute("loggedin");
                    if (checkLoggedIn == false){
                        out.println("<div class=\"text-block\"\n>" +
                        "<h4>Something's wrong</h4>\n" +
                        "<p>You have to log in before adding cart</p>\n"+
                        "</div>");
                    }
                }catch(Exception e){
                    e.getMessage();
                }
                
      out.write("\n");
      out.write("                Forgot <a href=\"\"> password? </a> \n");
      out.write("                \n");
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
