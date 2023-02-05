package RecursionConcept;

import java.io.*;
import java.util.*;

/*
 ram shaym mohan
 set of words  2^n = 2^3 =8 -1=7
 {1,2,3}
 total Subset of set of number will be same as set of String
 {1},{2},{3}, {1,2},{1,3},{2,3},{1,2,3}
  {1,2,3}
                    {}
       {}                                    {1}
  {}        {2}                   {1}                   {1,2}
  {} {3} {2} {2,3}             {1} {1,3}              {1,2} {1,2,3}

 */

public class Max_Score {

    public static void  totalSubset(String[] str,String curr_subset, int i){

        if(i>=str.length){
            System.out.println(curr_subset);
            return;
        }

        totalSubset(str,curr_subset+str[i],i+1);
        totalSubset(str,curr_subset,i+1);



    }

	public static int solution(String[] words, int[] farr, int[] score, int idx) {
		//write your code here
        // find the all  set of words


		return 0;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int nofWords = scn.nextInt();
		String[] words = new String[nofWords];
		for(int i = 0 ; i < words.length; i++) {
			words[i] = scn.next();
		}
		int nofLetters = scn.nextInt();
		char[] letters = new char[nofLetters];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = scn.next().charAt(0);
		}
		int[] score = new int[26];
		for (int i = 0; i < score.length; i++) {
			score[i] = scn.nextInt();
		}
		if (words == null || words.length == 0 || letters == null || letters.length == 0 || score == null
				|| score.length == 0) {
			System.out.println(0);
			return;
		}
		int[] farr = new int[score.length];
		for (char ch : letters) {
			farr[ch - 'a']++;
		}
		System.out.println(solution(words, farr, score, 0));
        /*
      //   System.out.println((int)('b')-97);
        Scanner scn = new Scanner(System.in);
		int nofWords = scn.nextInt();
		String[] words = new String[nofWords];
		for(int i = 0 ; i < words.length; i++) {
			words[i] = scn.next();
		}
        totalSubset(words,"",0);

         */

	}



}
