package session3;
import java.util.Scanner;
public class Persona {
	private Scanner teclado;
	private String nombre;
	private int edad;	

	public void inicializar() {
		teclado=new Scanner(System.in);
		System.out.print("Ingrese nombre: ");
		nombre=teclado.next();
		System.out.print("Ingrese edad: ");
		edad=teclado.nextInt();
	}
	
	public void imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}
	
	public void esMayorEdad() {
		if (edad>=18 && edad<=65) {
			System.out.println(nombre+" es mayor de edad para actividad laboral.");
		} else if(edad>65){
			System.out.println(nombre+" Jubilado inactivo en vida laboral.");
		} else {
			System.out.println(nombre+" no es mayor de edad no puede entrar en actividad laboral.");
		}
	}
	
	public static void main(String[] args) {
		Persona persona1=new Persona();
		persona1.inicializar();
		persona1.imprimir();
		persona1.esMayorEdad();
	}

}
