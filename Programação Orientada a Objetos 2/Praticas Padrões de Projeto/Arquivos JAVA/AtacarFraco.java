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
public class AtacarFraco extends Atacar {
    
    AtacarFraco()
    {
        super.setAtaque(10);
    }
    
    @Override
    public String ataca() {
      return "Atacando Fraco";
    }
}
