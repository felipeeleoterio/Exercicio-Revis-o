/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_revisao_3;

import java.util.Scanner;
/**
 *
 * @author f.silva
 */
public class Exercicio_revisao_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a pontuação do Jogador 1: ");
        int pontuacaoJogador1 = scanner.nextInt();

       
        System.out.print("Digite a pontuação do Jogador 2: ");
        int pontuacaoJogador2 = scanner.nextInt();

        
        if (pontuacaoJogador1 > pontuacaoJogador2) {
            System.out.println("O Jogador 1 venceu!");
        } else if (pontuacaoJogador1 < pontuacaoJogador2) {
            System.out.println("O Jogador 2 venceu!");
        } else {
            System.out.println("Empate!");
        }

        scanner.close();
    }
}
