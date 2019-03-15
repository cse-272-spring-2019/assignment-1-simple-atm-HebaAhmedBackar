/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmo;

import java.util.HashMap;

/**
 *
 * @author HebaBackar
 */
public class LoginAuth {
    HashMap users;
            public LoginAuth(){
                users = new HashMap();
                users.put("1234","1234");
                

            }
    public boolean validate(String pin){
        boolean valid;
        String fetchedpin = (String) users.get(pin);
        if (fetchedpin!=null){
            valid=fetchedpin.equals(pin);
        }
        else {
            valid=false;
        }
        return valid;
                
        
    }
}
