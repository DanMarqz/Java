package interfacesVisuales;
import javax.swing.*;
import java.awt.event.*;

public class jButton1 extends JFrame implements ActionListener{
	private JButton boton1,boton2,boton3;
	public jButton1() {
		setLayout(null);
		
		boton1= new JButton("1");
		boton1.setBounds(10,100,90,30); 
		add(boton1);
		boton1.addActionListener(this);
		
		boton2= new JButton("2");
		boton2.setBounds(110,100,90,30); 
		add(boton2);
		boton2.addActionListener(this);
		
		boton3= new JButton("3");
		boton3.setBounds(210,100,90,30); 
		add(boton3);
		boton3.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {
			setTitle("Botón 1");
		}
		if (e.getSource()==boton2) {
			setTitle("Botón 2");
		}
		if (e.getSource()==boton3) {
			setTitle("Botón 3");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jButton1 botones = new jButton1();
		botones.setBounds(0,0,350,200);
		botones.setVisible(true);
	}

}
