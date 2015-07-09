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
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import java.sql.*;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SACHIN KATIYAR
 */
public class registeraction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static  String SUCCESS = "fail";

    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
     
    registerbean rb=(registerbean)form;
        String fname=rb.getFname();
        String lname=rb.getLname();
        String emailid=rb.getEmail();
        String pass=rb.getPass();
         String pass1=rb.getPass1();
        String contact=rb.getContact();
       
        
        
        boolean status=false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/closeworld","root","root");
            Statement stmt=(Statement) con.createStatement();
            
            ResultSet rs= stmt.executeQuery("select * from register where email='"+emailid+"'");         
            status=rs.next();
            if(status){
                request.setAttribute("regmsg", "*Email-Id already registered.");
                SUCCESS="fail";  
           }
            else if( !(pass.equals(pass1))){
                request.setAttribute("regmsg", "*Password didn't match.");
                SUCCESS="fail";
            }
            else{
               
            PreparedStatement pst2=(PreparedStatement) con.prepareStatement("insert into register values(?,?,?,?,?,?,0)");
            pst2.setString(1,fname);
            pst2.setString(2,lname);
            pst2.setString(3,emailid);
            pst2.setString(4,pass);
            pst2.setString(5,pass1);
            pst2.setString(6,contact);
            
            
            int result=pst2.executeUpdate();
            
               //save file in profile
                
         Statement stmt22=(Statement) con.createStatement();
            ResultSet rs22= stmt22.executeQuery("select * from register where email='"+emailid+"'");   
            
            while(rs22.next()){
                 Statement stmt2=(Statement) con.createStatement();
            stmt2.execute("insert into profile values('image/def.jpg','"+fname+" "+lname+"','not specified','not specified','not specified','"+contact+"','not specified','not specified',"+rs22.getInt("userid")+");");         
            }
            
            //SENDING Mail
            
      // Recipient's email ID needs to be mentioned.
      String to = emailid ;//change accordingly

      // Sender's email ID needs to be mentioned
      String from = "vinaykumar8955402376@gmail.com";//change accordingly
      final String username = "vinaykumar8955402376@gmail.com";//change accordingly
      final String password = "8955402376";//change accordingly

      // Assuming you are sending email through relay.jangosmtp.net
      String host = "smtp.gmail.com";
      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.port", "587");

      // Get the Session object.
      Session session = Session.getInstance(props,
      new javax.mail.Authenticator() {
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(username, password);
         }
      });

      try {
         // Create a default MimeMessage object.
         Message message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));

         // Set Subject: header field
         message.setSubject("Testing Subject");

         // Now set the actual message
         message.setText("Thank you for choosing closeworld"
            + "");

         // Send message
         Transport.send(message);

         System.out.println("Sent message successfully....");

      } catch (MessagingException e) {
            throw new RuntimeException(e);
      }
            
            
            if(result>0)
            {
                request.setAttribute("regmsg", "*Registered Successfully!!!");
                HttpSession session1=request.getSession(false);
                session1.setAttribute("email",rs.getString("email"));
                session1.setAttribute("first",rs.getString("first").toUpperCase());
                session1.setAttribute("last",rs.getString("last").toUpperCase());
                SUCCESS="success";
       }
            }
        }
        catch(Exception e){
	e.printStackTrace();
	}
        return mapping.findForward(SUCCESS);
    }
}
