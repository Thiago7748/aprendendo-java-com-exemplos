public class Ex08 {
    public static void main(String[] args) {

        int somaValorA = 10;
        int somaValorB = 5;

        int somaValores = somaValorA + somaValorB;
        int subtraiValores = somaValorA - somaValorB;

        System.out.printf("""
                           O valor da soma de 'A' e 'B' é: %d
                           -----------------------------------
                           O valor da subtração de 'A' e 'B' é: %d%n
                          """, somaValores, subtraiValores);
    }
}
