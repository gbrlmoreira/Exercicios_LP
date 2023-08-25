import java.util.Locale;
import java.util.Scanner;

public class carro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String placaCarro;
        int ano;
        System.out.println("Digite a placa");
        placaCarro = ler.next();
        System.out.println("Digite ano");
        ano = ler.nextInt();
        if(ano<2010)
            System.out.println("Carro velho");
        else if(ano<=2022)
            System.out.println("Carro seminovo");
        else if(ano==2023)
            System.out.println("Carro novo");
        else
            System.out.println("Inválido");
        placaCarro= placaCarro.toUpperCase();
        for(int i=0;i<placaCarro.length();i++){
            if (placaCarro.charAt(i)=='A'||placaCarro.charAt(i)=='E'||placaCarro.charAt(i)=='I'||placaCarro.charAt(i)=='O'||placaCarro.charAt(i)=='U')
            placaCarro=placaCarro.replace(placaCarro.charAt(i),'*');
        }
        System.out.println("Placa alterada "+ placaCarro);
    }
}
