package String;

import java.util.Scanner;


/*  String Builder (mutable)

  setCharAt is not persent in Sting but it is persent in
  String builder
 */
public class stringBasic {

    public static  void main(String[] args){

/*
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.setCharAt(0 , 'D');  //  update
        System.out.println(sb);
        sb.insert(0,'Y');      // insert
        System.out.println(sb);
        sb.deleteCharAt(0);           // delete
        System.out.println(sb);
        sb.append('u');
        System.out.println(sb);          // insert in last
         System.out.println(sb.length());
*/




        String str="";
        long n=1000000000;
        long start =System.currentTimeMillis();

//        for(int i=0;i<n;i++){
//            str +=i;
//        }
//        long end =System.currentTimeMillis();
//        System.out.println(end-start);


        StringBuilder str1 = new StringBuilder();
        for(int i=0;i<n;i++){
            str1.append(i);
        }
        long end =System.currentTimeMillis();
        System.out.println(end-start);



    }
}
