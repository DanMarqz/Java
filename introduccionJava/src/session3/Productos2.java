package session3;
import java.util.Scanner;
public class Productos2 {
        private Scanner teclado=new Scanner(System.in);
        private String cad1;
        private String cad2;
    
    public Productos2()
    {
        System.out.print("Ingrese la primer cadena:");
        cad1=teclado.nextLine();
        System.out.print("Ingrese la segunda cadena:");
        cad2=teclado.nextLine();
    }
    
    public void visualizar() {
         if (cad1.equals(cad2)==true) { //para comparar 2 cadenas string
            System.out.println(cad1+" es exactamente igual a "+cad2);
        } else {
            System.out.println(cad1+" no es exactamente igual a "+cad2);        
        }
        if (cad1.equalsIgnoreCase(cad2)==true) { //igual que equals solo que no distingue de mayúsculas/minúsculas
            System.out.println(cad1+" es igual a "+cad2+" sin tener en cuenta mayúsculas/minúsculas");
        } else {
            System.out.println(cad1+" no es igual a "+cad2+" sin tener en cuenta mayúsculas/minúsculas");        
        }
        if (cad1.compareTo(cad2)==0) { //pregunta si la cadena de caracteres es exactamente igual
            System.out.println(cad1+" es exactamente igual a "+cad2);
        } else {
            if (cad1.compareTo(cad2)>0) {
                System.out.println(cad1+ " es mayor alfabéticamente que "+cad2);
            } else {
                System.out.println(cad2+ " es mayor alfabéticamente que "+cad1);            
            }
        }        
        char carac1=cad1.charAt(0);//devuelve un caracter 
        System.out.println("El primer caracter de "+cad1+" es "+carac1);
        int largo=cad1.length();//retorna la cantidad de caracteres
        System.out.println("El largo del String "+cad1+" es "+largo);
        String cad3=cad1.substring(0,3);//vamos a tener un trozo del string (0) donde empieza (3) cantidad de caracteres
        System.out.println("Los primeros tres caracteres de "+cad1+" son "+cad3);
        int posi=cad1.indexOf(cad2); 
        if (posi==-1) {
            System.out.println(cad2+" no está contenido en "+cad1);
        } else {
            System.out.println(cad2+" está contenido en "+cad1+" a partir de la posición "+posi);
        }
        System.out.println(cad1+ " convertido a mayúsculas es "+cad1.toUpperCase()); //retorna en mayúscula
        System.out.println(cad1+ " convertido a minúsculas es "+cad1.toLowerCase());        //retorna en minúscula
    }
       
    
    public static void main(String[] ar) {
        Productos2 op=new Productos2();
        op.visualizar();
    }
}


