/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miuam;

import dao.Usuario;
import formularios.Login;

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
        Usuario usuarios = new Usuario();
        usuarios.agregar("18020323", "123", 
                "Carlos", "Cerda", 
                "carlos.cerda@uamv.edu.ni");
        usuarios.agregar("21011522","147" ,"Carlos", 
                "Gurdian", "carlos.gurdian@gmail.com");
        
        Login login = new Login();
        login.usuarios= usuarios;
        login.setVisible(true);
    }
    
}