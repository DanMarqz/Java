package introduccionJava;
import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n,x;
		System.out.print("Ingrese el valor final: ");
		n=teclado.nextInt();
		x=10;
		while (x>=n) {
			System.out.print(x);
			System.out.print(" ");
			x = x-1;
		}
	}

}
