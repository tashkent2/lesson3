public class Main {
    public static void main(String[] args) {

        Car car = new Car(120, 5, EngineType.PETROL);
        car.start();
        System.out.println(car.getInfo());
        car.stop();
    }
}
