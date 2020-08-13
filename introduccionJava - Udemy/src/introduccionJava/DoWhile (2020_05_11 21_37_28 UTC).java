package introduccionJava;
import java.util.Scanner;
public class DoWhile {
	
	public static void main(String[] args) { 
		Scanner teclado=new Scanner(System.in);
		int valor;
		do {
			System.out.print("Introduce un valor entre 0 y 999. (0 finaliza): ");
			valor = teclado.nextInt();
				if(valor>=100) {
					System.out.println("Contiene tres números.");
				}else if (valor>=10 & valor<=99) {
					System.out.println("Contiene dos número.");
				} else {
					System.out.println("Contiene un número.");
				}
		}while (valor!=0);
	}
}


