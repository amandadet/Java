
public class Teste02 {
	public static void main(String[] args) {
	
		int bilhao;
		bilhao=100000000;
		System.out.println("CUIDADO AO CONCATENAR CONTE�DOS. O resultado pode ser inesperado!!");
		System.out.println("Um bilh�o = " + bilhao);
		
		// se somar bilhao + bilhao n�o funciona
		
		int doisBi;
		doisBi = bilhao*2;
		System.out.println("Dois bilh�es = " + doisBi);
		
		int tresBi;
		tresBi = doisBi+bilhao;
		System.out.println("Tr�s bilh�es = " + tresBi);	
	}
}
