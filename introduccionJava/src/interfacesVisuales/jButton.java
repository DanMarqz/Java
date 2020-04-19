package interfacesVisuales;
import javax.swing.*;
import java.awt.event.*;
//Botón para finalizar - cerrar ventana
public class jButton extends JFrame implements ActionListener{
	JButton boton1;
	public jButton() {
		setLayout(null);
		boton1= new JButton("Finalizar");
		boton1.setBounds(300,250,100,30); //coordenadas de la posición y tamaño del botón
		add(boton1); //lo agrega en JFrame
		boton1.addActionListener(this); //producir evento - Requiere metodo que va a ser ActionPerformed
	}	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) { //cuando se produzca el evento traido de boton1
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jButton botones = new jButton();
		botones.setBounds(0,0,450,350);
		botones.setVisible(true);		
	}

}
