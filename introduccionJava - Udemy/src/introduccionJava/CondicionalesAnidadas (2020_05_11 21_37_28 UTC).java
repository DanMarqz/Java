package introduccionJava;
import java.util.Scanner;
public class CondicionalesAnidadas {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int nota1,nota2,nota3;
		System.out.print("Introduzca la nota del primer lapso: ");
		nota1=teclado.nextInt();
		System.out.print("Introduzca la nota del segundo lapso: ");
		nota2=teclado.nextInt();
		System.out.print("Introduzca la nota del tercer lapso: ");
		nota3=teclado.nextInt();
		int media=(nota1+nota2+nota3)/3;
		
		if (media == 9 || media == 10) {
			System.out.print("Excelente");
		} else if (media == 5) {
			System.out.print("Suficiente");
		} else if (media == 6) {
			System.out.print("Bien");
		} else if (media == 7 || media == 8) {
			System.out.print("Sobresaliente");
		} else {
			System.out.print("Insuficiente");
		}
		
		/* if (media >= 7) {
			System.out.print("Sobresaliente");
		} else {
			if (media >=4) {
				System.out.print("Regular / Bien");
			} else {
				System.out.print("Regular / Bien");
			}
		} */
	}

}


