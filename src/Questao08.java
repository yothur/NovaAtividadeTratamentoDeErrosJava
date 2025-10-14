import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] palavras = {"Java", null, "Tratamento"};

        int armazenarIndice = 0;

        try {
            System.out.println("Digite um indice: ");
            int indice = sc.nextInt();
            armazenarIndice = indice;
            System.out.printf("Tamanho da String: %s ", palavras[indice].length());
        }catch (NullPointerException e){
            System.err.printf("A string na posição [%d] é nula!\n", armazenarIndice);
        }finally {
            for (int i = 0; i < palavras.length; i++){
                System.out.println(palavras[i]);
            }
        }
    }
}
