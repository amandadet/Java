import java.util.Random;
public class Teste10 {
	public static void main(String[] args) {
		Random random = new Random();
		float a = random.nextFloat();
		float b = random.nextFloat();
		float c = random.nextFloat();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		if (a<b && b<c) {
			System.out.print("a<b<c");
						}
		if (a<c && c<b) {
			System.out.print("a<c<b");
						}
		if (b<a && a<c) {
			System.out.print("b<a<c");
						}
		if (b<c && c<a) {
			System.out.print("b<c<a");
						}
		if (c<a && a<b) {
			System.out.print("c<a<b");
						}
		if (c<b && b<a) {
			System.out.print("c<b<a");
						}
	}
}
