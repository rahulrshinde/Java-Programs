package Class_constructor_method;

public class Rectangle {
    int l,b; //instansce variable
    
    void area(){ // zero method
    int area = l*b;    
    System.out.println("Area :" +area);
    }

    void perimeter(int a, int b){ // parameter method
    int peri = 2*(a+b);    
    System.out.println("Perimenter :" +peri);
    }


    public static void main(String args[]){
    Rectangle r; // r is a ref variable
    r = new Rectangle(); // is a default constructor

    r.l = 10;
    r.b = 5;
    r.area(); // calling zero method
    r.perimeter(r.l, r.b); // calling parameter method
    }
}
