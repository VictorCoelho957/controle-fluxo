package Program;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();
		
		sc.close();
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (Exception e)  {
			e.getMessage();
			

		}
			
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		for(int i=0; i<contagem; i++) {
			System.out.println("imprimindo o número"+i);
		}
	
			
		}
	

	
	
		
}