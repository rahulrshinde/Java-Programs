package Class_constructor_method;

public class PassingValue{
    void add(int a, int b){ // call by value
        System.out.println(a+b);
    }

    void show(Display d){ // call by referance of Display Class
        d.show();
        System.out.println(d instanceof Display);
    }

    public static void main(String args[]){
        PassingValue p = new PassingValue();

        Display d = new Display();

        p.add(89,52); // passing values
        p.show(d); // passing object of Display Class
    }
}

    // new class Named Display

    class Display{
        void show(){
            System.out.println("call By Ref. of Display Class.");
        }
    

}
