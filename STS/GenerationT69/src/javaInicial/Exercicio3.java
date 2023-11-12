package javaInicial;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		float salarioBruto, adicionalNoturno, horaExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner (System.in);

		System.out.println("\nDigite o salarioBruto:");
		salarioBruto = leia.nextFloat();
		System.out.println("\nDigite o Adicional Noturno:");
		adicionalNoturno = leia.nextFloat();
		System.out.println("\nDigite as Horas Extras:");
		horaExtras = leia.nextFloat();
		System.out.println("\nDigite o Desconto:");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horaExtras * 5 ) - descontos;
		System.out.println("\nSalario Liquido é: "+salarioLiquido);

	}

}
