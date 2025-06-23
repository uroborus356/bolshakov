import java.util.Scanner;

public class Zadanie2Sravnenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Первое значение (a): ");
        String a = scanner.nextLine();

        System.out.print("Второе значение (b): ");
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        scanner.close();
    }
}