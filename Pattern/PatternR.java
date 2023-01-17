package Pattern;

public class PatternR {
    public static void main(String[] args){
        
        for(int row=1; row<=6;row++){
            for(int col=1; col<=5; col++){
                if (col<4 && (row==1 || row==3) || (row==2 && col==5)){
                    System.out.print("* ");
                }
                else if(col==1 ){
                    System.out.print("* ");
                }   
                else if(row-col==1){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
}
}
