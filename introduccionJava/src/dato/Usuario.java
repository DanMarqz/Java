package dato; //los paquetes on las forma en la que java permite agrupar de manera lógica los componentes de una aplicación que estén relacionadas entre sí
//import libreria.Entidad;
import dato.Entidad;
public class Usuario {
  private String nombreCliente;
  private int cantidad;
  
  public Usuario(String nom) {
      nombreCliente=nom;
      cantidad=0;
  }
  
  public void ingresar(int m) {
      cantidad=cantidad+m;
  }
  
  public void reintegro(int m) {
      cantidad=cantidad-m;
  }
  
  public int retornoDeCantidad() {
      return cantidad;
  }
  
  public void visualizar() {
      System.out.println(nombreCliente+" INGRESADO EN CUENTA: "+cantidad);
  }
}