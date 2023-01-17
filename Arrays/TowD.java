package Arrays;
public class TowD {
    public static void main(String[] args){

    //Initialising  matrix
    int matA[][]= {{1,2,3},{8,6,9},{8,1,0}};
    for(int row=0; row<matA.length; row++){
        for(int col=0; col<matA[row].length; col++){
            System.out.print(matA[row][col]+" ");
        }
        System.out.println();
    }
}
}
