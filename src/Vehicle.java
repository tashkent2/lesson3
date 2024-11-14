abstract class Vehicle implements Transport {
    protected int speed;
    protected int capacity;

    public Vehicle(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    public abstract void start();

    public abstract void stop();

    public abstract String getInfo();
}