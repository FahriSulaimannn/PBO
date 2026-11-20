/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul8;

/**
 *
 * @author fahri
 */
import java.util.Date;

public class OverLoadingConstructor {
    int idUser;
    String userName;
    int level;
    Date lastLogin;
    
    public OverLoadingConstructor() {
        
    }
    
    public OverLoadingConstructor(int idUser, String userName) {
        this.idUser = idUser;
        this.userName = userName;
    }
}
