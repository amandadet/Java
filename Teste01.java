import java.io.*;
public class Teste01 {	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite sua idade: ");
		
		// le do teclado e armazena em resposta
		String resposta = in.readLine();
		
		// transforma a string recebida em um inteiro
		int idade = Integer.parseInt(resposta);
		System.out.println("Você tem: "+idade+" anos agora");
		
		int ano;
		// calcula idade
		ano=2019-idade;
		System.out.println("Você deve ter nascido no ano: " + ano);		
	}	
}