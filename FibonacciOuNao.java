import java.util.Scanner;

public class FibonacciOuNao {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean rodando = true;
			
		System.out.println("\n -------- Verificar se um número pertence a sequência Fibonacci -------- ");
		
		while (rodando) {
		
			System.out.println("\n ------------------------ \n");
			System.out.print(" Digite um número: ");
			int numero = scanner.nextInt();
			
			if (fibonacci(numero)) {
				System.out.println(" O número " + numero + " PERTENCE à sequência de Fibonacci.\n");	
			} else {
				System.out.println(" O número " + numero + " NÃO PERTENCE à sequência de Fibonacci.\n");
			}
			
			scanner.nextLine();
			
			System.out.print(" Deseja testar outro numero? (S/N): ");
			String input = scanner.nextLine().toLowerCase();
			
			if (input.equals("n")) {
				rodando = false;
			}
		
		}
		
	}
	
	public static boolean fibonacci(int numero) {
		
		int a = 0, b = 1, temp;
		
		while (a <= numero) {
			if (a == numero) {
				return true;
			}
			temp = a;
			a = b;
			b = temp + b;
		}
		return false;
	}
	
}