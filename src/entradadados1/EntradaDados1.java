/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadados1;

/**
 *
 * @author JONAS
 */

import java.util.Scanner;


public class EntradaDados1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Treinamento - Aula entrada de dados tipo string
        //Jonas valereo - Técnico em informática
        
        //Declarando a varivais tipo string
        
        String nome;
        String sobrenome;
        
        //Declarando o codigo Scanner entrada de dados
        
        Scanner entrada = new Scanner(System.in);
        
        
       //Declarando o codigo imprimir ,obs. next imprimir uma palavra no console
        
        System.out.println("Digite seu Nome: ");
        nome = entrada.next();
        
        System.out.println("Digite seu Sobrenome: ");
        sobrenome = entrada.next();
        
        //Declarando o codigo imprimir na tela no console
        
        System.out.println(nome);
        System.out.println(sobrenome);
        
        //Declarando a saida da aplicação e descarrega a memoria
        
        System.exit(0);
        
        //Fim do programa 
        
        
        
        
        
    }
    
}
