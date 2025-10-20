import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        System.out.println("Informe seu nome: ");

        Scanner leitura = new Scanner (System.in);
        String nomeEntrada = leitura.nextLine();

        System.out.println("Olá, " + nomeEntrada + "! " + "Tudo bem?");
    }
}
