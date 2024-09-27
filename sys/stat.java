package sys;

public class stat {
    static int a = 10;
    static int b = 20;

    static {
        System.out.println("This is called static block. It is only called one time when class is loaded !");
        b = a*69;
    }

    public static void main(String[] args) {
        System.out.println(stat.a);
        System.out.println(stat.b);
        stat.b+=43;
        System.out.println(stat.b);
    }
}
