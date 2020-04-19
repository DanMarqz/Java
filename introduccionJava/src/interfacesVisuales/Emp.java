package interfacesVisuales;

public class Emp {
	int e_id;
	String name;
	Emp (int e_id, String name){
		this.e_id = e_id;
		this.name =name;
	}
	void show () {
		System.out.println(e_id + " " + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1= new Emp(1006, "Karlos");
		Emp e2 = new Emp(1008, "Ray");
		e1.show();
		e2.show()	;
	}

}
