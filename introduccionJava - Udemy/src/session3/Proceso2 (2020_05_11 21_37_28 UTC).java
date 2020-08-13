package session3;
import java.util.Scanner;
public class Proceso2 {
	public void introducirPorTeclado() {
		Scanner input=new Scanner(System.in);
		System.out.print("Introduce valor 1: ");
		int numero1=input.nextInt();
		System.out.print("Introduce valor 2: ");
		int numero2=input.nextInt();
		System.out.print("Introduce valor 3: ");
		int numero3=input.nextInt();
		int superior, inferior;
		superior=algoritmoSuperior(numero1,numero2,numero3);
		inferior=algoritmoInferior(numero1,numero2,numero3);
		System.out.println("El numero mayor es: "+superior);
		System.out.println("El numero menor es: "+inferior);
	}
	public int algoritmoSuperior(int num1, int num2, int num3) {
		int sup;
		if (num1>num2 && num1>num3) {
			sup=num1;
		} else {
			if(num2>num3) {
				sup=num2;
			} else {
				sup=num3;
			}
		}
		return sup;
	}
	
	public int algoritmoInferior(int num1, int num2, int num3) {
		int inf;
		if (num1<num2 && num1<num3) {
			inf=num1;
		} else {
			if(num2<num3) {
				inf=num2;
			} else {
				inf=num3;
			}
		}
		return inf;
	}

	public static void main(String[] args) {
		Proceso2 resultado = new Proceso2();
		resultado.introducirPorTeclado();
	}
}