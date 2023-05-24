import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        System.out.println("Olá! Vamos calcular o seu IMC? Por favor, preencha as informações abaixo!");
        Scanner in = new Scanner(System.in);
        System.out.println("Qual é o seu peso? (em quilos)");
        double peso = in.nextDouble();
        System.out.println("E qual é a sua altura? (em metros)");
        double altura = in.nextDouble();
        double imc = peso /  (altura * altura);
        DecimalFormat formato = new DecimalFormat("0.0");
        System.out.println("Certo! Então o seu IMC é de " + formato.format(imc) + "!");
        System.out.println("Tenha um bom dia!");

    }


}
