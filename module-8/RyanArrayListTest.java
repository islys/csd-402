

// Ryan Monnier 
// CSD 402
// Module 8
// 23-Apr-2025
// git: https://github.com/islys/csd-402


// ArrayList for the sake of this assignment lol, lets us update our list once its created and other cool stuff
import java.util.ArrayList;
// Scanner to get user input
import java.util.Scanner;

public class RyanArrayListTest {

    public static void main(String[] args) {
        
        // getting user input and storing it to our arraylist variable called numbers, as an integer
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // instructions to user
        System.out.println("Input integers and press <enter> (enter 0 to stop):");
        int input;
        // loop to receive user input until a 0 is received
        do {
            input = scanner.nextInt();
            numbers.add(input);
        } while (input != 0);

        // call the biggest method and display the result
        Integer largest = biggest(numbers);
        System.out.println("The largest of the numbers entered is: " + largest);

        // close scanner..
        scanner.close();
    }
    // biggest method to get the largest number
    public static Integer biggest(ArrayList<Integer> list) {
        // in case the user didn't enter any non 0 numbers
        if (list == null || list.isEmpty()) {
            return 0;
        }

        // assumes that the first number is the biggest
        Integer biggest = list.get(0);
        // iterates through all subsequent numbers and compares them to the first number,
        // replacing the 'first' number with any that it finds that are bigger as it goes
        for (Integer number : list) {
            if (number > biggest) {
                biggest = number;
            }
        }
        return biggest;
    }
}
