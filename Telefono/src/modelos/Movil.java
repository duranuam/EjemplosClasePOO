/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author labc205
 */
public class Movil {
    private int numero;
    private double saldo;
    private Compañia com;
    private ArrayList<Mensaje> bandejaEntrada= 
            new ArrayList<>();
    
    public Movil() {
    }

    public Movil(int numero, double saldo, Compañia com) {
        this.numero = numero;
        this.saldo = saldo;
        this.com = com;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Compañia getCom() {
        return com;
    }

    public void setCom(Compañia com) {
        this.com = com;
    }

    @Override
    public String toString() {
        return "Movil{" + "numero=" + numero + ", saldo=" + saldo + ", com=" + com + ", bandejaEntrada=" + bandejaEntrada + '}';
    }

    
    
    public void recibirMsn(int origen, int destino, 
            String msn){
        bandejaEntrada.add(new Mensaje(origen, destino, msn));
    }
    
}
