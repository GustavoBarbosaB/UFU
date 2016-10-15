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
public class FactoryEscudos implements SimpleFactoryEscudos {
    
   private static FactoryEscudos instance = null;
       
    FactoryEscudos(){super();}
  
    public static synchronized FactoryEscudos getInstance()
    {
          if(instance==null)
                  instance = new FactoryEscudos();

          return instance;
    }

    @Override
    public Personagem createEscudo(Personagem p, int c) {
           
       
         switch(c)
        {
            case 0:
            {
               p.setEscudo(new EscudoAgua(p.getEscudo()));
               p.setEscudo(new EscudoAr(p.getEscudo()));
               break;
                
            }
            case 1:
            {
               p.setEscudo(new EscudoTerra(p.getEscudo()));
               p.setEscudo(new EscudoFogo(p.getEscudo()));
                break;
            }
            case 2:
            {
               p.setEscudo(new EscudoFogo(p.getEscudo()));
               p.setEscudo(new EscudoAr(p.getEscudo()));
                break;
            }   
          
        
        }
        
     return p;        
    }
    
    
    
}
