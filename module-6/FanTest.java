
// Ryan Monnier 
// CSD 402
// Module 6
// 11-Apr-2025
// git: https://github.com/islys/csd-402


public class FanTest {
    
    static class Fan {
        // default speeds
        public static final int STOPPED = 0;
        public static final int SLOW = 1;
        public static final int MEDIUM = 2;
        public static final int FAST = 3;

        
        private int speed;
        private boolean on;
        private double radius;
        private String color;

        // a default constructor for when there are no args passed
        public Fan() {
            this.speed = STOPPED;
            this.on = false;
            this.radius = 6;
            this.color = "white";
        }

        // a parameterized constructor that will accept our args
        public Fan(int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

        // these two methods allow us to get or change the speed of the fan
        public int getSpeed() {
            return speed;
        }
        public void setSpeed(int speed) {
            this.speed = speed;
        }
        // likewise, these two methods allow us to get or set the boolean variable so the fan is on/off
        public boolean isOn() {
            return on;
        }
        public void setOn(boolean on) {
            this.on = on;
        }
        // same as above, for radius
        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }
        // color..
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }

        // method to check if the fan is on or off 
        // and to convert the fan's state into a readable string when we print a Fan object
        @Override
        public String toString() {
            if (on) {
                return "Fan is ON [Speed: " + speedToString(speed) + ", Color: " + color + ", Radius: " + radius + "]";
            } else {
                return "Fan is OFF [Color: " + color + ", Radius: " + radius + "]";
            }
        }

        // method to convert our numerical speed variables into text
        private String speedToString(int speed) {
            switch (speed) {
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

    public static void main(String[] args) {
        // makes a fan using default constructor for when there are no args
        Fan fan1 = new Fan();
        System.out.println("Fan 1 (default): " + fan1);

        // makes a fan using a parameterized constructor in order to utilize our custom values
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        System.out.println("Fan 2 (custom): " + fan2);

        // modifies the fan1 which was using the default constructor/parameters to 
        // the new values that we set here
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8);
        fan1.setColor("green");
        // prints our new and improved Fan 1!
        System.out.println("Fan 1 (modified): " + fan1);
    }
}
