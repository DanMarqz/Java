package session3;
import java.util.Scanner;
import java.util.Arrays;


public class arrayordenada {
	private Scanner teclado;
	private int[] sueldo;
	public void cargar() {
		teclado=new Scanner(System.in);
		sueldo=new int[5];
		for(int f=0;f<sueldo.length;f++) { 
			System.out.print("Introducir sueldo: ");
			sueldo[f]= teclado.nextInt();
	}
}
	public void ordenar() {
		Arrays.sort(sueldo); //utiliza el método sort
	}
	public void imprimir() {
		for(int f=0;f<sueldo.length;f++) {
			System.out.println(sueldo[f]);
		}
	}	
	public static void main(String[] args) {
		arrayordenada usuario = new arrayordenada();
		usuario.cargar();
		usuario.ordenar();
		usuario.imprimir();
	}

}
