/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo;

/**
 *
 * @author labc205
 */
public class Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int arreglo[]= new int[10];
        for(int i = 0; i< 10; i++){
            arreglo[i] = i*2;
        }
        
        for(int i=0; i<10; i++){
            System.out.println(arreglo[i]);
        }
        
        for(int i : arreglo){
            System.out.println(i);
        }
        
    }
    
}
