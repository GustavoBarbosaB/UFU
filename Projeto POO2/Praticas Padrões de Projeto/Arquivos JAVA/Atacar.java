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
public abstract class Atacar {
    
    private int dano;
    
    public abstract String ataca();
    
    public void setAtaque(int ataque)
    {
        this.dano = ataque;
    }
    
    public int getDano()
    {
        return this.dano;
    }
    
}
