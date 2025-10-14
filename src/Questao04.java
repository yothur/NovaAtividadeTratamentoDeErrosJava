import java.io.*;

public class Questao04 {
    public static void main(String[] args) throws IOException {

        try {
            FileReader arquivo = new FileReader("dados.txt");
            BufferedReader leitor = new BufferedReader(arquivo);

            String linha = leitor.readLine();
            while (linha != null){
                System.out.println(linha);
                linha = leitor.readLine();
            }
        }catch (FileNotFoundException e){
            System.err.println("O arquivo não existe");
        }finally {
            System.out.println("Fim da operação!");
        }

    }
}
