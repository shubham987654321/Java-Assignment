package DP;

import java.util.Scanner;

/*
40 20 60
Smoke = a*b
color = (a+b)%100
minimum Smoke will form
 */

public class MixtureProblem {

    public static int getMinimumSmoke(int color[], int smoke ,int updatedColor, int i){

        if(i==color.length-1){
            return (int)Double.POSITIVE_INFINITY;
        }

        int s = getMinimumSmoke(color,smoke,updatedColor,i+1);
        int e =0;
        if(i+1<color.length){
            e = getMinimumSmoke(color,smoke+(color[i]*color[i+1]) , (color[i]+color[i+1])%100, i+1) + smoke + (color[i]*color[i+1])  ;

        }
        return  Math.min(s,e);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int []color  = new int[n];
        for(int i=0;i<n;i++){
            color[i] = sc.nextInt();
        }
        System.out.println(getMinimumSmoke(color,0,0,0));


    }
}
