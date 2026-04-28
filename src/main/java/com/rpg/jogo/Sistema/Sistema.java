package com.rpg.jogo.Sistema;

import java.util.Random;
import java.util.Scanner;

import org.yaml.snakeyaml.scanner.ScannerException;

public class Sistema {
    public static int rolarDados20(int dados){
        Random random = new Random();
        dados = random.nextInt(1, 21);
        // Dúvida: achamos que não funciona, pois 'void' significa que não vai retornar nada, mas ao tirar o void, o programa da erro
        // Objetivo: esse método deve ser chamado por outros locais do RPG para rodar um D20
    }
    public static void verificarAcerto(boolean dado){
        // aqui será necessário rolar um dado pra saber se o acerto vai ou não passar, mas para isso é necessário saber ataque e defesa dos personagens
        Sistema.rolarDados20(0);
        if (dado == true) {
            Sistema.calcularDano(0);
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
    public static void resultadoDungeon(boolean vitoria){
        if (m1.vida <= 0) {
            vitoria = true;
            Sistema.aumentarProfundidade(0);
        } else {
            vitoria = false;
        }
        // se vitoria acontecer, a profundidade aumenta. se vitoria é false, e esse método for chamado, então a dungeon será contabilizada como fail.
    }
    public static void aumentarProfundidade(int profundidade){
        profundidade++;
        // se esse método for chamado, a profudidade aumentará em +1
    }
}