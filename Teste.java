import java.io.*;

public class Teste{
	
	public static void main(String[] args) throws IOException {
	//como ler teclado
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Digite seu nome:");
	
	String meuNome;
	meuNome=in.readLine();
	System.out.println("Ola " + meuNome);
	
		
	}
};


