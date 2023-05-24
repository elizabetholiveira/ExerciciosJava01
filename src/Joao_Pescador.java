import java.text.DecimalFormat;
import java.util.Scanner;

public class Joao_Pescador {
    public static void main(String[] args) {
        System.out.println("Olá, João! Vejo que chegaram mais peixes hoje! Por favor, preencha o que eu pedir abaixo que vou lhe ajudar com os cálculos!");
        Scanner in = new Scanner(System.in);
        System.out.println("Quantos quilos de peixe você pegou hoje?");
        double peso = in.nextDouble();
        System.out.println("Muito obrigado! Só um minuto que já já te falo o resultado...");
        double excesso = peso - 50;
        double multa = excesso * 4;
        System.out.print("Obrigado por esperar! Os peixes ultrapassaram " + excesso + " quilos");
        DecimalFormat formatoreais = new DecimalFormat("0.00");
        System.out.println(", ou seja, você vai ter que pagar uma multa no valor de " + formatoreais.format(multa) + " reais.");
        System.out.print("Tenha um bom dia!");
    }
}
