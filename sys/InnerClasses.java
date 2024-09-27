package sys;

public class InnerClasses {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test t1 = new Test("Jigar");
        Test t2 = new Test("Not Jigar");
        System.out.println(t1.name);
        System.out.println(t2.name);
    }
}