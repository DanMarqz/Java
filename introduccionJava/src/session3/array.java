package session3;
import java.util.Scanner;
public class array {
	private Scanner teclado;
	private int[] sueldo; // lo definimos como un atributo de clase ya que se va a utilizar en los dos métodos
	
	public void cargar() {
		teclado = new Scanner(System.in);
		sueldo = new int[5]; // creamos el array en java los arrays son objetos por eso se utiliza el operador new
		for(int f=0;f<sueldo.length;f++) { // para almacenar todos los componentes necesitamos un bucle
			System.out.print("Introducir sueldo: ");
			sueldo[f]= teclado.nextInt();
		} 
	}
	
	public void imprimir() {
		for(int f=0;f<sueldo.length;f++) {
			System.out.println(sueldo[f]);
		}
	}
	
	public static void main(String[] args) {
		array usuario = new array();
		usuario.cargar();
		usuario.imprimir();
	}

}
