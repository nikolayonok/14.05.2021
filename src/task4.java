import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество метров ");
        double a = sc.nextDouble();
        System.out.println("1 - мили, 2 - дюймы, 3 - ярды");
        int b = sc.nextInt();
        switch (b) {
            case 1:
                double mils = a / 1600;
                System.out.println(mils);
                break;
            case 2:
                double inches = a * 39.37;
                System.out.println(inches);
                break;
            case 3:
                double yards = a * 1.09;
                System.out.println(yards);
                break;
        }
    }
}
