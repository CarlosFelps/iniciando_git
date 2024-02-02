public class App {
    public static void main(String[] args) {
        /*
         * //Declarando Variavel
         * boolean a = true;
         * boolean b = false;
         * 
         * // usando o operador XOR para verificar se apenas um dos valores é verdadeiro
         * boolean resultado = a ^ b;
         * 
         * System.out.println("Resultado do XOR: " + resultado);
         */

        boolean gostaDeNike = true;
        boolean gostaDeAdidas = false;

        if (gostaDeNike ^ gostaDeAdidas) {
            System.out.println("Eu gosto de nike");

        } else {
            System.out.println("Eu não gosto de nike e sim Adidas");
        }

    }
}
