
package contador.dio;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
            
            
		Scanner terminal = new Scanner(System.in);
                
                boolean parametrosValidos = false; // Flag para indicar se os parâmetros são válidos
        
                while (!parametrosValidos) {
                    
                
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = Integer.parseInt(terminal.next());
                
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = Integer.parseInt(terminal.next());
		
		try {
			//chamando o método contendo a lógica de contagem
		                
                    contar(parametroUm, parametroDois);
                        
                    parametrosValidos = true;
		
		}catch (ParametrosInvalidosException e) {
                    System.out.println(e.getMessage());                    
                    System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
            }
		
	}
        
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
                if(parametroDois<parametroUm)
                throw new ParametrosInvalidosException();
                
                    int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
		//realizar o for para imprimir os números com base na variável contagem
	}
    }
