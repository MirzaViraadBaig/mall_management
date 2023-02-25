
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Viraad
 */
public class loginClass {
    ArrayList<String> username = new ArrayList<String>( Arrays.asList("alex", "brian", "charles") );
    ArrayList<String> password = new ArrayList<String>( Arrays.asList("aaa", "bbb", "ccc") );
    
    public loginClass(){};
    public boolean loginAction(String usr,String pow){
        for(int i = 0; i<=username.size() && i<=password.size();i++){
            
            if (username.get(i).equals(usr) && password.get(i).equals(pow)){
                return true;
            }
            
        }
        return false;
    }
    
}
