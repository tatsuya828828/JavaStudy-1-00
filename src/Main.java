
public class Main {
	static int x = 5;
	public static double circle(int a) {
		double c = a*a*3.14;
		return c;
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("半径"+ x +"cmの円の面積は"+ circle(x)+ "㎠");
	}
}
