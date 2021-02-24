import java.io.*;
public class Teste04 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));		
		System.out.println("Entre com a temperatura em Fahrenheit: ");
		String resposta = in.readLine();		
		int fahrenheit = new Integer(resposta).intValue();		
		System.out.println(fahrenheit + " Graus em Fahrenheit");		
		int celcius = 5*(fahrenheit-32)/9;
		System.out.println(celcius + " Graus em Celcius!");		
	}
}
