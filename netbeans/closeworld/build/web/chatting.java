

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class chatting extends Applet implements ActionListener{
Label l1;
TextArea ta1;
TextField t1;
Button b1;
String userid1="vinay";
String userid2="kkr";
Connection con = null;
String url = "jdbc:mysql://localhost:3306/";
String db = "closeworld";
String driver = "com.mysql.jdbc.Driver";
String userName ="root";
String password="root";
Statement st,st1;
    public void init() {
        setLayout(null);
//here we defined GIU so plz dont mess up
         l1 = new Label("vinay kumarsasssssssssssssssssssssssssssssssssskkkk");
        ta1 = new TextArea(10, 10);
         t1 = new TextField(10);
        b1 = new Button("Send");
//adding into 
        add(l1);
        add(ta1);
        add(t1);
        add(b1);
        
        ta1.setEditable(false);
        l1.setBounds(5, 5, 350, 15);
        ta1.setBounds(0, 20, 350, 140);
        t1.setBounds(0, 160,250 , 40);
        b1.setBounds(250, 160,100,40);
        t1.addActionListener(this);
        b1.addActionListener(this);
       
//print from the data base

try{
l1.setText(""+userid2);
Class.forName(driver).newInstance();
con = DriverManager.getConnection(url+db,userName,password);
st = con.createStatement();
String query = "SELECT * FROM chat where user1='"+userid2+"' or user2='"+userid2+"' and sendby='"+userid1+"';";
ResultSet rs = st.executeQuery(query);

while(rs.next()){
ta1.append(" "+rs.getString("sendby")+"  :  "+rs.getString("content")+"\n");
}
}
catch( Exception e){
    showStatus("");
}
        }
@Override
    public void actionPerformed(ActionEvent e) {
       String a=t1.getText();
       String check1="";
       if(check1.equals(a)){
       showStatus("nothing to enter");
       }
       else{
       ta1.append(userid1+"  :  "+a+"\n");
       t1.setText("");
       try{
Class.forName(driver).newInstance();
con = DriverManager.getConnection(url+db,userName,password);
st1 = con.createStatement();
String query2 = "insert into chat values(0,'"+userid1+"','"+userid2+"','"+a+"','"+userid1+"');";
 st1.executeUpdate(query2);
}catch(Exception e11){
    showStatus(""+e11);
}
       }
       }
}
