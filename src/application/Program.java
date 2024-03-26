package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Calculos;
import exceptions.DomainExceptions;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Calculos cl = new Calculos();

		double numero1;
		double numero2;

		try {

			System.out.println("Bem vindo a Calculadora");
			System.out.println();
			System.out.println("Escolha a operação: ");
			System.out.println("(1)Soma");
			System.out.println("(2)Subtração");
			System.out.println("(3)Multiplicação");
			System.out.println("(4)Divisão");
			System.out.println("(5)Potenciação");
			System.out.println("(6)radiciação");
			System.out.println("(7)sair");

			int x = sc.nextInt();

			while (x != 7) {

				switch (x) {

				case 1:

					System.out.println("Digite o primeiro numero: ");
					numero1 = sc.nextDouble();
					System.out.println("Digite o segundo numero: ");
					numero2 = sc.nextDouble();
					System.out.println(numero1 + " + " + numero2 + " = " + String.format("%.2f", cl.soma(numero1, numero2)));

					break;
				case 2:

					System.out.println("Digite o primeiro numero: ");
					numero1 = sc.nextDouble();
					System.out.println("Digite o segundo numero: ");
					numero2 = sc.nextDouble();
					System.out.println(numero1 + " - " + numero2 + " = " + String.format("%.2f", cl.subtração(numero1, numero2)));

					break;
				case 3:

					System.out.println("Digite o primeiro numero: ");
					numero1 = sc.nextDouble();
					System.out.println("Digite o segundo numero: ");
					numero2 = sc.nextDouble();
					System.out.println(numero1 + " * " + numero2 + " = " + String.format("%.2f", cl.multiplicação(numero1, numero2)));

					break;
				case 4:

					System.out.println("Digite o primeiro numero: ");
					numero1 = sc.nextDouble();
					System.out.println("Digite o segundo numero: ");
					numero2 = sc.nextDouble();
					System.out.println(numero1 + " / " + numero2 + " = " + String.format("%.2f", cl.divisão(numero1, numero2)));

					break;
				case 5:

					System.out.println("Digite a base: ");
					numero1 = sc.nextDouble();
					System.out.println("Digite o expoente: ");
					numero2 = sc.nextDouble();
					System.out.println(numero1 + " ^ " + numero2 + " = " + String.format("%.2f", cl.potenciação(numero1, numero2)));

					break;
				case 6:

					System.out.println("Digite o numero: ");
					numero1 = sc.nextDouble();
					System.out.println("√" + numero1 + " = " + String.format("%.2f", cl.radiciação(numero1)));

					break;
				}
				
				System.out.println();
				System.out.println("Escolha a operação: : ");
				System.out.println("(1)Soma");
				System.out.println("(2)Subtração");
				System.out.println("(3)Multiplicação");
				System.out.println("(4)Divisão");
				System.out.println("(5)Potenciação");
				System.out.println("(6)radiciação");
				System.out.println("(7)sair");
				x = sc.nextInt();
			}

			System.out.println("Até a próxima");

		}

		catch (DomainExceptions e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Por favor digite um numero ");
		}

		sc.close();
	}

}
