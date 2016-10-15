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
public class Jogo {
    
    SimpleFactoryPersonagem person = FactoryAleatoryPersonagem.getInstance(); 
    SimpleFactoryEscudos escudos = FactoryEscudos.getInstance();
    
    public void jogar()
    {
       Personagem p,a,b,c;
        
        //criando aleatoriamente personagens
        p = person.createPersonagem();
        a = person.createPersonagem();
        b = person.createPersonagem();
        c = person.createPersonagem();
        
        //colocando escudos em P e C
        escudos.createEscudo(p, 0);
        escudos.createEscudo(c, 1);
        
        //C atacando P
        p.receberAtaque(c, new AtaqueFogo(null));
        
        //ver configuaração de P
        p.faz();
        System.out.println(p.getNome()+" life:"+p.getLife()+"\n");
        
        //adicionando observadores
        p.adicionarObservador(a);
        p.adicionarObservador(b);
        p.adicionarObservador(c);
        
        //alterar coordenada de P e notificando os observadores
        p.alterarCoordenadas();
        
        a.faz();
        System.out.println(a.getNome()+" life:"+a.getLife()+"\n");
        
        b.faz();
        System.out.println(b.getNome()+" life:"+b.getLife()+"\n");
        
        c.faz();
        System.out.println(c.getNome()+" life:"+c.getLife()+"\n");
    }
        
}
