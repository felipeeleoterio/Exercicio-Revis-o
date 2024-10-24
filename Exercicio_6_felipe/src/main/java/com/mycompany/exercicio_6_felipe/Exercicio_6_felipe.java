/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_6_felipe;
import java.util.Scanner;
/**
 *
 * @author f.silva
 */
public class Exercicio_6_felipe {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        
        System.out.printf("A média das notas é: %.2f%n", media);
        
        scanner.close();
    }
}
