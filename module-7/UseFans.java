
// Ryan Monnier 
// CSD 402
// Module 7
// 18-Apr-2025
// git: https://github.com/islys/csd-402



// java.util.ArrayList is a resizable array implementation of the List interface
// using this to create a 'collection' per the instructions
import java.util.ArrayList;
import java.util.List;


public class UseFans {

    // displays fan w/o toString
    public static void displayFan(Fan fan) {
        if (fan.isOn()) {
            System.out.println("Fan is ON [Speed: " + fan.getSpeedText() + ", Color: " + fan.getColor() + ", Radius: " + fan.getRadius() + "]");
        } else {
            System.out.println("Fan is OFF [Color: " + fan.getColor() + ", Radius: " + fan.getRadius() + "]");
        }
    }

    // display all fans in a collection 
    public static void displayFans(List<Fan> fans) {
        for (int i = 0; i < fans.size(); i++) {
            System.out.print("Fan " + (i + 1) + ": ");
            displayFan(fans.get(i));
        }
    }

    public static void main(String[] args) {
        // create collection of Fan instances
        List<Fan> fanList = new ArrayList<>();

        fanList.add(new Fan()); // this is the default
        fanList.add(new Fan(Fan.FAST, true, 10.5, "blue"));
        fanList.add(new Fan(Fan.MEDIUM, false, 7.0, "red"));
        fanList.add(new Fan(Fan.SLOW, true, 6.5, "yellow"));

        // display all fans in collection
        System.out.println("Displaying all fans:\n");
        displayFans(fanList);
    }

    // this fan class is a static inner class
    public static class Fan {
        public static final int STOPPED = 0;
        public static final int SLOW = 1;
        public static final int MEDIUM = 2;
        public static final int FAST = 3;

        private int speed;
        private boolean on;
        private double radius;
        private String color;

        public Fan() {
            this.speed = STOPPED;
            this.on = false;
            this.radius = 6;
            this.color = "white";
        }

        public Fan(int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

        public int getSpeed() {
            return this.speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean isOn() {
            return this.on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public double getRadius() {
            return this.radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return this.color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        // method returns speed as a string
        public String getSpeedText() {
            switch (this.speed) {
                case SLOW:
                    return "SLOW";
                case MEDIUM:
                    return "MEDIUM";
                case FAST:
                    return "FAST";
                default:
                    return "STOPPED";
            }
        }
    }
}
