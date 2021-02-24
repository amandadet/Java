import java.util.Random;
public class Teste09 {
	public static void main(String[] args) {
		Random random = new Random();
		float a = random.nextFloat();
		float b = random.nextFloat();
		float c = random.nextFloat();
		
		System.out.println("Os numeros gerados são: " +a+b+c);
		if (a < b) {
			if (b < c) {
				System.out.println("a<b<c");
			} else {
				if (a<c)
				{
					System.out.println("a<c<b");
				}else {
					
				}
				
			}
		}else {
			if (a<c) {
				System.out.println("b<a<c");
			}else {
				if (b<c) {
				System.out.println("b<c<a");
				}  else {
				System.out.println("c<b<a");
			}
			
		}
		
	}
	}}
