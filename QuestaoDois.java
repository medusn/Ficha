import java.util.Scanner;

public class MainDois {
  
  public static void main(String[] args){
	  Scanner ref = new Scanner(System.in);

	  System.out.println("Digite um número: ");
	  	int num = ref.nextInt();
  
	  	if(num % 2 == 0)
	  System.out.println("É par !");
	  	else
	  System.out.println("É impar!");
  }
}
