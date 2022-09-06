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
public class Transporte {
   protected int capacidade;//Protected permite as classes ancestrais usarem atributos das classes que foram herdadas.

    public int getCapacidade() {//alt+insert geter e setter
        return capacidade;
    }
   
   public void SetCapacidade(int capacidade){
       this.capacidade=capacidade;
       
   }
   
}
