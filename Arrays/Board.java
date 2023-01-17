package Arrays;

public class Board{
    public static void main(String args[]){

    char board [][] = new char [3][3];
    for(int i=0; i<board.length; i++){
        for(int j=0; j<board[i].length; j++){
        board[i][j] = '0';
        System.out.print(board[i][j]);
        if(j<board[i].length-1){
            System.out.print(" | ");
        }
        }
    System.out.println();
    if(i<board[i].length-1){
        System.out.print("__________");
    }
    System.out.println();
    }
    }
}

