import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Natalya.Kadysheva\\IdeaProjects\\LessonException\\res\\numbers.txt");
        try {
            Scanner scanner = new Scanner(file);
            int sum = 0;
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
            }
            System.out.println("Sum number: " + sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error:file not find");
        }
    }
}
