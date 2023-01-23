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
        System.out.println("Возвысили степень b для числа a" + " " + c);
    }
}
