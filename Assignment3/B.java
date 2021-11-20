package Assignment3;

public class B extends Student{
    int sub1;
    int sub2;
    int sub3;
    int sub4;

    B(int a,int b, int c,int d){
        sub1 = a;
        sub2 = b;
        sub3 = c;
        sub4 = d;
    }



    @Override
    void getPercentage() {
        System.out.println("Percentage:"+((sub1+sub2+sub3+sub4)*100)/400);
    }


    public static void main(String[] args) {
        B obj = new B(99,100,100,90);
        obj.getPercentage();
    }
}
