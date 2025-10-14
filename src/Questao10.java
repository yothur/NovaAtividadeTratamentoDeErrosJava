import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Digite a primeira nota: ");
            double num1 = sc.nextDouble();
            if (num1 < 0 | num1 > 10){
                throw new IllegalArgumentException();
            }
            System.out.println("Digite a segunda nota: ");
            double num2 = sc.nextDouble();
            if (num2 < 0 | num2 > 10) {
                throw new IllegalArgumentException();
            }
            System.out.println("Digite a terceira nota: ");
            double num3 = sc.nextDouble();
            if (num3 < 0 | num3 > 10) {
                throw new IllegalArgumentException();
            }

            double media = (num1 + num2 + num3) / 3;

            System.out.printf("A média foi: %.1f ", media);


        }catch (NumberFormatException e){
            System.err.println("Digite apenas números!");
        }catch (IllegalArgumentException e){
            System.err.println("As notas devem estar entre 0 e 10");
        }
    }
}
