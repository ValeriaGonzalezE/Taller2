package TallerDos;

import java.util.Scanner;

public class PuntoUno {
	    public void calcularArea() {
		Scanner sc = new Scanner(System.in);

		System.out.println("digite la base: ");
		double base = sc.nextInt();
		
		System.out.println("digite la altura: ");
		double altura = sc.nextInt();
		
		double area = (double)(base * altura/2  );
		System.out.println("el area es: " + area);

	}
	
}

