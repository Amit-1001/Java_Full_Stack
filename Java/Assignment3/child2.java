package Assignment3;

public class child2 extends Parent{

    @Override
    public void message() {
        System.out.println("This is child 2");  // overriding message function of abstract class


    }

    public static void main(String[] args) {
        child2 obj = new child2();
        obj.message();
    }
}
