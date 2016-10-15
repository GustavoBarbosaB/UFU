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
interface Subject {
    public void adicionarObservador(Observer o);
    public void removerObservador(Observer o);
    public void notificarObservadores();
    public Boolean getAlterado();
    
}
