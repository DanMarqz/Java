package introduccionJava;
import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in); //Variable teclado se define para introducir valor del teclado
		String texto;					// Indica que la variable texto serà un String
		float division;		//float para almacenar nùmeros con decimal flotante
		int num1,num2,suma,producto;	//int para almacenar numeros entero
		texto= "Ingrese dos valores:";		//se define el valor de la variable texto
		
		System.out.println(texto);
		num1=teclado.nextInt();
		num2=teclado.nextInt();
		
		suma=num1+num2;
		producto=num1*num2;
		division=num1/num2;
		
		System.out.print("La suma de los dos nùmeros es: "); //sin salto de linea
		System.out.println(suma);  //con salto de linea
		System.out.print("La multiplicaciòn de los dos nùmeros es: ");
		System.out.println(producto);
		System.out.print("La divisiòn de ambos nùmeros es: ");
		System.out.println(division);
	}

}
