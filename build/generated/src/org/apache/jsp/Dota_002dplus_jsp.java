package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Item;
import dal.ItemDAO;
import model.Account;

public final class Dota_002dplus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html style=\"font-size: 16px;\">\n");
      out.write("  <head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"keywords\" content=\"\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"page_type\" content=\"np-template-header-footer-from-plugin\">\n");
      out.write("    <title>Dota plus</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"nicepage.css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"Trang-phục.css\" media=\"screen\">\n");
      out.write("    <script class=\"u-script\" type=\"text/javascript\" src=\"jquery.js\" defer=\"\"></script>\n");
      out.write("    <script class=\"u-script\" type=\"text/javascript\" src=\"nicepage.js\" defer=\"\"></script>\n");
      out.write("    <meta name=\"generator\" content=\"Nicepage 2.28.1, nicepage.com\">\n");
      out.write("    <link id=\"u-theme-google-font\" rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <script type=\"application/ld+json\">{\n");
      out.write("\t\t\"@context\": \"http://schema.org\",\n");
      out.write("\t\t\"@type\": \"Organization\",\n");
      out.write("\t\t\"name\": \"\",\n");
      out.write("\t\t\"url\": \"index.html\",\n");
      out.write("\t\t\"logo\": \"images/logo.png\"\n");
      out.write("}</script>\n");
      out.write("    <meta property=\"og:title\" content=\"Dota plus\">\n");
      out.write("    <meta property=\"og:type\" content=\"website\">\n");
      out.write("    <meta name=\"theme-color\" content=\"#478ac9\">\n");
      out.write("    <link rel=\"canonical\" href=\"index.html\">\n");
      out.write("    <meta property=\"og:url\" content=\"index.html\">\n");
      out.write("  </head>\n");
      out.write("  <body class=\"u-body\"><header class=\"u-clearfix u-header u-valign-top u-header\" id=\"sec-a908\"><a href=\"Home.html\" class=\"u-image u-logo u-image-1\" data-image-width=\"546\" data-image-height=\"368\" title=\"Home\">\n");
      out.write("        <img src=\"images/logo.png\" class=\"u-logo-image u-logo-image-1\" data-image-width=\"133.4484\">\n");
      out.write("      </a><nav class=\"u-menu u-menu-dropdown u-offcanvas u-menu-1\">\n");
      out.write("        <div class=\"menu-collapse\" style=\"font-size: 1rem; letter-spacing: 0;\">\n");
      out.write("          <a class=\"u-active-white u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-top-bottom-menu-spacing u-hover-palette-1-base u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base u-white\" href=\"#\">\n");
      out.write("            <svg><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#menu-hamburger\"></use></svg>\n");
      out.write("            <svg version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><defs><symbol id=\"menu-hamburger\" viewBox=\"0 0 16 16\" style=\"width: 16px; height: 16px;\"><rect y=\"1\" width=\"16\" height=\"2\"></rect><rect y=\"7\" width=\"16\" height=\"2\"></rect><rect y=\"13\" width=\"16\" height=\"2\"></rect>\n");
      out.write("</symbol>\n");
      out.write("</defs></svg>\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"u-custom-menu u-nav-container\">\n");
      out.write("          <ul class=\"u-nav u-unstyled u-nav-1\"><li class=\"u-nav-item\"><a class=\"u-active-white u-button-style u-hover-palette-1-base u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base u-white\" href=\"Home.html\" style=\"padding: 36px 80px;\">Home</a>\n");
      out.write("</li><li class=\"u-nav-item\"><a class=\"u-active-white u-button-style u-hover-palette-1-base u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base u-white\" href=\"#carousel_f3ca\" style=\"padding: 36px 80px;\">Shop</a><div class=\"u-nav-popup\"><ul class=\"u-h-spacing-20 u-nav u-unstyled u-v-spacing-10 u-nav-2\"><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link u-white\" href=\"Dota-plus.jsp\" target=\"_blank\">Dota plus</a>\n");
      out.write("</li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link u-white\" href=\"Battle-Pass.jsp\" target=\"_blank\">Battle Pass TI 2020</a>\n");
      out.write("</li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link u-white\" href=\"Trang-phục.jsp\">Set, trang phục</a>\n");
      out.write("</li></ul>\n");
      out.write("</div>\n");
      out.write("</li><li class=\"u-nav-item\"><a class=\"u-active-white u-button-style u-hover-palette-1-base u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base u-white\" href=\"Boosting.jsp\" style=\"padding: 36px 80px;\">Boosting</a>\n");
      out.write("</li><li class=\"u-nav-item\"><a class=\"u-active-white u-button-style u-hover-palette-1-base u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base u-white\" href=\"Contact.jsp\" style=\"padding: 36px 80px;\">Liên hệ</a>\n");
      out.write("</li><li class=\"u-nav-item\"><a class=\"u-active-white u-button-style u-hover-palette-1-base u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base u-white\" href=\"login.jsp\" style=\"padding: 36px 80px;\">My account</a>\n");
      out.write("</li></ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"u-custom-menu u-nav-container-collapse\">\n");
      out.write("          <div class=\"u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav\">\n");
      out.write("            <div class=\"u-menu-close\"></div>\n");
      out.write("            <ul class=\"u-align-center u-nav u-popupmenu-items u-unstyled u-nav-3\"><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"Home.html\" style=\"padding: 36px 80px;\">Home</a>\n");
      out.write("</li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"#carousel_f3ca\" style=\"padding: 36px 80px;\">Shop</a><div class=\"u-nav-popup\"><ul class=\"u-h-spacing-20 u-nav u-unstyled u-v-spacing-10 u-nav-4\"><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"Dota-plus.jsp\" target=\"_blank\">Dota plus</a>\n");
      out.write("</li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"Battle-Pass.jsp\" target=\"_blank\">Battle Pass TI 2020</a>\n");
      out.write("</li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"Trang-phục.jsp\">Set, trang phục</a>\n");
      out.write("</li></ul>\n");
      out.write("</div>\n");
      out.write("</li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"Boosting.jsp\" style=\"padding: 36px 80px;\">Boosting</a>\n");
      out.write("</li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"Contact.jsp\" style=\"padding: 36px 80px;\">Liên hệ</a>\n");
      out.write("</li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link\" href=\"login.jsp\" style=\"padding: 36px 80px;\">My account</a>\n");
      out.write("</li></ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"u-black u-menu-overlay u-opacity u-opacity-70\"></div>\n");
      out.write("        </div>\n");
      out.write("      </nav></header>\n");
      out.write("<section class=\"u-align-center u-border-2 u-border-grey-75 u-clearfix u-image u-image-tiles u-shading u-section-1\" id=\"sec-b795\" data-image-width=\"1600\" data-image-height=\"900\">\n");
      out.write("      <div class=\"u-clearfix u-sheet u-valign-middle u-sheet-1\"><!--products--><!--products_options_json--><!--{\"type\":\"Recent\",\"source\":\"\",\"tags\":\"\"}--><!--/products_options_json-->\n");
      out.write("        <div class=\"u-expanded-width u-products u-repeater u-repeater-1\"><!--product_item-->\n");
      out.write("            ");
 Account acc = (Account)session.getAttribute("acc");
            session.setAttribute("notloggedin", true);
      out.write("\n");
      out.write("           ");
      out.write("\n");
      out.write("          ");
 ItemDAO all = new ItemDAO();
             ArrayList<Item> allItem = new ArrayList<>();
            allItem = all.getAll();
            for (Item i : allItem){

          
      out.write(" \n");
      out.write("          <div class=\"u-align-left u-black u-container-style u-opacity u-opacity-65 u-products-item u-radius-7 u-repeater-item u-shape-round u-repeater-item-1\">\n");
      out.write("            <div class=\"u-container-layout u-similar-container u-container-layout-1\"><!--product_image-->\n");
      out.write("              <img alt=\"\" class=\"u-expanded-width u-image u-image-default u-product-control u-image-1\" src=\"");
      out.print(i.getLinkImage());
      out.write("\"><!--/product_image--><!--product_title-->\n");
      out.write("              <h4 class=\"u-product-control u-text u-text-1\">\n");
      out.write("                  <a class=\"u-product-title-link\" href=\"#\"><!--product_title_content-->");
      out.print(i.getName());
      out.write("<!--/product_title_content--></a>\n");
      out.write("              </h4><!--/product_title--><!--product_content-->\n");
      out.write("              <div class=\"u-product-control u-product-desc u-text u-text-default u-text-2\"><!--product_content_content-->");
      out.print(i.getDiscription());
      out.write("<!--/product_content_content--></div><!--/product_content--><!--product_price-->\n");
      out.write("              <div class=\"u-product-control u-product-price u-product-price-1\">\n");
      out.write("                <div class=\"u-price-wrapper u-spacing-10\"><!--product_old_price-->\n");
      out.write("                    <div class=\"u-price u-text-palette-1-base\" style=\"font-size: 1.5rem; font-weight: 700;\"><!--product_regular_price_content-->$");
      out.print(i.getPrice());
      out.write("<!--/product_regular_price_content--></div><!--/product_regular_price-->\n");
      out.write("                </div>\n");
      out.write("              </div><!--/product_price--><!--product_button--><!--options_json--><!--{\"clickType\":\"add-to-cart\"}--><!--/options_json-->\n");
      out.write("              ");
 if (acc==null){
      out.write("\n");
      out.write("                  \n");
      out.write("              <a href=\"login.jsp\" class=\"u-border-2 u-border-grey-75 u-btn u-button-style u-hover-palette-3-dark-1 u-palette-3-light-1 u-product-control u-btn-1\"><!--product_button_content-->Add to Cart<!--/product_button_content--></a><!--/product_button-->\n");
      out.write("              ");
}
                else{
      out.write("\n");
      out.write("              <a href=\"https://nicepage.com\" class=\"u-border-2 u-border-grey-75 u-btn u-button-style u-hover-palette-3-dark-1 u-palette-3-light-1 u-product-control u-btn-1\"><!--product_button_content-->Add to Cart<!--/product_button_content--></a><!--/product_button-->\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            </div>\n");
      out.write("          </div><!--/product_item--><!--product_item-->\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        </div><!--/products-->\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <footer class=\"u-align-center u-clearfix u-footer u-grey-80 u-footer\" id=\"sec-ee23\"><div class=\"u-clearfix u-sheet u-sheet-1\">\n");
      out.write("        <p class=\"u-small-text u-text u-text-variant u-text-1\">Sample text. Click to select the text box. Click again or double click to start editing the text.</p>\n");
      out.write("        <a href=\"https://nicepage.com\" class=\"u-border-2 u-border-palette-3-dark-1 u-btn u-button-style u-hover-palette-3-light-1 u-palette-3-light-2 u-text-palette-3-dark-2 u-btn-1\">Login</a>\n");
      out.write("      </div></footer>\n");
      out.write("    <section class=\"u-backlink u-clearfix u-grey-80\">\n");
      out.write("      <a class=\"u-link\" href=\"https://nicepage.com/website-templates\" target=\"_blank\">\n");
      out.write("        <span>Website Templates</span>\n");
      out.write("      </a>\n");
      out.write("      <p class=\"u-text\">\n");
      out.write("        <span>created with</span>\n");
      out.write("      </p>\n");
      out.write("      <a class=\"u-link\" href=\"https://nicepage.com/\" target=\"_blank\">\n");
      out.write("        <span>Website Builder Software</span>\n");
      out.write("      </a>. \n");
      out.write("    </section>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
