import java.io.*;


public class Teste07 {
	public static void main(String[] args) throws IOException{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Informe um número: ");
	String resposta = in.readLine();
	
	int x = Integer.parseInt(resposta);
	int r1,r2;
	boolean saoIguais = true;
	
	r1 = x%10;
	while (x>0) {
		r2 = x%10;
		if (r2!=r1) {
			saoIguais = false;
			break;
		} else {
			x = (int) Math.floorDiv(x, 10);
		}
	}
	
	if (saoIguais) {
		System.out.println("Todos os digitos do número são iguais " + resposta);		
	} else { System.out.println("Alguns digitos são diferentes" + resposta);
		
	}
	
	}
}
