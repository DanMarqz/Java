package interfacesVisuales;
import javax.swing.*;
import javax.swing.event.*;

public class jCheckBox extends JFrame implements ChangeListener{ //Change listener captura los cambios del checkbox
	private JCheckBox check1,check2,check3;
	public jCheckBox() {
		setLayout(null);
		
		check1=new JCheckBox("Inglés");
		check1.setBounds(10,10,150,30);
		check1.addChangeListener(this);
		add(check1);
		
		check2=new JCheckBox("Frances");
		check2.setBounds(10,50,150,30);
		check2.addChangeListener(this);
		add(check2);
		
		check3=new JCheckBox("Alemán");
		check3.setBounds(10,90,150,30);
		check3.addChangeListener(this);
		add(check3);
	}
	
	public void stateChanged(ChangeEvent e) {
		String cad="";
		if(check1.isSelected()==true){
		cad=cad +" Inglés";
		}
		if(check2.isSelected()==true){
		cad=cad +" Francés";
		}
		if(check3.isSelected()==true){
		cad=cad +" Alemán";
		}
		setTitle(cad);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jCheckBox caja = new jCheckBox();
		caja.setBounds(0,0,300,300);
		caja.setVisible(true);
	}

}
