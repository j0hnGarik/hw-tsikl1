public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        System.out.println("задание 2");
        for (int y = 10; y >= 1; y = y - 1) {
            System.out.println(y);
        }
        System.out.println("задание 3");
        for (int a = 2; a < 17; a = a + 2) {
            System.out.println(a);
        }
        System.out.println("задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("задание 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println("Високосный год " + i);
        }
        System.out.println("задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("задание 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("задание 8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("задание 9");
        int zarabotal = 29000;
        int t = 0;
        for (int i = 1; i <= 12; i++) {
            t = t + t / 100;
            t = t + zarabotal;
            System.out.println("Месяц " + i + " сумма накоплений равна " + t + " рублей");
        }
        System.out.println("задание-10");
        int e = 2;
        for (int j = 1; j <= 10; j++) {
            System.out.println(e + "*" + j + "=" + e * j);


        }
    }
}

