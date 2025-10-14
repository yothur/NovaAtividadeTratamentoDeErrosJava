import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro valor: ");
            double num1 = sc.nextDouble();
            System.out.println("Digite o segundo valor: ");
            double num2 = sc.nextDouble();

            if (num2 == 0){
                throw new ArithmeticException();
            }

            double resultado = num1 / num2;

            System.out.println(resultado);

        }catch (ArithmeticException e) {
            System.err.println("divisão por 0!");
        }catch (InputMismatchException e){
            System.err.println("valor não númerico!");
        }
    }
}
