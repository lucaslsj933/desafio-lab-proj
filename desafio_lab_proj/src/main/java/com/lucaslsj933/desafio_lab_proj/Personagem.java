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
    public float poder;
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
    
    public void atacar(int persInimId){
        int dano=0;
        float temp;
        if(sorte<=15)
            //Ataque falhou
            dano=0;
        else if((sorte>=16)&&(sorte<=70))
            //Ataque normal
            dano=(int)(poder*0.3f);
        else if((sorte>=71)&&(sorte<=95)) {
            //Ataque com sorte
            temp=poder*0.3f;
            dano=(int)(temp+temp*0.2f);
        }
        else if((sorte>=97)&&(sorte<=100)) {
            //Ataque crítico
            temp=poder*0.3f;
            dano=(int)temp*2;
        }
        Batalha.pers[persInimId].energia=Batalha.pers[persInimId].energia-dano;
        printDanoDoInim(dano);
    }
    
    public void printDanoDoInim(int danoParam) {
        String strPrintDano="";
        if(sorte<=15)
            //Ataque falhou
            strPrintDano="Errou - "+danoParam+" "+"HP";
        else if((sorte>=16)&&(sorte<=70))
            //Ataque normal
            strPrintDano="Normal - "+danoParam+" "+"HP";
        else if((sorte>=71)&&(sorte<=95))
            //Ataque com sorte
            strPrintDano="Sorte!!! - "+danoParam+" "+"HP";
        else if((sorte>=97)&&(sorte<=100))
            //Ataque crítico
            strPrintDano="Crítico!!! - "+danoParam+" "+"HP";
        System.out.println(strPrintDano);
    }
}
