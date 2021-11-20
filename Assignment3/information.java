package Assignment3;

import java.util.Scanner;

public class information implements Cloneable{
    static Scanner in = new Scanner(System.in);
    String name;
    int age;
    public void getName(){

        System.out.println("Enter name :");
        name = in.nextLine();
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
    // TODO Auto-generated method stub
        return super.clone();
    }

    public void getAge(){

      System.out.println("Enter age:");
      age = in.nextInt();
  }

  public int display(){
      System.out.println("Name:"+name+"\nAge:"+age);

      return 0;
  }



}
