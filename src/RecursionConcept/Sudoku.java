package RecursionConcept;


import java.util.Scanner;

public class Sudoku {
    public static void display(int[][] board){
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[0].length; j++){
          if((j+1)%3==0) {
              System.out.print(board[i][j] + "| ");
          }else{
                System.out.print(board[i][j] + " " );
          }

      }

      System.out.println();
       if((i+1)%3==0){
          System.out.print("------ ----- ------\n");
      }
    }
  }

   private static boolean isPossible(int[][] board, int row, int col, int num){

       // check in row
       for(int j=0;j<9;j++){
           if(board[row][j]==num){
               return false;
           }
       }

       // check in col
       for(int i=0;i<9;i++){
           if(board[i][col]==num){
               return false;
           }
       }

       // check in subMatrix
       int updaterow= (row/3)*3;
       int updatecol = (col/3)*3;

       for(int i=updaterow;i<updaterow+3;i++){
           for(int j=updatecol;j<updatecol+3;j++){
               if(board[i][j]==num){
                   return false;
               }
           }
       }


       return true;
   }

  public static void solveSudoku(int[][] board, int i, int j) {

     if(i==8 && j==9){
         display(board);
         return;
     }
     if(j>8){
       j=0;
       i++;
     }

    if(board[i][j] ==0){
        for(int num=1;num<=9;num++){
            if(isPossible(board,i,j,num)){
                board[i][j]=num;
                solveSudoku(board,i,j);
                board[i][j]=0;
            }
        }
    }else{
        solveSudoku(board,i,j+1);
    }
  }



  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int[][] arr = new int[9][9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    solveSudoku(arr, 0, 0);
  }

}
