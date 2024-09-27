package sys;

public class OOP2 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.makeInstance();
        Singleton s2 = Singleton.makeInstance();
        Singleton s3 = Singleton.makeInstance();

    }
    static void message(){
        System.out.println("packages are basically folders");
    }
}
