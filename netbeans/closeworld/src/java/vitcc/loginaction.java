/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vitcc;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import java.sql.*;

/**
 *
 * @author SACHIN KATIYAR
 */
public class loginaction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static  String SUCCESS = "fail";

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        boolean status=false;
        HttpSession session=request.getSession(true);
        loginbean lb=(loginbean)form;
        String name=lb.getUser();
        String pass=lb.getPass();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/closeworld","root","root");
            Statement stmt=(Statement) con.createStatement();
            PreparedStatement pst=(PreparedStatement) con.prepareStatement("select * from register where email=? and password=?");
            pst.setString(1,name);
            pst.setString(2,pass);
            ResultSet rs=pst.executeQuery();
            status=rs.next();
            if(status){
                session.setAttribute("first",rs.getString("first").toUpperCase());
                session.setAttribute("last",rs.getString("last").toUpperCase());
               session.setAttribute("userid",rs.getInt("userid"));
                SUCCESS="success";
           }
            else{
                request.setAttribute("msg", "*Invalid Login");
                SUCCESS="fail";
            }
        }
        
        catch(Exception e){
	e.printStackTrace();
	}
        return mapping.findForward(SUCCESS);
    }
}
