package lesson2.abstraction.abstractClass.ex2;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        Bird bird = new Bird();
        Ship ship = new Ship();

        auto.defoultMethod();
        auto.iCanFly();
        auto.vehicleMethod();
        auto.move();
        System.out.println("========================");
        bird.defoultMethod();
        bird.iCanFly();
        System.out.println("========================");
        ship.move();
    }
}
