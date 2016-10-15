/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica3;
import java.util.Random;

/**
 *
 * @author Gustavo Barbosa
 */
public class FactoryAleatoryPersonagem implements SimpleFactoryPersonagem
{
   private static FactoryAleatoryPersonagem instance=null;
   
   FactoryAleatoryPersonagem(){super();}
  
  public static synchronized FactoryAleatoryPersonagem getInstance()
  {
        if(instance==null)
                instance = new FactoryAleatoryPersonagem();
        
        return instance;
  }
  
   @Override
    public Personagem createPersonagem() {
        
        Random gerador = new Random();
        Personagem personagem = null;
        int c = gerador.nextInt(5);
      
        switch(c)
        {
            case 0:
            {
                personagem = new Personagem(new PulaBaixo(),new CorreMedio(), new AtacarFraco(),null,"Tipo1");
                personagem.setAtaque(new AtaqueAgua(personagem.getAtaque()));
                break;
                
            }
            case 1:
            {
                personagem = new Personagem(new PulaBaixo(),new CorreDevagar(), new AtacarForte(),null,"Tipo2");
                personagem.setAtaque(new AtaqueFogo(personagem.getAtaque()));
                break;
            }
            case 2:
            {
                personagem =new Personagem(new PulaAlto(),new CorreMedio(), new AtacarMedio(),null,"Tipo3");
                personagem.setAtaque(new AtaqueAr(personagem.getAtaque()));
                break;
                
            }
            case 3:
            {
                personagem =new Personagem(new PulaAlto(),new CorreRapido(), new AtacarFraco(),null,"Tipo4");
                personagem.setAtaque(new AtaqueTerra(personagem.getAtaque()));
                break;
            }
            case 4:
            {
                personagem =new Personagem(new PulaBaixo(),new CorreMedio(), new AtacarFraco(),null,"Tipo5");
                personagem.setAtaque(new AtaqueAgua(personagem.getAtaque()));
                personagem.setAtaque(new Ataque2x(personagem.getAtaque()));
                break;
            }
        
        }
        
     return personagem;
    }    
}
