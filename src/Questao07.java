import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            try {
                System.out.println("Digite um número decimal: ");
                String inicio = sc.nextLine();
                double num = Double.parseDouble(inicio);
                System.out.println("Número: " + num);
                break;
            }catch (NumberFormatException e){
                System.err.println("Formato Invalido!");
            }
        }
    }
}
