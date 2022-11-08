/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miuam;

import dao.Usuario;
import formularios.Login;
import java.util.ArrayList;

/**
 *
 * @author labc205
 */
public class MiUAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        dao.Usuario usuarios = new dao.Usuario();
        Login login = new Login();
        login.usuarios= usuarios;
        login.setVisible(true);
    }
    
   
    
}
