import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //double a = 2;
        System.out.println("Введите число a:");
        double a = scanner.nextDouble();

        //double b = 3;
        System.out.println("Введите степень b:");
        double b = scanner.nextDouble();
        double c = Math.pow(2,3);
        System.out.println("Возвысили степень b для числа a:");
        System.out.println("c=" + c);
        System.out.println(" ");

        // Второй вариант
        System.out.println("Введите число a, затем степень b");
        System.out.println("c=" + Math.pow(scanner.nextDouble() ,scanner.nextDouble()));
        System.out.println(" ");

        // Третий Вариант
        System.out.println("Введите число a, затем степень b");
        System.out.println("c=" + Math.pow(new Scanner(System.in).nextDouble(), new Scanner(System.in).nextDouble()));
        System.out.println(" ");
    }
}
