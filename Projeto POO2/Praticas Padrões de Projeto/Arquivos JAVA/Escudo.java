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
public abstract class Escudo 
{
   private Escudo sucessor;
    
    Escudo(Escudo escudo)
    {
        this.sucessor=escudo;
    }
    public Escudo getSucessor()
    {
        return this.sucessor;
    }
    
    public abstract Boolean defesa(Atacar ataque);

    void setSucessor(Escudo e) {
        this.sucessor = e;
    }
  
}
