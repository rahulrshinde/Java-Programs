package Class_constructor_method;

import java.util.Scanner;
public class Chair {
    
    //States
    int leg,hands,wheel;
    String color;

    //Behaviour
    public void display(){
    System.out.println("Color of chair: " + color);
    System.out.println("Hands of chair: " + hands);
    System.out.println("leg of chair: " + leg);
    System.out.println("Wheel of chair: " + wheel);
    }

    //Behaviour
    public void rotate(){
    System.out.println("Enter Degree for Roatation : ");
    Scanner sc = new Scanner(System.in);
    float angle = sc.nextFloat(); //local Variable
    System.out.println("Roatation of Chair: " + angle + " degree");
    }

    public static void main(String args[]){
    Chair normal = new Chair();
    normal.color = "Black";
    normal.leg = 5;
    normal.hands = 2;
    normal.wheel = 0;
    normal.rotate();
    normal.display();

    Chair official = new Chair();
    official.color = "Brown";
    official.leg = 4;
    official.hands = 2;
    official.wheel = 4;
    official.rotate();
    official.display();
    }
}
