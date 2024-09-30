package abstractThings;

public class Car extends Engine{
    @Override
    void type() {
        System.out.println("This is car engine !");
    }

    @Override
    int pistons() {
        return 360;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.info();
        System.out.println(c1.abc);
    }
}
