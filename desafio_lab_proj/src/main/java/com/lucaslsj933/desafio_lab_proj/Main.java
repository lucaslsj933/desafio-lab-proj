/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucaslsj933.desafio_lab_proj;



/** Não está terminado: conserte os ataques
 * 
 * @author Lucas Non-Admin
 */
public class Main {
    public static void main(String[] args) {
        Personagem jogador=new Personagem("Jogador",200,150,100);
        Personagem soldado1=new Personagem("Soldado",100,100,100);
        Batalha batalha1=new Batalha("Floresta",jogador,soldado1);
        batalha1.batalhaMain();
    }
}
