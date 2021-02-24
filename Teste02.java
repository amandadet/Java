
public class Teste02 {
	public static void main(String[] args) {
	
		int bilhao;
		bilhao=100000000;
		System.out.println("CUIDADO AO CONCATENAR CONTEÚDOS. O resultado pode ser inesperado!!");
		System.out.println("Um bilhão = " + bilhao);
		
		// se somar bilhao + bilhao não funciona
		
		int doisBi;
		doisBi = bilhao*2;
		System.out.println("Dois bilhões = " + doisBi);
		
		int tresBi;
		tresBi = doisBi+bilhao;
		System.out.println("Três bilhões = " + tresBi);	
	}
}
