package interfacesVisuales;

public class statik {
	static int x = 60;
	static void fun() {
		System.out.println("Within Static");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		statik.fun();
		System.out.println(statik.x);
		statik s1 = new statik();
		statik s2 = new statik();
		System.out.println(s1.x);
		s1.fun();
	}

}
