package introduccionJava;
import java.util.Scanner;
public class buclefor {

	public static void main(String[] args) { 
		Scanner teclado=new Scanner(System.in);
			int suma,f,valor,promedio;
			suma=0;
			for (f=1;f<=10;f++) {
				System.out.print("Ingresar un valor: ");
				valor=teclado.nextInt();
				suma=suma+valor;
			}
			System.out.println("La suma es: ");
			System.out.print(suma);
	}

}
