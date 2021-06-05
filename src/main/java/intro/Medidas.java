// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas
import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software

        // Utilizar a classe Scanner do Java para ler a escolha do usuário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U   D E   O P Ç Õ E S");
        System.out.println("c - Calcular Area Modo Curto");
        System.out.println("d - Contar até Dez");
        System.out.println("e - Calcular Area Modo Extenso");
        System.out.println("i - If Simples");
        System.out.println("r - Contagem regressiva de 10 a 0");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next();

        // switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software

        //String opcao = "curto";

        switch (opcao) {
            case "c", "C" -> {
                System.out.println("Você escolheu executar o método calcularAreaModoCurto");
                calcularAreaModoCurto();
            }
            case "d", "D" -> {
                System.out.println("Você escolheu executar o método contarAteDez");
                contarAteDez();
            }
            case "e", "E" -> {
                System.out.println("Você escolheu executar o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
            }
            case "i", "I" -> {
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
            }
            case "r", "R" -> {
                System.out.println("Você escolheu executar o método contagemRegressiva");
                contagemRegressiva();
            }
            default -> System.out.println("Você escolheu outro valor que não tem uma ação associada");
        }
    }

    public static void ifSimples(){
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software

        // if = se
        // else = senão

        calcularAreaModoCurto();
     }

    public static void calcularAreaModoCurto(){
        System.out.println("Cálculo de Areas Modo Curto");

        // Calcula de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento + "m²");
    }

    public static void calcularAreaModoExtenso(){

        System.out.println("Cálculo de Areas Modo Extenso");

        // Calculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 4
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + resultado + "m²");
    }
    public static void contarAteDez(){

        // Loops ou Repetições
        // for = repetição incondicional
        System.out.println("Contagem Crescente");

        for(int numero = 1; numero <= 10; numero++){
            System.out.println(numero);
        }
    }

    public static void contagemRegressiva(){
        System.out.println("Contagem Regressiva");

        for(int numero = 10; numero > -1; numero--){
            System.out.println(numero);
        }
    }

}