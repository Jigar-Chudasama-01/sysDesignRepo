package sys;

public class Singleton {
    private static Singleton single;

    private Singleton() {
        System.out.println("For Only Once Constructor called ! ");
    }

    public static Singleton makeInstance() {
        if (single == null) {
            single= new Singleton();
        }
        return single;
    }
}
