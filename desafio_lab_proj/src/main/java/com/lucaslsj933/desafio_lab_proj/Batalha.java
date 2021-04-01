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
    static Personagem[] pers=new Personagem[2];;
    static String local;
    static Scanner scanObj=new Scanner(System.in);
    static int persAtual;
    
    public static void batalhaInit(String localParam,Personagem pers1,Personagem pers2) {
        local=localParam;
        pers[0]=pers1;
        pers[1]=pers2;
    }
    
    public static void batalhaMain(){
        char comando;
        persAtual=0;
        System.out.println("Batalha no local "+local+" "+"iniciada!");
        while((pers[0].energia>0)&&(pers[1].energia>0)) {
            pers[persAtual].calcSorte();
            System.out.println(pers[0].nome+" - HP: "+pers[0].energia+" Poder: "+String.format("%.0f",pers[0].poder));
            System.out.println(pers[1].nome+" - HP: "+pers[1].energia+" Poder: "+String.format("%.0f",pers[1].poder));
            if(persAtual==0) {
                System.out.println("\nTurno de "+pers[persAtual].nome+"\n");
                System.out.println("Digite o comando: (A para Atacar): ");
                comando=scanObj.next().charAt(0);
                System.out.println("");
                if((comando=='a')||(comando=='A')) {
                    
                    pers[persAtual].atacar(1);
                }
                else {
                     System.out.println("Comando Inválido!");
                     continue;
                }
            }
            else if(persAtual==1) {
                System.out.println("\nTurno de "+pers[persAtual].nome+"\n");
                pers[persAtual].atacar(0);
            }
            //Mudança de turno
            if(persAtual==0)
                persAtual=1;
            else if(persAtual==1)
                persAtual=0;
        }
        System.out.println("");
        batalhaEnd();
    }
    
    public static void batalhaEnd() {
        int vencedorId=-1;
        if(pers[0].energia>pers[1].energia){
            vencedorId=0;
        }
        else if(pers[1].energia>pers[0].energia) {
            vencedorId=1;
        }
        System.out.println("O jogo acabou! O vencedor é "+pers[vencedorId].nome+" e sobrou "+pers[vencedorId].energia+ " HP!");
    }
}
