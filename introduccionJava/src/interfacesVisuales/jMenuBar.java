package interfacesVisuales;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class jMenuBar extends JFrame implements ActionListener{
	private JMenuBar mb; //crea objeto clase menu bar
	private JMenu menu1; // crea atributo jmenu
	private JMenuItem mi1,mi2,mi3; //elementos a agregar
	public jMenuBar() {
		setLayout(null);
		
		mb = new JMenuBar();
		setJMenuBar(mb);
		menu1 = new JMenu("Options");
		mb.add(menu1);
		
		mi1=new JMenuItem("Rojo");
		mi1.addActionListener(this);
		menu1.add(mi1);
		
		mi2=new JMenuItem("Verde");
		mi2.addActionListener(this);
		menu1.add(mi2);
		
		mi3=new JMenuItem("Azul");
		mi3.addActionListener(this);
		menu1.add(mi3);	
	}
	
	public void actionPerformed(ActionEvent e) {
		Container f=this.getContentPane();
		if (e.getSource()==mi1) {
			f.setBackground(new Color(255,0,0));
			setTitle("Rojo");
		}
		if (e.getSource()==mi2) {
			f.setBackground(new Color(0,255,0));
			setTitle("Verde");
		}
		if (e.getSource()==mi3) {
			f.setBackground(new Color(0,0,255));
			setTitle("Azul");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jMenuBar color= new jMenuBar();
		color.setBounds(10,20,300,300);
		color.setVisible(true);
	}

}
