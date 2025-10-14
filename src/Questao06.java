import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] valor = new int[1];

        try {
            System.out.println("Digite um valor: ");
            String num = sc.next();

            int dobro = Integer.parseInt(num) * 2;

            valor[0] = dobro;
        }catch (NumberFormatException e){
            System.err.println("Entrada não numérica");

        }try {
            System.out.println("Digite o índice que você quer acessar: ");
            int indice = sc.nextInt();

            System.out.println(valor[indice]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Indice invalido!");
        }
    }
}
