public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = Fan.SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";

    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setSpeed(int speed) {
        switch (speed) {
            case 1:
                this.speed = Fan.SLOW;
                break;
            case 2:
                this.speed = Fan.MEDIUM;
                break;
            case 3:
                this.speed = Fan.FAST;
                break;
            default:
                this.speed = Fan.SLOW;
                break;
        }
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan description: speed = " + this.speed + ", color = " + this.color + ", radius = " + this.radius;

        } else {
            return "Fan is off: color = " + this.color + ", radius = " + this.radius;

        }
    }

}
