import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        System.out.print("Olá! Curioso para saber quantos salários mínimos você ganha?");
        System.out.println(" Então me diga quanto que é o seu salário atual, por favor:");
        Scanner in = new Scanner(System.in);
        double salario = in.nextDouble();

        double salariominimo = 1212.00;
        double quantossalarios = salario/salariominimo;

        DecimalFormat formato = new DecimalFormat("0.0");
        System.out.println("Obrigado! Você ganha " + formato.format(quantossalarios) + " vezes o valor do salário mínimo!");
        System.out.println("Tenha um bom dia!");

    }
}
