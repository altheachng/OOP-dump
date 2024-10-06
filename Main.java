public class Main {
    public static void main(String[] args) {
        Car car = new Car(); //initialize new object

        car.go();

        Bicycle bike = new Bicycle();

        bike.stop();

        System.out.println(car.speed);
        System.out.println(bike.speed);
        System.out.println(car.wheels);
        System.out.println(bike.wheels);
    }
}
