
public class Teste03 {
	public static void main(String[] args) {
	//programa para extrair digitos de um n�mero
		
	// declara a vari�vel inteira
	int num = 5;
	
	//mostra o n�mero
	System.out.println("num = " + num);
	System.out.print("Os digitos de num s�o: ");
	
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