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
        Usuario usuarios = new Usuario();
        usuarios.agregar("18020323", "123", 
                "Carlos", "Cerda", 
                "carlos.cerda@uamv.edu.ni");
        usuarios.agregar("21011522","147" ,"Carlos", 
                "Gurdian", "carlos.gurdian@gmail.com");
        usuarios.agregar("1", "123", "Synthia", "Gonzalez", 
                "sgonz@gmail.com");

        ArrayList<Object> newLista=
                new ArrayList<>();
        newLista = usuarios.buscarXNombre("s");
        
        for(Object u : newLista){
            System.out.println(u);
        }
        
//        Login login = new Login();
//        login.usuarios= usuarios;
//        
//        
//        login.setVisible(true);
    }
    
    public void llenarUsuario(){
        Usuario usuarios = new Usuario();
        usuarios.agregar("18020323", "123", 
                "Carlos", "Cerda", 
                "carlos.cerda@uamv.edu.ni");
        usuarios.agregar("21011522","147" ,"Carlos", 
                "Gurdian", "carlos.gurdian@gmail.com");
        usuarios.agregar("1", "123", "Synthia", "Gonzalez", 
                "sgonz@gmail.com"); 
        
        Login login = new Login();
        login.usuarios= usuarios;
        
        login.setVisible(true);
    }
}
