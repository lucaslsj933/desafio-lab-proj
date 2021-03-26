/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucaslsj933.desafio_lab_proj;

import java.util.Scanner;
/**
 *
 * @author Lucas Non-Admin
 */
public class Batalha {
    Personagem[] pers=new Personagem[2];;
    String local;
    Scanner scanObj=new Scanner(System.in);
    int persAtual;
    public Batalha(String localParam,Personagem pers1,Personagem pers2) {
        local=localParam;
        pers[0]=pers1;
        pers[1]=pers2;
    }
    
    public void batalhaMain(){
        char comando;
        persAtual=0;
        int danoAtual=0;
        String strPrintDano="";
        System.out.println("Batalha no local "+local+" "+"iniciada!");
        while((pers[0].energia>0)&&(pers[1].energia>0)) {
            pers[persAtual].calcSorte();
            System.out.println(pers[0].nome+" - HP: "+pers[0].energia+" Poder: "+pers[0].poder);
            System.out.println(pers[1].nome+" - HP: "+pers[1].energia+" Poder: "+pers[1].poder);
            System.out.println("\nDigite o comando: (A para Atacar ou D para Defender): ");
            comando=scanObj.next().charAt(0);
            if((comando=='a')||(comando=='A')) {
                if(persAtual==0)
                    danoAtual=pers[0].getDanoDoInim(pers[1]);
                else if(persAtual==1)
                    danoAtual=pers[1].getDanoDoInim(pers[0]);
                setDanoPers(danoAtual);
                if(pers[persAtual].sorte<=15)
                    strPrintDano="Errou - "+danoAtual+" "+"HP";
                else if((pers[persAtual].sorte>=16)&&(pers[persAtual].sorte<=70))
                    strPrintDano="Normal - "+danoAtual+" "+"HP";
                else if((pers[persAtual].sorte>=71)&&(pers[persAtual].sorte<=95))
                    strPrintDano="Sorte!!! - "+danoAtual+" "+"HP";
                else if((pers[persAtual].sorte>=97)&&(pers[persAtual].sorte<=100))
                    strPrintDano="Crítico!!! - "+danoAtual+" "+"HP";
                System.out.println(strPrintDano);
            }
        }
    }
    
    public void setDanoPers(int danoParam) {
        if(persAtual==0)
            pers[1].energia=pers[0].energia-danoParam;
        else if(persAtual==1)
            pers[0].energia=pers[0].energia-danoParam;
    }
}
