public class Pendulum {
    private double length;
    private double gAcceleration;

    public Pendulum(double length, double gAcceleration) {
        this.length = length;
        this.gAcceleration = gAcceleration;
    }

    public Pendulum(double length) {
        this(length, 9.8);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getGAcceleration() {
        return gAcceleration;
    }

    public void setGAcceleration(double gAcceleration) {
        this.gAcceleration = gAcceleration;
    }

    public double oscPeriod() {
        return (2*Math.PI*(Math.sqrt(this.gAcceleration/this.length)));
    }
}