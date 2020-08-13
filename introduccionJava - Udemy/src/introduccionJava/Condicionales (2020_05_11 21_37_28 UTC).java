package introduccionJava;
import java.util.Scanner;
public class Condicionales {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		float sueldo;
		System.out.print("Introducir el sueldo: ");
		sueldo=teclado.nextFloat();
		if(sueldo>3000) {
			System.out.println("La persona debe realizar el impuesto sobre la renta.");
		}
		if(sueldo<=3000) {
			System.out.println("La persona está excenta de declarar el impuesto sobre la renta.");
		}
		if(sueldo>6000 && sueldo<10000) {
			System.out.println("La persona debe pagar una bonificación de 1000.");
		}
		if(sueldo==20000 || sueldo==30000) {
			System.out.println("La persona debe pagar un 10% de su sueldo.");
		}
	}
}
