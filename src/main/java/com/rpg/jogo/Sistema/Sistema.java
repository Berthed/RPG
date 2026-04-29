package com.rpg.jogo.Sistema;

import java.util.Random;

import org.yaml.snakeyaml.scanner.ScannerException;

import com.rpg.jogo.Monstros.Monstro;

public class Sistema {
    public static int rolarDados20(){
        Random random = new Random();
        int dados = random.nextInt(1, 21);
        return dados;
        // Objetivo: esse método deve ser chamado por outros locais do RPG para rodar um D20
    }
    public static boolean verificarAcerto(){
        // aqui será necessário rolar um dado pra saber se o acerto vai ou não passar, mas para isso é necessário saber ataque e defesa dos personagens
        Sistema.rolarDados20();
        if (Sistema.rolarDados20() >= 10) {
            Sistema.calcularDano();
            return true;
        } else {
            System.out.println("Você errou o ataque.");
            return false;
        }
        
    }
    public static double calcularDano(Personagem p1, Monstro m1){
        double dano;
        if (p1.forca <= m1.defesa) {
            dano = 1;
        } else {
            dano = (p1.forca - m1.defesa);
        }
        return dano;
        // A gente ficou um pouco travado de fazer esse, por depender da classe personagem
        // usamos objetos hipoteticos. Objetivo: se a defesa do mob for maior do que a força do personagem, ele deve dar ao menos 1 de dano, recompensando o acerto do dado.
    }
    public static boolean resultadoDungeon(Monstro m1){
        boolean vitoria;
        if (m1.vida <= 0) {
            return vitoria = true;
            Sistema.aumentarProfundidade();
        } else {
            return vitoria = false;
        }
        // provavelmente a lógica do return está errado
        // se vitoria acontecer, a profundidade aumenta. se vitoria é false, e esse método for chamado, então a dungeon será contabilizada como fail.
    }
    public static int aumentarProfundidade(){
        int profudidade = 0;
        return profudidade++;
        // provavelmente a lógica do return está errada também.
        // se esse método for chamado, a profudidade aumentará em +1, provavelmente a variavel profundidade não seria criado aqui, mas numa aba "dungeon"
    }
}