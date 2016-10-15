/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica3;
import java.util.ArrayList;

public class Personagem implements Observer,Subject{
    
    private int life;
    private final String nome;
    private Pular p;
    private Correr c;
    private Atacar a;
    private Escudo e;
    private Boolean alterado;    
    private ArrayList<Observer> personagens = new ArrayList<>();
         
    
    Personagem(Pular p, Correr c, Atacar a, Escudo e, String nome)
    {
       this.a = a;
       this.p = p;
       this.c = c;
       this.nome = nome;
       this.life=100;
       this.alterado=false;
       this.e=e;
    }
    
    public void faz()
    {
        System.out.println(this.getNome()+": "+this.a.ataca()+".");
        System.out.println(this.getNome()+": "+this.p.pula()+".");
        System.out.println(this.getNome()+": "+this.c.corre()+".");
       
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
      public void alterarCoordenadas(){
        alterado=!alterado;
        notificarObservadores();
    }
    
    @Override
    public Boolean getAlterado() {
       return alterado;
    }

    @Override
    public void adicionarObservador(Observer o) {
        personagens.add(o);
    }

    @Override
    public void removerObservador(Observer o) {
        personagens.remove(o);
    }

    @Override
    public void notificarObservadores() {
        personagens.stream().forEach((o) -> {
            o.update(this);
        });
    }

    @Override
    public void update(Subject s) {
       System.out.println("Notificação para Personagem "+this.getNome()+", posição do inimigo mudada!");
    }
    
    public int getLife()
    {
        return this.life; 
    }
    
    public void setAtaque(Atacar a)
    {      
       this.a=a;
    }
    public void setEscudo(Escudo e)
    {      
       this.e=e;
    }
     public Atacar getAtaque() {
        return this.a;
    }
    
    public void receberAtaque(Personagem inimigo, Atacar ataque)
    {
        DecoratorAtaque ataca;             
                  
            if(ataque instanceof DecoratorAtaque){
                
                ataca = (DecoratorAtaque) ataque;
                             
              if(ataca!=null){
                
                while(ataca.ataque!=null && (ataca instanceof Ataque3x) || (ataca instanceof Ataque2x))
                {
                    ataca = (DecoratorAtaque) ataca.ataque;
                }
                    if(this.e!=null){//tem escudo
                        if(!this.e.defesa(ataca))//não possui escudo
                           this.life-=ataque.getDano();
                        else//possui escudo
                            System.out.println("Você defendeu!");
                   }else//não tem escudo
                        this.life-=ataque.getDano();                      
                }                              
            }else
                    this.life-=ataque.getDano(); 
}

    public Escudo getEscudo() {
       return this.e;
    }
    
    
}