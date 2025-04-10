// Ryan Monnier 
// CSD 402
// Module 5
// 10-Apr-2025
// git: https://github.com/islys/csd-402


public class BigSmallArray {

    // locating the largest in an array of doubles
    // method to return a 1 dimension array, where the first value is the index of the array
    // and the second value is the index of the biggest number within that array
    public static int[] getBig(double[][] index) {
        // this is going to be the location our biggest value
        int[] loc = new int[2];
        // starts by assuming that the first index (0,0) is the biggest number
        double max = index[0][0];

        // typical for loop that iterates through the arrays in the 2D array
        for (int i = 0; i < index.length; i++) {
            // nested loop that iterates through the values of each array
            for (int j = 0; j < index[i].length; j++) {
                // compares each subsequent value checked to the 'max' variable that we set to position 0,0
                // 'max' variable is updated with values found that are bigger
                if (index[i][j] > max) {
                    // i is of course the array that we're on
                    // and j is the value's position in the array
                    max = index[i][j];
                    // update the location of our new biggest value
                    loc[0] = i;
                    loc[1] = j;
                }
            }
        }
        // returns our coordinates!
        return loc;
    }

    // find the biggest value in the array of integers
    // works the exact same as the method above, just with data type int for the 2D array, java is weird
    public static int[] getBig(int[][] index) {
        int[] loc = new int[2];
        int max = index[0][0];

        for (int i = 0; i < index.length; i++) {
            for (int j = 0; j < index[i].length; j++) {
                if (index[i][j] > max) {
                    max = index[i][j];
                    loc[0] = i;
                    loc[1] = j;
                }
            }
        }

        return loc;
    }

    // finds the smallest value in a 2D array of doubles
    // same as above except we're looking for the min... so if j < min(pos 0,0 for starters)
    // then we update the loc var
    public static int[] getSmall(double[][] index) {
        int[] loc = new int[2];
        double min = index[0][0];

        for (int i = 0; i < index.length; i++) {
            for (int j = 0; j < index[i].length; j++) {
                if (index[i][j] < min) {
                    min = index[i][j];
                    loc[0] = i;
                    loc[1] = j;
                }
            }
        }

        return loc;
    }

    // finds the smallest value in a 2D array of integers
    // same as above.. but for ints
    public static int[] getSmall(int[][] index) {
        int[] loc = new int[2];
        int min = index[0][0];

        for (int i = 0; i < index.length; i++) {
            for (int j = 0; j < index[i].length; j++) {
                if (index[i][j] < min) {
                    min = index[i][j];
                    loc[0] = i;
                    loc[1] = j;
                }
            }
        }

        return loc;
    }


    public static void main(String[] args) {
        // array of doubles, biggest is 6.1[2,2] and smallest is 0.6[1,1]
        double[][] doubleArray = {
            {1.5, 2.8, 3.1},
            {4.2, 0.6, 5.7},
            {0.9, 3.2, 6.1}
        };

        int[][] intArray = {
            // array of integers, biggest is 9[1,0] smallest is 1[0,2]
            {3, 5, 1},
            {9, 7, 2},
            {8, 6, 4}
        };

        // run each method against its appropriate array type 
        // and save to a new variable as an array of integers
        int[] biggestDoubleLoc = getBig(doubleArray);
        int[] smallestDoubleLoc = getSmall(doubleArray);
        int[] biggestIntLoc = getBig(intArray);
        int[] smallestIntLoc = getSmall(intArray);

        System.out.printf("Position of biggest double: [%d, %d]%n", biggestDoubleLoc[0], biggestDoubleLoc[1]);
        System.out.printf("Position of smallest double: [%d, %d]%n", smallestDoubleLoc[0], smallestDoubleLoc[1]);
        System.out.printf("Position of biggest integer: [%d, %d]%n", biggestIntLoc[0], biggestIntLoc[1]);
        System.out.printf("Position of smallest integer: [%d, %d]%n", smallestIntLoc[0], smallestIntLoc[1]);
    }
}
