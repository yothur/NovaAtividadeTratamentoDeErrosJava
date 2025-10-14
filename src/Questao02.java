import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorInteiro = new int[10];
        try {
            int indice = 0;
            while (true){
                System.out.println("Digite um valor: ");
                int valor = sc.nextInt();
                vetorInteiro[indice] = valor;
                indice++;
                if (valor == 0){
                    break;
                }
            }
            for (int i = 0; i < indice; i++){
                System.out.println(vetorInteiro[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("informou mais de 10 valores!");
        }catch (InputMismatchException e){
            System.err.println("valor não numérico!");
        }
    }
}
