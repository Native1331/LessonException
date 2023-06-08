import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter integer number:  ");
            int number = scanner.nextInt();
            System.out.println("You enter number:  " + number);
        } catch (Exception e) {
            System.out.println("Error. Not Integer number!");
        }
    }
}
