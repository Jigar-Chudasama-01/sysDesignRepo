package OOPproperties;

public class boxWeight extends box{
    int weight;
    boxWeight(){
        super();
        this.weight = -1;
    }

    public boxWeight(int len, int width, int height, int w) {
        super(len, width, height);
        this.weight = w;
    }
    private static void display(){
        System.out.println("Box weight class !");
    }
}
