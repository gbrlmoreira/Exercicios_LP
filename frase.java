import java.util.Scanner;

public class frase {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String frase;
        int contarVogais = 0;
        System.out.println("Digite uma frase");
        frase = ler.nextLine();
        frase = frase.toUpperCase();

        for (int i = 0; i < frase.length(); i++)
            if (frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || frase.charAt(i) == 'O' || frase.charAt(i) == 'U')
        System.out.println("Numero de vogais na frase é" + contarVogais);
    }
}
