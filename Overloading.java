package Methods;

public class Overloading {

	static int add(int x, int y) {
		System.out.println("1. Method");
		return x + y;
	}
	
	
	static double add(int x, int y, double z) {
		System.out.println("2. Method");
		return x + y + z;
	}
	
	
	public static void main(String[] args) {
		System.out.println(add(2,3));
		System.out.println(add(5,6));

	}

}
