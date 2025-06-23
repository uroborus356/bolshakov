import java.util.Scanner;

public class Zadanie1Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();
        
        // Сравнение 
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        
        // Плюс, минус, умножить
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        
        // Деление 
        if (b != 0) {
            double division = (double) a / b;
            System.out.println("Деление: " + division);
        } else {
            System.out.println("Деление на ноль невозможно");
        }
        
        scanner.close();
    }
}