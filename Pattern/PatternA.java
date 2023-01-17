package Pattern;

public class PatternA {
    public static void main(String[] args){
        
        for(int row=1; row<=5;row++){
            for(int col=1; col<=9; col++){
                if(row+col==6 || col-row==4){
                    System.out.print("*");
                }   
                else if(row==3 && (col>2 && col<8)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
}
}
