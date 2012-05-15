/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Student.StudentDetails;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Meer
 */
@WebServlet(name = "Controller", urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controller</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controller at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String stdname;
        String grade;
        String subject;
        String marks;
        
        stdname=request.getParameter("sname");
        grade=request.getParameter("grade");
        subject=request.getParameter("subject");
        marks=request.getParameter("marks");
        
        ValidateClass v=new ValidateClass();
        
        boolean result1=v.checkFields(subject, marks);
        if(result1){
            boolean result2=v.is_int(marks);
            if(result2){
                int marks1=Integer.parseInt(marks);
                boolean result3=v.checkMarks(marks1);
                if(result3){
                    StudentDetails sd=v.setDetails(stdname, grade, subject, marks1);
                    request.setAttribute("myBean", sd);
                    RequestDispatcher dispatcher=request.getRequestDispatcher("Response.jsp");
                    dispatcher.forward(request, response);
                    
                    if(marks1>80)
                        System.out.println("Very wel done"+stdname);                    
                }
                else response.sendRedirect("checkmarks.jsp");
            }
             else response.sendRedirect("unvalidmarks.jsp");
        }
         else response.sendRedirect("checkempty.jsp");
        
        //processRequest(request, response);
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
