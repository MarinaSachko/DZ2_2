
public class Main {
    public static void main(String[] args) {

        int account;
        int sumAdd;
        int prezent;
        int quantityForPrez;
        int sumBonus;
        account = 100;                                         //первоначальный счет
        prezent = 1;                                           //количество бонусных рублей
        quantityForPrez = 100;                                 //за какое количетво рублей дается prezent бонусов
        sumAdd = 1100;                                         //сумма пополнения

        sumBonus = (sumAdd > 1000) ? sumAdd / 100 * prezent : 0; //сумма бонусных рублей

        account = account + sumAdd + sumBonus;

        System.out.println("Итоговый счет " + account + " в том числе бонусных рублей " + sumBonus);
    }
}

