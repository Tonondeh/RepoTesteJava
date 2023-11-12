package javaInicial;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner (System.in);

		System.out.println("\nDigite o salario:");
		salario = leia.nextFloat();
		System.out.println("\nDigite o Abono:");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		System.out.println("\nNovo salario é: "+novoSalario);
		
	}

}
