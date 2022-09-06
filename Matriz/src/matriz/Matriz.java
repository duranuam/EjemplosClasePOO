/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

/**
 *
 * @author labc205
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz[][] =new int[3][3];
        for(int i= 0; i<3; i++){
            for(int j=0; j<3; j++){
                matriz[i][j]= 3*j;
            }
        }
        
//        for(int i= 0; i<3; i++){
//            for(int j=0; j<3; j++){
//                System.out.print(" "+matriz[i][j]);
//            }
//            System.out.println();
//        }
        
        for(int[] i: matriz){
            for(int j : i){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
