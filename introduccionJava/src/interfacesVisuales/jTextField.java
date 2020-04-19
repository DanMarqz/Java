//permite al usuario ingresar una cadena de datos como utilScanner
package interfacesVisuales;
import javax.swing.*;
import java.awt.event.*;

public class jTextField extends JFrame implements ActionListener{
	private JTextField textfield1; //Permite al usuario ingresar datos
	private JLabel label1; //JLabel escribe en el cuadro de texto
	private JButton boton1; //Crea botones
	public jTextField() {
		setLayout(null);
		
		label1 = new JLabel("Usuario");
		label1.setBounds(10,10,100,30); 
		add(label1); 
		
		textfield1=new JTextField();
		textfield1.setBounds(90,10,100,20);
		add(textfield1);
		
		boton1= new JButton("Aceptar");
		boton1.setBounds(125,75,100,20); 
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {
			String cad=textfield1.getText(); //crea string y almacena lo introducido por el usuario, con getText obtenemos el valor de textfield1
			setTitle(cad); //visualizado en titulo
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jTextField texto=new jTextField();
		texto.setBounds(0,0,300,150);
		texto.setVisible(true);
	}

}
