
public class Main {
    public static void main(String[] args) {

        int account = 100;                                         //первоначальный счет
        int prezent = 1;                                           //количество бонусных рублей
        int quantityForPrez = 100;                                 //за какое количетво рублей дается prezent бонусов
        int sumAdd = 1100;                                         //сумма пополнения

        int sumBonus = (sumAdd > 1000) ? sumAdd / 100 * prezent : 0; //сумма бонусных рублей

        account = account + sumAdd + sumBonus;

        System.out.println("Итоговый счет " + account + " в том числе бонусных рублей " + sumBonus);
    }
}

