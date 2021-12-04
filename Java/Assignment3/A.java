package Assignment3;

public class A extends Student{
    int sub1;
    int sub2;
    int sub3;

    A(int a,int b, int c){
        sub1 = a;
        sub2 = b;
        sub3 = c;
    }



    @Override
    void getPercentage() {
        System.out.println("Percentage:"+((sub1+sub2+sub3)*100)/300);
    } // this is function which is present in abstract class 'Student'


    public static void main(String[] args) {
        A obj = new A(89,59,89);
        obj.getPercentage(); // accessing abstract function of abstract class 'Student'
    }
}
