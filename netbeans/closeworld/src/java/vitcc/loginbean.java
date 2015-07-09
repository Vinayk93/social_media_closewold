/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vitcc;

/**
 *
 * @author SACHIN KATIYAR
 */
public class loginbean extends org.apache.struts.action.ActionForm {
    
    private String user;
    private String pass;

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

  
}
