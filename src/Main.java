import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        
        int firstNumber = new Scanner(System.in).nextInt();
        int secondNumber = new Scanner(System.in).nextInt();
        int sum = firstNumber + secondNumber;
        int diff = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double quotient = (double) firstNumber / secondNumber;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + diff);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
    }
}
