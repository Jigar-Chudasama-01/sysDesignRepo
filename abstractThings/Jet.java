package abstractThings;

public class Jet extends Engine {
    @Override
    void type() {
        System.out.println("This is Jet engine !");
    }

    @Override
    int pistons() {
        return 480;
    }
}
