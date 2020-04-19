package interfacesVisuales;
import javax.swing.*;
//la primera clase de interfaces visuales
public class interfaceV extends JFrame{
	private JLabel label1;
	public interfaceV() {
		setLayout(null);
		label1=new JLabel("Hola Mundo");
		label1.setBounds(15,30,250,30);
		add(label1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceV Formulario=new interfaceV();
		Formulario.setBounds(15,30,400,300);
		Formulario.setVisible(true);
	}

}
