/*  Ryan Monnier
 *  CSD 402
 *  12 May 2025
 *  Module 12
 */


import java.util.Random;

public class AutoShopService {

    // initial service cost
    static final double BASE_SERVICE_COST = 245.00;

    // value ranges for our test statements to get random values
    static final double MIN_OIL_CHANGE = 35.00;
    static final double MAX_OIL_CHANGE = 55.00;
    static final double MIN_TIRE_ROTATION = 25.00;
    static final double MAX_TIRE_ROTATION = 40.00;
    static final double MIN_COUPON = 10.00;
    static final double MAX_COUPON = 30.00;

    // initiate our random number generator
    static Random random = new Random();

    // just to spit out the base service cost that we established above
    public static double yearlyService() {
        return BASE_SERVICE_COST;
    }

    // base service cost + oil fee, for 1 parameter input
    public static double yearlyService(double oilFee) {
        return BASE_SERVICE_COST + oilFee;
    }

    // 2 parameter input: oil fee and tire fee
    public static double yearlyService(double oilFee, double tireFee) {
        return BASE_SERVICE_COST + oilFee + tireFee;
    }

    // 3 parameter input: oil fee tire fee and the discount
    public static double yearlyService(double oilFee, double tireFee, double discount) {
        return (BASE_SERVICE_COST + oilFee + tireFee) - discount;
    }

    public static void main(String[] args) {
        // calls the method defined near the bottom to get random values within our range
        double oil1 = getRandom(MIN_OIL_CHANGE, MAX_OIL_CHANGE);
        double oil2 = getRandom(MIN_OIL_CHANGE, MAX_OIL_CHANGE);
        double tire1 = getRandom(MIN_TIRE_ROTATION, MAX_TIRE_ROTATION);
        double tire2 = getRandom(MIN_TIRE_ROTATION, MAX_TIRE_ROTATION);
        double coupon1 = getRandom(MIN_COUPON, MAX_COUPON);
        double coupon2 = getRandom(MIN_COUPON, MAX_COUPON);

        // print statement for the base service only
        System.out.printf("Base Service Only: $%.2f%n", yearlyService());

        // 2 test statements using our random values for oil change + base service
        System.out.printf("Service + Oil Change (%.2f) - Test 1: $%.2f%n", oil1, yearlyService(oil1));
        System.out.printf("Service + Oil Change (%.2f) - Test 2: $%.2f%n", oil2, yearlyService(oil2));

        // 2 test statements using random values for the tires + oil change + base service
        System.out.printf("Service + Oil (%.2f) + Tire (%.2f) - Test 1: $%.2f%n", oil1, tire1, yearlyService(oil1, tire1));
        System.out.printf("Service + Oil (%.2f) + Tire (%.2f) - Test 2: $%.2f%n", oil2, tire2, yearlyService(oil2, tire2));

        // final 2 test statements that include the previous parameters - the coupon amount
        System.out.printf("Service + Oil (%.2f) + Tire (%.2f) - Coupon (%.2f) - Test 1: $%.2f%n", oil1, tire1, coupon1, yearlyService(oil1, tire1, coupon1));
        System.out.printf("Service + Oil (%.2f) + Tire (%.2f) - Coupon (%.2f) - Test 2: $%.2f%n", oil2, tire2, coupon2, yearlyService(oil2, tire2, coupon2));
    }

    // helper method to generate random double values within our previously defined range
    public static double getRandom(double min, double max) {
        return min + (max - min) * random.nextDouble();
    }
}
