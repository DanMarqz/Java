package dato; //los paquetes on las forma en la que java permite agrupar de manera lógica los componentes de una aplicación que estén relacionadas entre sí
//import libreria.Usuario;
import dato.Usuario;
public class Entidad {
  private Usuario usuario1,usuario2,usuario3;
  
  public Entidad() {
      usuario1=new Usuario("Javier Perez Aguirre");
      usuario2=new Usuario("Nadia Blanco Loeches");
      usuario3=new Usuario("Carlos Blanco Gómez"); 
  }

  public void manipular() {
      usuario1.ingresar (2167);
      usuario2.ingresar (34876);
      usuario3.ingresar (12534);
      usuario3.reintegro (546);
  }
  
  public void fondos ()
  {
      int t = usuario1.retornoDeCantidad () + usuario2.retornoDeCantidad () + usuario3.retornoDeCantidad ();
      System.out.println ("TOTAL DE EFECTIVO INGREGADO EN LA ENTIDAD ES:" + t);
      usuario1.visualizar();
      usuario2.visualizar();
      usuario3.visualizar();
  }

  public static void main(String[] args) {
      Entidad sucursal=new Entidad();
      sucursal.manipular();
      sucursal.fondos();
  }
}