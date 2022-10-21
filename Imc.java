package fundamentos;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {

		Scanner enter = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		String peso = enter.nextLine().replace(",", ".");
		
		System.out.print("Digite sua altura: ");
		String altura = enter.nextLine().replace(",", ".");

		Double peso1 = Double.parseDouble(peso);
		Double altura2 = Double.parseDouble(altura);

		double imc = peso1 / (altura2 * altura2);

		System.out.printf(" Seu IMC é %.1f", imc);

		enter.close();
	}

}
