package application;

import java.util.Scanner;

import entities.Calculos;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calculos cl = new Calculos();

		double numero1;
		double numero2;

		System.out.println("Bem vindo a Calculadora");
		System.out.println("Escolha a operação: ");
		System.out.println("(1)Soma");
		System.out.println("(2)Subtração");
		System.out.println("(3)Multiplicação");
		System.out.println("(4)Divisão");
		System.out.println("(5)Potenciação");
		System.out.println("(6)radiciação");

		int x = sc.nextInt();

		System.out.println("Digite o primeiro numero: ");
		numero1 = sc.nextDouble();

		switch (x) {

		case 1:

			System.out.println("Digite o segundo numero: ");
			numero2 = sc.nextDouble();
			System.out.println(numero1 + " + " + numero2 + " = " + cl.soma(numero1, numero2));

			break;
		case 2:
			
			System.out.println("Digite o segundo numero: ");
			numero2 = sc.nextDouble();
			System.out.println(numero1 + " - " + numero2 + " = " + cl.subtração(numero1, numero2));

			break;
		case 3:
			
			System.out.println("Digite o segundo numero: ");
			numero2 = sc.nextDouble();
			System.out.println(numero1 + " * " + numero2 + " = " + cl.multiplicação(numero1, numero2));
			
			break;
		case 4:
			
			System.out.println("Digite o segundo numero: ");
			numero2 = sc.nextDouble();
			System.out.println(numero1 + " / " + numero2 + " = " + cl.divisão(numero1, numero2));
			
			break;
		case 5:
			System.out.println("Digite o expoente: ");
			numero2 = sc.nextDouble();
			System.out.println(numero1 + " ^ " + numero2 + " = " + cl.potenciação(numero1, numero2));
			
			break;
		case 6:
			
			System.out.println("√" + numero1 + " = " + cl.radiciação(numero1));
			
			break;

		}

		sc.close();
	}

}
