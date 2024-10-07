import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Jo-an Enriquez
 */
public class MovieTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner scanner = new Scanner(System.in);
        Queue<String> movies = new LinkedList<>();
        Queue<String> snacks = new LinkedList<>();

        // Get movie input
        System.out.println("Enter three movies you'd like to watch:");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Movie " + i + " of " + "3:");
            movies.offer(scanner.nextLine());
        }

        // Get snack input
        System.out.println("Enter three snacks or beverages:");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Snack " + i + " of " + "3:");
            snacks.offer(scanner.nextLine());
        }

        // Display movies and snacks
        System.out.println("\nMovies you will watch:");
        for (String movie : movies) {
            System.out.print(movie + ",");
        }

        System.out.println("\nSnacks you have:");
        for (String snack : snacks) {
            System.out.print(snack + ",");
        }

        // Process snack consumption
        while (!snacks.isEmpty()) {
            System.out.print("\nPress 'S' when you've finished a snack: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("S")) {
                snacks.poll(); // Removes the first snack
                if (snacks.isEmpty()) {
                    System.out.println("No more snacks.");
                } else {
                    System.out.println("Remaining snacks: " + snacks);
                }
            }
        }
        scanner.close();
    }
}
