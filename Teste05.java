
public class Teste05 {
	public static void main (String[] args) {
	
		String mensagem = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println("A palavra utilizada �: " + mensagem);
		System.out.println("A palavra em letras minusculas: " + mensagem.toLowerCase());
		System.out.println("O tamanho da palavra � de: " + mensagem.length());
		System.out.println("O caractere na posi��o o �: " + mensagem.charAt(0));
		System.out.println("O caractere na posi��o 3 �: " + mensagem.charAt(3));
		
		int tamanho;
		tamanho = mensagem.length();
		
		String parte1, parte2;
		parte1 =  mensagem.substring(0,tamanho/2);
		parte2 =  mensagem.substring(tamanho/2,tamanho);
		
		System.out.println("A mensagem foi dividida em duas partes: ");
		System.out.print("Parte1: " + parte1);
		System.out.print(" // Parte2: " + parte2);
		
		
	}
}
