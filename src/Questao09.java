import java.io.*;

public class Questao09 {
    public static void main(String[] args) throws IOException  {

        try {
            new File("config.txt").createNewFile();
            FileReader arquivo = new FileReader("config.txt");
            BufferedReader leitor = new BufferedReader(arquivo);

            String linha = leitor.readLine();
            while (linha != null){
                System.out.println(linha);
                linha = leitor.readLine();
            }
        }catch (FileNotFoundException e){
            System.err.println("O arquivo não existe");
        } finally {
            System.out.println("Fim da operação!");
        }

    }
}
