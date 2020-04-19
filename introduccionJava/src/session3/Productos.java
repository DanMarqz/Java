package session3;
import java.util.Scanner;
public class Productos { //constructor de clase
    private Scanner s; //atributo scanner
    private String[] producto; //atributo array de tipo string
    
    public Productos() //method constructor 
    {
        s=new Scanner(System.in); //crea objeto scanner
        producto=new String[5]; //crea objeto array 
        for(int f=0;f<5;f++) { 
            System.out.print("Introduce nombre del producto:");
            producto[f]=s.next();//almacena valores en array
        }   
    }
    
    public void visualizar() {//visualiza todos los elementos que hayan en array
        for(int f=0;f<5;f++) {
            System.out.println(producto[f]);
        }
    }
    
    public static void main(String[] ar) {
        Productos op=new Productos(); //crea objeto de clase	
        op.visualizar(); //llama method visualizar
    }
}