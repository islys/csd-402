// Ryan Monnier 
// CSD 402
// Module 3
// 30-Mar-2025
// git: https://github.com/islys/csd-402



public class pyramid {
    public static void main(String[] args) {
        // initialize variables
        int maxRows = 7; 
        int maxWidth = 3;
        
        // this will be used to appropriately place the @ symbols
        int totalWidth = (maxRows * maxWidth);
        
        // outerloop, each iteration of this loop = 1 row
        for (int i = 0; i < maxRows; i++) {
            int currentValue = 1;

            // first loop will print the needed number of empty spaces to get our symmetry
            for (int j = 0; j < maxRows - i - 1; j++) {
                System.out.print("   "); 
            }

            // second loop prints our ascending powers of 2
            for (int j = 0; j <= i; j++) {
                // using printf to format our output, %- = allign left, %d is for a (decimal?) integer
                System.out.printf("%-" + maxWidth + "d", currentValue);
                currentValue *= 2;
            }

            // this loop prints ascending numbers, beginning after the max value
            currentValue /= 4; 
            for (int j = 0; j < i; j++) {
                System.out.printf("%-" + maxWidth + "d", currentValue);
                currentValue /= 2; 
            }

            // subtracts the number of characters we used from the total width to determine where the @ goes
            int spacesBeforeAt = totalWidth - (i * maxWidth);

            // print required spaces and @ symbol
            for (int j = 0; j < spacesBeforeAt; j++) {
                System.out.print(" ");
            }
            System.out.println("@");
        }
    }
}


// printf intro
// https://www.youtube.com/watch?v=c2B_Av3x65s
