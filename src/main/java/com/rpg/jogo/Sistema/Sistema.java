package com.rpg.jogo.Sistema;

import java.util.Random;

import com.rpg.jogo.Monstros.Monstro;

public class Sistema {
    private int profundidade = 0;
    public static int rolarDados20(){
        Random random = new Random();
        int dados = random.nextInt(1, 21);
        return dados;
        // Objetivo: esse método deve ser chamado por outros locais do RPG para rodar um D20
    }
    public boolean verificarAcerto(Personagem p1, Monstro m1){
        // aqui será necessário rolar um dado pra saber se o acerto vai ou não passar, mas para isso é necessário saber ataque e defesa dos personagens
        int dado = Sistema.rolarDados20();
        if (dado >= 10) {
            calcularDano(p1, m1);
            return true;
        } else {
            System.out.println("Você errou o ataque.");
            return false;
        }
    }
    public double calcularDano(Personagem p1, Monstro m1){
        double dano;
        if (p1.forca <= m1.defesa) {
            dano = 1;
        } else {
            dano = (p1.forca - m1.defesa);
        }
        return dano;
        // usamos objetos hipoteticos. Objetivo: se a defesa do mob for maior do que a força do personagem, ele deve dar ao menos 1 de dano, recompensando o acerto do dado.
    }
    public boolean resultadoDungeon(Monstro m1){
        if (m1.vida <= 0) {
            aumentarProfundidade();
            return true;
        } else {
            return false;
        }
        // se vitoria acontecer, a profundidade aumenta. se vitoria é false, e esse método for chamado, então a dungeon será contabilizada como fail.
    }
    public void mostrarProfundidade(){
        System.out.println("A profundidade é " + profundidade);
    }
    public void aumentarProfundidade(){
        this.profundidade++;
        // se esse método for chamado, a profudidade aumentará em +1
    }
}