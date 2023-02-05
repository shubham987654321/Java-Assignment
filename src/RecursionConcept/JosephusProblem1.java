package RecursionConcept;

import java.util.Scanner;

public class JosephusProblem1 {
    public static void main(String[] args) {
        int n;
        int k;
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        System.out.println("Last survived person : "+ killKthPerson(n,k));
    }
    /*
      n = 7
      k =3
      0 1 2 3 4 5 6
      first = 2 killed


     */
    public static  int killKthPerson(int n, int k){
        if(n==1){
            return  0;
        }
       return (killKthPerson(n-1,k)+k)%n;
    }
}
