import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class QuantasLetras {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean rodando = true;
		
		System.out.println("\n -------- Contador de letras específicas em palavras ou frases. -------- ");
		
		while (rodando) {
			
			System.out.println("\n ------------------------ \n");
			System.out.print(" Digite uma palavra ou uma frase: ");
			String texto = scanner.nextLine();
			
			System.out.print("\n Digite qual letra quer contar: ");
			char letra = scanner.next().charAt(0);
			
			int quantasVezes = contarVezes(texto, letra);
			
			System.out.println("\n A letra '" + letra + "' aparece " + quantasVezes + " vezes na palavra/frase digitada.\n");
			
			scanner.nextLine();
			
			System.out.print(" Fechar o programa? (S/N): ");
			String input = scanner.nextLine().toLowerCase();
			
			if (input.equals("s")) {
				rodando = false;
			}
			
		}
		
		scanner.close();
		
	}
	
	public static int contarVezes(String texto, char letra) {

		Set<Character> letrasEquivalentes = gerarLetrasEquivalentes(letra);
		int quantas = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			
			char letraAtual = Character.toLowerCase(texto.charAt(i));
			
			if (letrasEquivalentes.contains(letraAtual)) {
				quantas++;
			}
			
		}
		return quantas;
	}
	
	public static Set<Character> gerarLetrasEquivalentes(char letra) {
		
		Set<Character> letrasEquivalentes = new HashSet<>();
		letra = Character.toLowerCase(letra);
		
		letrasEquivalentes.add(letra);
		
		switch (letra) {
			case 'a':
				letrasEquivalentes.add('á');
				letrasEquivalentes.add('â');
				letrasEquivalentes.add('à');
				letrasEquivalentes.add('ã');
				break;
			case 'e':
				letrasEquivalentes.add('é');
				letrasEquivalentes.add('ê');
				break;
			case 'i':
				letrasEquivalentes.add('í');
				letrasEquivalentes.add('î');
				break;
			case 'o':
				letrasEquivalentes.add('ó');
				letrasEquivalentes.add('ô');
				letrasEquivalentes.add('õ');
				break;
			case 'u':
				letrasEquivalentes.add('ú');
				letrasEquivalentes.add('û');
				break;
		}
		
		return letrasEquivalentes;
		
	}
	
}