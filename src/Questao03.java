import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um valor: ");
            String valor = sc.next();

            int converter = Integer.parseInt(valor);

            System.out.println(converter);


        }catch (NumberFormatException e){
            System.err.println("Entrada Invalida. Digite um número inteiro.");
        }
    }
}
