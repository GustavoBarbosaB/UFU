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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Personagem principal = new Personagem(new PulaBaixo(),new CorreMedio(), new AtacarFraco(),null,"Gustavo");
        Personagem inimigo1,inimigo2,inimigo3;
        
        inimigo1 = new Personagem(new PulaMedio(), new CorreMedio(), new AtacarForte(),null,"Inimigo 1");        
        //inimigo2 = new Personagem(new PulaAlto(), new CorreDevagar(), new AtacarForte(),null,"Inimigo 2");        
        //inimigo3 = new Personagem(new PulaMedio(), new CorreRapido(), new AtacarFraco(),null,"Inimigo 3");        
        
        principal.setAtaque(new AtaqueFogo(principal.getAtaque()));
        principal.setAtaque(new AtaqueTerra(principal.getAtaque()));
        principal.setAtaque(new AtaqueAr(principal.getAtaque()));
    
        principal.faz();
        inimigo1.faz();
        
        System.out.println("Vida antes: "+principal.getNome()+" life "+principal.getLife());
      
        //DESCOMENTE A LINHA ABAIXO PARA ATIVAR O ESCUDO DE AGUA
         //principal.setEscudo(new EscudoAgua(principal.getEscudo()));
        
        principal.receberAtaque(inimigo1, new Ataque2x(new Ataque3x(new AtaqueAgua(null))));
        System.out.println("Vida depois:"+principal.getNome()+" life "+principal.getLife());
        */
       
        Jogo jogo = new Jogo();
        
        jogo.jogar();
    }
    
}
