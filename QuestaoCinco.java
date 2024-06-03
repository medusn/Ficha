import java.util.Scanner;

public class MainCinco {

	public static void main(String[] args){
		Scanner ref = new Scanner(System.in);
	
	System.out.println("Digite um ano: ");
		int ano = ref.nextInt();
		
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println(ano + " é um ano bissexto.");
	    }
		
		else {
			System.out.println(ano + " não é um ano bissexto.");
	    }
	}
}
