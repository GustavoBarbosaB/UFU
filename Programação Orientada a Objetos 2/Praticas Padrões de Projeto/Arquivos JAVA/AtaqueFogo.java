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
public class AtaqueFogo extends DecoratorAtaque {

    AtaqueFogo(Atacar ataque) {
        super(ataque);
        super.setAtaque(15);
    }
    
    @Override
    public String ataca()
    {
          if(this.ataque!=null)
            return this.ataque.ataca()+", "+"Ataque Fogo";
          else
            return "Ataque Fogo";
    }
}
