package interfacesVisuales;

public class Super {
	int wt = 8;
}
	class clerk extends Super{
		int wt = 10;
	void display() {
		System.out.println(super.wt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clerk c = new clerk();
		c.display();
	}
}
