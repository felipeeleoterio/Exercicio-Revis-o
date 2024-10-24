/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_revisao_2;

import java.util.Scanner;

/**
 *
 * @author f.silva
 */
public class Exercicio_revisao_2 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de itens em estoque: ");
        int quantidade = scanner.nextInt();
        
        if (quantidade % 2 == 0) {
            System.out.println("A quantidade de itens em estoque é par.");
        } else {
            System.out.println("A quantidade de itens em estoque é ímpar.");
        }

        scanner.close();
    }
}


    
