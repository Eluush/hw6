public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        for (int i = 10; i > -11; i = i - 1) {
            System.out.println(i);
        }
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        for (int i = 0; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        int money = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + money;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total + " рублей");
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + 2 * i);
        }


    }
}