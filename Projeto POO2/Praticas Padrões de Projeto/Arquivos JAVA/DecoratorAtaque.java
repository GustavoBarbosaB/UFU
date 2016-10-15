/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica3;

/**
 *
 * @author Gustavo Barbosa
 */
public abstract class DecoratorAtaque extends Atacar{
    
    Atacar ataque;
   
    public DecoratorAtaque(Atacar ataque)
    {
        this.ataque = ataque;
    }  
      
}
