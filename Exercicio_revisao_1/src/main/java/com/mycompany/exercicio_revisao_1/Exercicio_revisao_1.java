/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_revisao_1;

import java.util.Scanner;

/**
 *
 * @author f.silva
 */
public class Exercicio_revisao_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero:");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo numero:");
        int numero2 = scanner.nextInt();
        
        int soma = numero1 + numero2;
        
        System.out.println("A soma de " +numero1 +" e " + numero2 +" é: "+ soma);
        
        scanner.close();
    }
}
