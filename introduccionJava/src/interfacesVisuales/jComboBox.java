package interfacesVisuales;
import javax.swing.*;
import java.awt.event.*;
public class jComboBox extends JFrame implements ItemListener{
	private JComboBox combo1;
	public jComboBox() {
		setLayout(null);
		combo1=new JComboBox();
		combo1.setBounds(10,10,80,20);
		add(combo1);
		combo1.addItem("Rojo");
		combo1.addItem("Amarillo");
		combo1.addItem("Verde");
		combo1.addItem("Azul");
		combo1.addItem("Negro");
		combo1.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource()==combo1) {
			String seleccionado=(String)combo1.getSelectedItem();
			setTitle(seleccionado);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jComboBox bombo = new jComboBox();
		bombo.setBounds(0,0,200,150);
		bombo.setVisible(true);
	}

}
