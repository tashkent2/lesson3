class Car extends Vehicle {
    private EngineType engineType;

    public Car(int speed, int capacity, EngineType engineType) {
        super(speed, capacity);
        this.engineType = engineType;
    }

    @Override
    public void start() {

        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped.");
    }

    @Override
    public String getInfo() {
        return "Car with engine: " + engineType;
    }
}