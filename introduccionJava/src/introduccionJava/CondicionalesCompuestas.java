package introduccionJava;
import java.util.Scanner;
public class CondicionalesCompuestas {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int valor1,valor2;
		System.out.print("Introducir un número comprendido entre 1 y 1000: ");
		valor1=teclado.nextInt();
		System.out.print("Introducir otro número comprendido entre 1 y 1000: ");
		valor2=teclado.nextInt();
		
		if(valor1>valor2) {
			System.out.println("El valor introducido en primer lugar es mayor");
			System.out.print(valor1);
		} else {
			System.out.println("El valor introducido en segundo lugar es mayor");
			System.out.print(valor2);
		}
	}

}
