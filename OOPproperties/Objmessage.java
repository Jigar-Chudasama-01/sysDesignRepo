package OOPproperties;

public class Objmessage {
    String name;
    int roll;

    public Objmessage(String name, int roll_no) {
        this.name = name;
        this.roll = roll_no;
    }

    @Override
    public String toString() {
        return this.name + " " + this.roll;
    }
    public static void main(String[] args) {
        Objmessage obj = new Objmessage("Jigar",22);
        System.out.println(obj);
    }
}
