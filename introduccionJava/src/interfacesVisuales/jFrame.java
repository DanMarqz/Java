package interfacesVisuales;
import javax.swing.*;
//para crear la ventana
public class jFrame extends JFrame{
	public jFrame() {
		setLayout(null);//ubicaremos los controles visuales con coordenadas absolutas
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			jFrame formulario1 =new jFrame();
			formulario1.setBounds(10,20,400,300); //(columna 10, filas 20, ancho 400, alto 300)
			formulario1.setVisible(true); //SetVisible es para que sea visible la ventana (booleano true-false)
	}

}
