/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_revisao_7;
import java.util.Scanner;
/**
 *
 * @author f.silva
 */
public class Exercicio_revisao_7 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        String[] codigosProdutos = {
            "P001", "P002", "P003", "P004", "P005"
        };
        
        
        System.out.print("Digite o código do produto que deseja verificar: ");
        String codigoProduto = scanner.nextLine();
        
        
        boolean encontrado = false;
        for (String codigo : codigosProdutos) {
            if (codigo.equalsIgnoreCase(codigoProduto)) {
                encontrado = true;
                break;
            }
        }
        
        
        if (encontrado) {
            System.out.println("Produto encontrado na lista.");
        } else {
            System.out.println("Produto não encontrado na lista.");
        }
        
        scanner.close();
    }
}
