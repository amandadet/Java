import java.util.Random;
public class Teste08 {

	public static void main (String[] agrs) {
		Random gerador = new Random();
		int num = gerador.nextInt();
		
		System.out.println("O número gerado é: "+ num);
		if (num < 0) {
			System.out.println("O número é negativo!");
		} else {
			System.out.println("O número é positivo!");			
		}
	
		if (num%2==0) {
			System.out.println("ele é par");
		} else {
			System.out.println("ele é ímpar");
		}
		
	}
}
