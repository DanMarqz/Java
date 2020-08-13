package session3;
import java.util.Scanner;
public class Proceso {
	public void introducir() {
		Scanner dato=new Scanner(System.in);
		int numero;
		do {
			System.out.print("Introducir número: ");
			numero=dato.nextInt();
			if (numero!=-1) {
				producir(numero);
			}
		} while (numero!=-1);
	}
	
	public void producir(int n) {
		for (int x=n;x<=n*10;x=x+n) {
			System.out.println(x+" ");
		}
	}
	
	public static void main(String[] args) {
		Proceso tabla;
		tabla=new Proceso();
		tabla.introducir();
	}

}
