public class Questao05 {
    public static void main(String[] args) {

        String valorNulo = null;

        try {
            System.out.println(valorNulo.length());
        }catch (NullPointerException e){
            System.err.println("A string é nula!");
        }
    }
}
