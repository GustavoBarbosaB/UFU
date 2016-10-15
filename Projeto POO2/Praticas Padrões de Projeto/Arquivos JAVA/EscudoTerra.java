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
public class EscudoTerra extends Escudo
{

    public EscudoTerra(Escudo escudo) {
        super(escudo);
    }

    @Override
    public Boolean defesa(Atacar ataque) 
    {
        if(ataque instanceof AtaqueTerra)
            return true;
        else{
         if(super.getSucessor()!=null)
            return super.getSucessor().defesa(ataque);
        }         
     return false;
    }    
}
