package javaInicial;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nNumero 1: ");
		n1 = leia.nextFloat();
		System.out.println("\nNumero 2: ");
		n2 = leia.nextFloat();
		System.out.println("\nNumero 3: ");
		n3 = leia.nextFloat();
		System.out.println("\nNumero 4: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2 ) - (n3 * n4);
		System.out.println("\n Diferenca: "+diferenca);

	}

}
