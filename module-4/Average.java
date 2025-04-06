



public class Average {

    // short 
    public static short average(short[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        short sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // int
    public static int average(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // long
    public static long average(long[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // double
    public static double average(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // method that actually tests the above methods
    public static void main(String[] args) {

        // test short
        short[] shortArray = {29, 53, 72, 88, 98};
        System.out.println("Short: ");
        displayArray(shortArray);
        System.out.println("Average: " + average(shortArray));

        // test int
        int[] intArray = {202, 303, 404, 505};
        System.out.println("\nInt: ");
        displayArray(intArray);
        System.out.println("Average: " + average(intArray));

        // test long
        long[] longArray = {1111L, 2222L, 3333L};
        System.out.println("\nLong: ");
        displayArray(longArray);
        System.out.println("Average: " + average(longArray));

        // test double
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
        System.out.println("\nDouble: ");
        displayArray(doubleArray);
        System.out.println("Average: " + average(doubleArray));
    }

    // Helper method to display array elements in a readable way
    public static void displayArray(Object array) {
        if (array instanceof short[]) {
            for (short num : (short[]) array) {
                System.out.print(num + " ");
            }
        } else if (array instanceof int[]) {
            for (int num : (int[]) array) {
                System.out.print(num + " ");
            }
        } else if (array instanceof long[]) {
            for (long num : (long[]) array) {
                System.out.print(num + " ");
            }
        } else if (array instanceof double[]) {
            for (double num : (double[]) array) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // New line after displaying the array
    }
}
