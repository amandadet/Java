import java.util.Random;
public class Teste08 {

	public static void main (String[] agrs) {
		Random gerador = new Random();
		int num = gerador.nextInt();
		
		System.out.println("O n�mero gerado �: "+ num);
		if (num < 0) {
			System.out.println("O n�mero � negativo!");
		} else {
			System.out.println("O n�mero � positivo!");			
		}
	
		if (num%2==0) {
			System.out.println("ele � par");
		} else {
			System.out.println("ele � �mpar");
		}
		
	}
}
