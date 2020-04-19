package session3;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class arrayDesc {
	private Scanner teclado;
	private Integer[] sueldo; //para hacerlo descendente hay que colocar que el tipo de array es Integer
	public void cargar() { //Creamos una función cargar
		teclado=new Scanner(System.in); //Introducir datos en cosnola
		sueldo=new Integer[5]; //crea un array con 5 var
		for(int f=0;f<sueldo.length;f++) {  //asignamos 0 al iterador f, cuando f menor que la longitud de sueldo, f++
			System.out.print("Introducir sueldo: "); //El mensaje que da consola es: Introduce sueldo
			sueldo[f]= teclado.nextInt(); //transforma los valores de F en un array
	}
}
	public void ordenar() { //función ordenar que ordena el array
		Arrays.sort(sueldo, Collections.reverseOrder()); //utiliza el método sort 
	}
	public void imprimir() {
		for(int f=0;f<sueldo.length;f++) {
			System.out.println(sueldo[f]);
		}
	}
	public static void main(String[] args) {
		arrayDesc usuario = new arrayDesc();
		usuario.cargar();
		usuario.ordenar();
		usuario.imprimir();
	}

}
