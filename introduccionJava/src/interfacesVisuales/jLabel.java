//crea una ventana que muestre el nombre de un programa en la parte superior y su numero de versión en la parte inferior.
//No permitir modificar el tamaño de ventana durante la ejecución
package interfacesVisuales;
import javax.swing.*;

public class jLabel extends JFrame{
	private	JLabel label1,label2,label3,label4,label5;
	public jLabel() {
		setLayout(null);
		label1 = new JLabel("SEND NUDES");
		label1.setBounds(10,20,300,30); //posición de la etiqueta
		add(label1); //para agregar a jFrame
		
		label3 = new JLabel("Carajita");
		label3.setBounds(95,40,300,30); //posición de la etiqueta
		add(label3); //para agregar a jFrame
		
		label4 = new JLabel("¿Me vas a dejar con ese huevo parao?, gafa.");
		label4.setBounds(10,60,400,30); //posición de la etiqueta
		add(label4); //para agregar a jFrame
		
		label2 = new JLabel("ATT:"); //posición de la etiqueta
		label2.setBounds(10, 100, 100, 30); //agregar a jFrame
		add(label2);
		
		label5 = new JLabel("Tu gafo sad."); //posición de la etiqueta
		label5.setBounds(30, 120, 100, 30); //agregar a jFrame
		add(label5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jLabel ventana = new jLabel();
		ventana.setBounds(0,0,400,200);
		ventana.setResizable(false); //Valor booleano para modificar el cuadro (resizable)
		ventana.setVisible(true); 
	}

}
