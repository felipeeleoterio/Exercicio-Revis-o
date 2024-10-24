/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_revisao_5;
import java.util.Scanner;
/**
 *
 * @author f.silva
 */
public class Exercicio_revisao_5 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número para iniciar a contagem regressiva: ");
        int numero = scanner.nextInt();
        
        System.out.println("Contagem regressiva:");
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                System.out.println("Erro na contagem: " + e.getMessage());
            }
        }
        
        System.out.println("Contagem finalizada!");
        scanner.close();
    }
}
