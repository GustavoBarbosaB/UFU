/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica3;

/**
 *
 * @author Seven
 */
public class AtacarMedio extends Atacar{
    
    AtacarMedio()
    {
        super.setAtaque(20);
    }
    
    @Override
    public String ataca() {
      return "Atacando Medio";
    }
}
