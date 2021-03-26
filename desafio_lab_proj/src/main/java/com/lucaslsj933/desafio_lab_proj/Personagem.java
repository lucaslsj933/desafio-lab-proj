/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucaslsj933.desafio_lab_proj;

/**
 *
 * @author Lucas Non-Admin
 */
public class Personagem {
    String nome;
    public int energia;
    public int poder;
    public int poderMax;
    public int energiaMax;
    public int sorte;
    public int sorteMax=100;
    
    public Personagem(String nomeParam,int energiaParam,int poderParam,int sorteMParam) {
        nome=nomeParam;
        energiaMax=energiaParam;
        poderMax=poderParam;
        sorteMax=sorteMParam;
        energia=energiaParam;
        poder=poderParam;
        
    }
    
    public void calcSorte(){
        sorte=(int)(Math.random() * (sorteMax+1));
    }
    
    public int getDanoDoInim(Personagem inimigo){
        int dano=0;
        float temp;
        if(sorte<=15)
            dano=0;
        else if((sorte>=16)&&(sorte<=70))
            dano=inimigo.energia*(1/3);
        else if((sorte>=71)&&(sorte<=95)) {
            //Ataque com sorte
            temp=inimigo.energia*(1.0f/3.0f);
            dano=(int)(temp+temp*0.2f);
        }
        else if((sorte>=97)&&(sorte<=100)) {
            //Ataque crítico
            temp=inimigo.energia*(1.0f/3.0f);
            dano=(int)temp*2;
        }
        return dano;
    }
}
