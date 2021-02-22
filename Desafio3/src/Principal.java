import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	

		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite um número: ");
	double numero = input.nextDouble();
	
	if((numero % 3) == 0 && (numero % 7) == 0){
		System.out.println("Divisivel por 3, 7");
	}
	if((numero % 6)== 0) {
		System.out.println("Divisivel por 6");

	
	}
	

}
}
