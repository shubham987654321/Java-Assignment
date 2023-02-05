package RecursionConcept;

import java.util.*;


/*

6
6
0 1 4 2 8 2
4 3 6 5 0 4
1 2 4 1 4 6
2 0 7 3 2 2
3 1 5 9 2 4
2 7 0 8 5 1

 */



public class GoldMine {

	public  static  int  travelAndCollectGold(int [][]arr, int row, int col, boolean[][] visitedArray){
		if(row<0 || col<0 || col>= arr.length || row>=arr.length || visitedArray[row][col]==true || arr[row][col]==0 ){
			return 0;
		}

		visitedArray[row][col]=true;
		int g1  =  travelAndCollectGold(arr,row-1,col,visitedArray);
		int g2 = travelAndCollectGold(arr,row+1,col,visitedArray);
		int g3 = travelAndCollectGold(arr,row,col-1,visitedArray);
		int g4 = travelAndCollectGold(arr,row,col+1,visitedArray);
		return arr[row][col]+g1+g2+g3+g4;

	}



	static int max = 0;
	public static void getMaxGold(int[][] arr) {

		boolean[][]  visitedArray  = new boolean[arr.length][arr[0].length];
		//write your code here
		int sum =0;
		for(int i=0;i<arr.length;i++){

			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j] ==0 || visitedArray[i][j] == true){
					continue;
				}

				sum =travelAndCollectGold(arr,i,j,visitedArray);
				System.out.println("Gold at row " + i + " Col "+j + " is " +sum );
				if(sum>max){
					max = sum;
				}
			}


		}

		System.out.println("Max God  is "+max);


	}



	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[m][n];
		for(int i = 0; i < arr.length; i++){
			for(int j = 0 ; j  < arr[0].length; j++){
				arr[i][j] = scn.nextInt();
			}
		}

		getMaxGold(arr);




		System.out.println(max);
	}


}
