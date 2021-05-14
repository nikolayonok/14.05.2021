import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        System.out.println("Введите третье число");
        int c = sc.nextInt();
        System.out.println("Выберите операцию: 1 - наибольшее, 2 - наименьшее, 3 - ср. арифметическое");
        int d = sc.nextInt();

        switch (d) {
            case 1:
                if (a > b && a > c) {
                    System.out.println(a);
                } else if (b > a && b > c) {
                    System.out.println(b);
                } else {
                    System.out.println(c);
                }
            case 2:
                if (a < b && a < c) {
                    System.out.println(a);
                } else if (b < a && b < c) {
                    System.out.println(b);
                } else {
                    System.out.println(c);
                }
            case 3:
                System.out.println((a + b + c) / 3);
                break;
        }
    }
}
