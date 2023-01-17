package Class_constructor_method;

public class ConstructorDemo {
    int a,b;
    ConstructorDemo(){
    a = 55;
    b = 85;
    }

    void display(){
    System.out.println("Instance Variable A: "+a);
    System.out.println("Instance Variable B: "+b);
    }

    ConstructorDemo(int x, int y){
    a=x;
    b=y;
    }

    public static void main(String args[]){
    ConstructorDemo c1 = new ConstructorDemo();
    c1.display();
    ConstructorDemo c2 = new ConstructorDemo(102,856);
    c2.display();
    }
}
