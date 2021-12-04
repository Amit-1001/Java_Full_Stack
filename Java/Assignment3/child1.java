package Assignment3;

public class child1 extends Parent{
    public static void main(String[] args) {
        child1 obj =new child1();
        obj.message();
    }

    @Override
    public void message() {
        System.out.println("This is child 1");
    } // overriding message method of abstract parent class
}
