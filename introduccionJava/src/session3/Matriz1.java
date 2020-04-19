package session3;
import java.util.Scanner;

public class Matriz1 {
	private Scanner teclado;
	private int[][] mat;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		mat=new int[3][5]; //array bidimensional [fila][columna]
		for (int f=0;f<3;f++) { // establecido para filas
			for (int c=0;c<5;c++) { //establecido para columnas
				System.out.print("Ingrese componente: "); //para introducir elementos en el array se requieren los for
				mat[f][c]=teclado.nextInt(); //aquí se almacenan
			}
		}
	}

	public void imprimir() {
		for (int f=0;f<3;f++) {
			for (int c=0;c<5;c++) {
				System.out.print(mat[f][c]+" ");
			}
				System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matriz1 mat = new Matriz1();
		mat.cargar();
		mat.imprimir();
		
	}

}

// resultado:
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5