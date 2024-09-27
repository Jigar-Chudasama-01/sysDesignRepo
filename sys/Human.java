package sys;

public class Human {
    static long population;
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        Human.population+=1;
    }
}