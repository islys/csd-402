

// Ryan Monnier 
// CSD 402
// Module 9
// 23-Apr-2025
// git: https://github.com/islys/csd-402

// java.io allows reading/writing files
// random gives us random capabilities
import java.io.*;
import java.util.Random;

public class NumberMaker {
    public static void main(String[] args) {
        // create a file object (not the actual file yet) using the local path of .\data.file
        File file = new File("data.file");
        // RNG
        Random rand = new Random();

        try {
            // creates the file if it doesn't already exist
            if (file.createNewFile()) {
                System.out.println("Made the file: " + file.getName());
            } else {
                System.out.println("The file is already in place, appending to its contents.");
            }

            // random numbers
            FileWriter writeToFile = new FileWriter(file, true); 
            BufferedWriter buffwrite = new BufferedWriter(writeToFile);

            for (int i = 0; i < 10; i++) {
                int randomNum = rand.nextInt(100); 
                buffwrite.write(randomNum + " ");
            }

            // add a black line and close the writing buffer
            buffwrite.newLine(); 
            buffwrite.close();

            // read file contents
            FileReader readFile = new FileReader(file);
            BufferedReader br = new BufferedReader(readFile);

            // print the contents
            System.out.println(file.getName() + " contains: ");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } 
        // should catch errors like file issues and print some details
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
