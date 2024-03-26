package entities;

import exceptions.DomainExceptions;

public class Calculos {

	public double numero1;
	public double numero2;

	public Calculos() {

	}

	public Calculos(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public Double soma(double numero1, double numero2) {
		return numero1 + numero2;
	}

	public Double subtração(double numero1, double numero2) {
		return numero1 - numero2;
	}

	public Double multiplicação(double numero1, double numero2) {
		return numero1 * numero2;
	}

	public Double divisão(double numero1, double numero2) {

		if (numero2 == 0) {
			throw new DomainExceptions("Impossível dividir por zero");
		} 
		else {
			return numero1 / numero2;
		}

	}

	public Double potenciação(double numero1, double numero2) {
		return Math.pow(numero1, numero2);
	}

	public Double radiciação(double numero1) {
		return Math.sqrt(numero1);
	}

}
