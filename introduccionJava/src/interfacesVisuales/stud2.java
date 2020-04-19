package interfacesVisuales;

public class stud2 {
	final void show() {
		System.out.println("Class - stud : method defined");
	}
}
class books extends stud{
	void show() {
		System.out.println("Class - books : method defined");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		books b2 = new books();
		b2.show();
	}

}
