/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author julio.gabardo
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovel carro = new Automovel();
        Automovel moto = new Automovel();
        
        
        carro.setNumPlaca(" GRO 9565");
        carro.setNumPortas(3);
        carro.setNumeroRodas(4);//NumeroRodas herdado da classe Terrestre
        carro.SetCapacidade(0);//Capacidade herdado da classe transportante
        
       carro.mostrarCarro();
       moto.mostrarCarro();
        
    }
    
}
