
public class Teste03 {
	public static void main(String[] args) {
	//programa para extrair digitos de um número
		
	// declara a variável inteira
	int num = 5;
	
	//mostra o número
	System.out.println("num = " + num);
	System.out.print("Os digitos de num são: ");
	
	System.out.print(num/1000);
	num = num%1000;
	
	System.out.print(", " + num/100);
	num = num%100;
	
	System.out.print(", " + num/10);
	num = num%10;
	
	System.out.print(", e " + num);
	
	// testar para 5 e para 532
	
	}
}