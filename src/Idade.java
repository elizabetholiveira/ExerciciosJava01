import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        System.out.println("Olá! Vamos ver o quanto você já viveu?");
        System.out.println("Em que ano você nasceu? (se ainda não fez aniversário esse ano, por favor escreva o ano seguinte!)");
        Scanner in = new Scanner(System.in);
        short ano = in.nextShort();
        System.out.println("E em que mês você nasceu? (coloque o número!)");
        byte mes = in.nextByte();
        System.out.println("Por fim, me diga o dia que você nasceu, por favor!");
        byte dia = in.nextByte();

        int idadeanos = 2023 - ano;
        int idadeano = ano*365;
        int idademes = mes*30;
        int idademeses = idademes*ano;
        int idadedias = idadeano + idademes + dia;

        //Estou com muita dificuldade em pensar em como faço isso dar certo...

        System.out.print("Muito obrigado! Uau! Você tem ");
        System.out.println(idadeanos + " anos de idade!");
        System.out.println("Você já viveu " + idademeses + " meses!");
        System.out.println("Ou seja, você já viveu " + idadedias + " dias! Isso é incrível!");
        System.out.println("Tenha um bom dia!");

    }
}
