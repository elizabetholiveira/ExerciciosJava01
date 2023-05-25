import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.lang.*;

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

        /*int idadeanos = 2023 - ano;
        int idadeano = idadeanos*365;
        int idademes = mes*30;
        int idademeses = (idadeanos*12) + mes;
        int idadedias = idadeano + idademes + dia;*/

        /*LocalDate datadehoje = LocalDate.parse();
        int anohoje = datadehoje .getYear();
        int meshoje = datadehoje .getMonthValue();
        int diahoje = datadehoje .getDayOfMonth();
        String datafinaldehoje = (diahoje + "/" + meshoje + "/" + anohoje);

        System.out.println("Hoje é dia " + datafinaldehoje);*/

        /*Calendar calendario = new GregorianCalendar();
        Calendar datadehoje = Calendar.getInstance();
        int anohoje = datadehoje .get(Calendar.YEAR);
        int meshoje = datadehoje .get(Calendar.MONTH);
        int diahoje = datadehoje .get(Calendar.DAY_OF_MONTH);
        String datafinaldehoje = (diahoje + "/" + meshoje + "/" + anohoje);

        System.out.println(datafinaldehoje);*/

        LocalDate datadehoje =  LocalDate.now();

        int anohoje = datadehoje.getYear();
        int meshoje = datadehoje.getMonthValue();
        int diahoje = datadehoje.getDayOfMonth();
        String datafinaldehoje = ("Hoje é dia: " + diahoje + "/" + meshoje + "/" + anohoje);

        System.out.println(datafinaldehoje);

        int idadeanos = anohoje - ano;
        int idadeano = idadeanos*365;
        int idademes = meshoje - mes;
        int idademesdias = (meshoje - mes)*30;
        int idademeses = (idadeanos*12) + mes;
        int idadedia = (diahoje - dia);
        int idadedias = idadeano + Math.abs(idademesdias) + Math.abs(idadedia);

        //Estou com muita dificuldade em pensar em como faço isso dar certo...
        // Ok, conseguir fazer isso dar certo na parte da contagem final, ao menos de forma arredondada...
        // Eu tentei várias coisas de vários sites (a maioria fui fazendo, não dava certo, fui apagando, as que sobraram aqui como comentários são as últimas quando eu resolvi deixar pra poder analisar o que que não deu certo)
        // Pedi ajuda no grupo do WhatsApp e quero deixar um agradecimento a todo mundo que tirou um tempo para tentar me ajudar <3
        // Mas quero deixar um agradecimento especial ao João Cruz, que foi quem achou o código que deu certo! Muito obrigada <3

        // Agora não tô conseguindo fazer dar a volta no ano pra quem faz aniversário no final do mês...
        // Tipo quem faz aniversário em Outubro (10) e agora é Maio (5) fica dando uma diferença de 5 meses, só que na real é de 7 meses
        // Porque dá a volta no ano...

        //System.out.print("Muito obrigado! Uau! Você tem ");
        System.out.print("Então você tem ");
        System.out.println(idadeanos + " anos " + Math.abs(idademes) + " meses, e " + Math.abs(idadedia) + " dias de idade!");
        System.out.println("Você já viveu cerca de " + idademeses + " meses!");
        System.out.println("Ou seja, você já viveu cerca de " + idadedias + " dias! Isso é incrível!");
        System.out.println("Tenha um bom dia!");

    }
}
