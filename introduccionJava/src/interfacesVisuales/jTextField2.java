//permite al usuario ingresar una cadena de datos como utilScanner e interactuar entre ellos
package interfacesVisuales;
import javax.swing.*;
import java.awt.event.*;

public class jTextField2 extends JFrame implements ActionListener{
	private JTextField textfield1,textfield2;
	private JButton boton1;
	public jTextField2() {
		setLayout(null);
		
		textfield1=new JTextField();
		textfield1.setBounds(10,10,100,20);
		add(textfield1);
		
		textfield2=new JTextField();
		textfield2.setBounds(10,50,100,20);
		add(textfield2);
		
		boton1= new JButton("Sumar");
		boton1.setBounds(10,90,100,30); 
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) { //se se presiona el botón 1
			String cad1=textfield1.getText(); //establece la variable String en cad1 que es el valor de textfield1 (lo incluido en el primer cuadro de texto)
			String cad2=textfield2.getText(); //lo mismo de arriba
			int x1=Integer.parseInt(cad1); //transforma el String de la cadena de texto en enteros
			int x2=Integer.parseInt(cad2); //lo mismo de arriba
			int suma=x1+x2; //crea una variable entero que suma x1 y x2
			String total=String.valueOf(suma); //Crea un String de la variable entero que es el resultado de la suma
			setTitle(total); //establece el resultado como título del dialogo
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jTextField2 texto=new jTextField2();
		texto.setBounds(0,0,200,200);
		texto.setVisible(true);
	}

}
