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
public class Ataque2x extends DecoratorAtaque
{
 public Ataque2x(Atacar ataque) {
        super(ataque);
    }

    @Override
    public String ataca() {
        return this.ataque.ataca()+", "+"Ataque multiplicado por 2";
    }
    
    @Override 
    public int getDano()
    {
        return this.ataque.getDano()*2;
    }
        
}
