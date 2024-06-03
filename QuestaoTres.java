import java.util.Scanner;

public class MainTres {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite um número: ");
	        int numero = scanner.nextInt();
	        
	        int fatorial = calcularFatorial(numero);
	 
	        System.out.println("O fatorial de " + numero + " é: " + fatorial);
	    }
	  
		    public static int calcularFatorial(int n) {
		        if (n < 0) {
		        	System.out.println("O número deve ser não negativo.");
		        }
		        
		        int resultado = 1;
		        for (int i = 1; i <= n; i++) {
		            resultado *= i;
		        }
		        
		        return resultado;
		    
	    }
	}
