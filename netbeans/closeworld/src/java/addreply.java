/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vinay
 */
public class addreply extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        
out.println("<html><body>step 1</body></html>");
String id=request.getParameter("commentid");
String content=request.getParameter("reply");
HttpSession session=request.getSession(true);
Integer userid= (Integer)session.getAttribute("userid");
out.println(""+id);
try{
Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/closeworld","root","root");
Statement stat=conn.createStatement();
String query="Select * from profile where userid="+userid+";";
out.print("Select * from profile where userid="+userid+";");
ResultSet rs= stat.executeQuery(query);         
  
while(rs.next()){
            
Statement stet=conn.createStatement(); 
String str4="insert into coment values(0,'','"+rs.getString(1)+"','"+rs.getString(2)+"','"+content+"',now(),'"+id+"','"+userid+"');";
out.println("insert into coment values(0,'','"+rs.getString(1)+"','"+rs.getString(2)+"','"+content+"',now(),'"+id+"','"+userid+"');");
stet.execute(str4);
out.print("finish");

        }
stat.close();
conn.close();
}
       catch (ClassNotFoundException e) {
        } 
            catch (SQLException e) {
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
