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
public class EscudoAgua extends Escudo {

    public EscudoAgua(Escudo escudo) {
        super(escudo);
    }

    @Override
    public Boolean defesa(Atacar ataque) 
    {
        if(ataque instanceof AtaqueAgua)
            return true;
        else{
         if(super.getSucessor()!=null)
           return super.getSucessor().defesa(ataque);
        }                
    return false;
    }
    
}
