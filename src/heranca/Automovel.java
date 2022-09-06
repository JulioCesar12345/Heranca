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
public class Automovel extends Terrestre{//Extends esta herdando atributos classe terrestre.
    private String numPlaca;
    private int numPortas;

    public String getNumPlaca() {
        return numPlaca;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    public void mostrarCarro(){
        System.out.println("A placa é: "+numPlaca+" o numero de portas: "+numPortas+" o numero de rodas: "+numeroRodas);
    }
    
    
}
