package fundamentos;

import java.util.Scanner;

public class FahrenheitpCelsius {

	public static void main(String[] args) {
		
		

		Scanner temper = new Scanner(System.in);

		System.out.print(" Digite o temperatura em Celcius:   ºC");
		double tempc = temper.nextDouble();

		double tempf = tempc *1.8 +32;
		
		System.out.print(" temperatura em "+tempf+" ºF");
		
		
		temper.close();

	}

}
