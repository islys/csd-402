

// Ryan Monnier 
// CSD 402
// Module 9
// 23-Apr-2025
// git: https://github.com/islys/csd-402



// importing ArrayList for list manipulation and Scanner for user input
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLister {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        // 10 NHL teams
        words.add("Chicago Blackhawks");
        words.add("Toronto Maple Leafs");
        words.add("Montreal Canadiens");
        words.add("Boston Bruins");
        words.add("Detroit Red Wings");
        words.add("New York Rangers");
        words.add("Colorado Avalanche");
        words.add("Los Angeles Kings");
        words.add("Washington Capitals");
        words.add("Tampa Bay Lightning");

        // print all of the teams added to our words array
        System.out.println("My favorite NHL teams:");
        for (String word : words) {
            System.out.println(word);
        }

        // have user input an index that we'll use to grab that line
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index (0-9) of the team you'd like to see again: ");
        String input = scanner.nextLine();

        try {
            // this is the auto-unboxing, which is theconversion of a primitive data type 
            // into its corresponding wrapper class, in this case an integer
            int index = Integer.parseInt(input); 
            // prints w/e index the user chose
            System.out.println("Selected team: " + words.get(index));
        // using catch as some limited input validation
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer index.");
        }
        // close our scanner
        scanner.close();
    }
}
