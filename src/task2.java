import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int a = sc.nextInt();
        System.out.println("Введите второе число ");
        int b = sc.nextInt();
        System.out.println("Введите третье число ");
        int c = sc.nextInt();
        System.out.println("Введите операцию: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление ");
        int d = sc.nextInt();

        switch (d) {
            case 1:
                System.out.println(a + b + c);
                break;
            case 2:
                System.out.println(a - b - c);
                break;
            case 3:
                System.out.println(a * b * c);
                break;
            case 4:
                System.out.println(a / b / c);
                break;
        }
    }
}
