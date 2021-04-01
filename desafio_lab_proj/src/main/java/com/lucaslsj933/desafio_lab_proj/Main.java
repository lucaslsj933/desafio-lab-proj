/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucaslsj933.desafio_lab_proj;



/** Não está terminado: adicione defesa, e conserte o fato de que quando a batalha termina as estatísticas não aparecem
 * 
 * @author Lucas Non-Admin
 */
public class Main {
    public static void main(String[] args) {
        Personagem jogador=new Personagem("Jogador",200,150,100);
        Personagem soldado1=new Personagem("Soldado",100,100,100);
        Batalha.batalhaInit("Floresta",jogador,soldado1);
        Batalha.batalhaMain();
    }
}
