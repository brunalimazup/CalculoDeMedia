package com.br.ola.mundo;
import java.util.Scanner;

public class App {
	
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
     
	  System.out.println("Qual a capacidade máx de estoque?");
      int max = entrada.nextInt();
      System.out.println("Qual é a capacidade min de estoque?");
	  int min = entrada.nextInt();
	  
	  int média = (max + min) / entrada.nextInt() ;
	  System.out.println("Média de estoque é:" + média );
	  
	  
     }
}
