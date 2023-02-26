package proyectoGit;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double a, b;
		char res;

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el primer n�mero: ");
		a = teclado.nextDouble();

		System.out.print("Introduce el segundo n�mero: ");
		b = teclado.nextDouble();

		Operacion operacion = new Operacion(a, b);

		// control de errores

		do{
			pedirOperacion(teclado, operacion);
			
			System.out.println("�Quieres realizar otra operaci�n? (S/N)");
			res = teclado.next().charAt(0);
			res = Character.toUpperCase(res);
			
			while (res != 'S' && res != 'N') {
				System.out.println("Error. repsuesta no v�lida");
				System.out.println("�Quieres realizar una operaci�n? (S/N)");
				res = teclado.next().charAt(0);
				res = Character.toUpperCase(res);
			}
			
		}while (res == 'S');
		
	}

	private static void pedirOperacion(Scanner teclado, Operacion operacion) {

		int res;

		System.out.println("�Qu� operaci�n quieres realizar?");

		System.out.println("1.- Suma\n2.- Resta\n3.- Multiplicaci�n\n4.- Divisi�n");
		res = teclado.nextInt();

		double resultado = 0;

		switch (res) {
		case 1:
			resultado = operacion.suma();
			break;
		case 2:
			resultado = operacion.resta();
			break;
		case 3:
			resultado = operacion.mult();
			break;
		case 4:
			resultado = operacion.divi();
			break;
		case 5:
			resultado = operacion.potenciacion();
			break;
		case 6:
			resultado = operacion.raiz();
			break;
		}

		System.out.println("El resultado es: " + resultado);
	}

}
