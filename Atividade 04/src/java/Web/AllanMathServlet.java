/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fatec
 */
@WebServlet(name = "AllanMathServlet", urlPatterns = {"/allanmath.html"})
public class AllanMathServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AllanMathServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h4><a href='index.html'>Voltar</a></h4>");
            out.println("<h1>Servlet SomaServlet at " + request.getContextPath() + "</h1>");
            double n1 = 2;
            double n2 = 2;
            String op = "adi";
            try{
                n1 = Double.parseDouble(request.getParameter("n1"));
                n2 = Double.parseDouble(request.getParameter("n2"));
                op = request.getParameter("ope");
            }catch(Exception ex){
                out.println("<div style='color:red'>"
                        +"Parâmetro inválido</div>");
            }
            out.println("<form action=\"allanmath.html\">\n" +
"            Valor:<br>\n" +
"            <input type=\"number\" name=\"n1\" value=\"0\"/><br>\n" +
"\n" +
"            <input type=\"radio\" name=\"ope\" id=\"adicao\" value=\"adi\"><label for=\"adicao\">Mais</label><br>\n" +
"            <input type=\"radio\" name=\"ope\" id=\"subtracao\" value=\"sub\"> <label for=\"subtracao\">Menos</label><br>\n" +
"            <input type=\"radio\" name=\"ope\" id=\"multiplicacao\" value=\"multi\"> <label for=\"multiplicacao\">Vezes</label><br>\n" +
"            <input type=\"radio\" name=\"ope\" id=\"divisao\" value=\"div\"> <label for=\"divisao\">Dividido por</label> <br>\n" +
"    \n" +
"            <input type=\"number\" name=\"n2\" value=\"0\"/>\n" +
"            <input type=\"submit\" name=\"calcular\" value=\"=\"/>\n" +
"        </form>");
                        if (op.contains("adi")) {
                   out.println("<br>");
                   out.println("<h3>");
                   out.println("Resultado:");
                   out.println("</h3>");
                   out.println(n1+" + "+n2+" = "+(n1+n2));
               }
            if (op.contains("multi")) {
                   out.println("<br>");
                   out.println("<h3>");
                   out.println("Resultado:");
                   out.println("</h3>");
                   out.println(n1+" X "+n2+" = "+(n1*n2));
               } 
            if (op.contains("div")) {  
                   out.println("<br>");
                   out.println("<h3>");
                   out.println("Resultado:");
                   out.println("</h3>");
                   out.println(n1+" / "+n2+" = "+(n1/n2));
               } 
            if (op.contains("sub")) {  
                   out.println("<br>");
                   out.println("<h3>");
                   out.println("Resultado:");
                   out.println("</h3>");
                   out.println(n1+" - "+n2+" = "+(n1-n2));
               } 
                    

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
