package entities;

public class Calculos {

	public double numero1;
	public double numero2;

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

	public Double soma() {
		return numero1 + numero2;
	}

	public Double subtração() {
		return numero1 - numero2;
	}

	public Double multiplicação() {
		return numero1 * numero2;
	}

	public Double divisão() {
		if (numero2 == 0) {
			System.out.println("Error");
		}
		else if (numero1 == 0 && numero2 == 0) {
			System.out.println("Error");
		}
		return numero1 / numero2;
	}

}
