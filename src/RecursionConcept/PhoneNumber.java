package RecursionConcept;
import  java.util.*;

public class PhoneNumber {


    public static void main(String args[])
    {
        /*
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases


        while(t-- > 0)
        {
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; //input the elements of array that are keys to be pressed

            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();//input the elements of array that are keys to be pressed
            ArrayList <String> res = new Solution().possibleWords(arr, n);
            for (String i : res) System.out.print (i + " ");
             System.out.println();

        }

         */
        Solution.genrateWords("abc","def","",0,0);

    }



}


/*

Input: N = 3, a[] = {2, 3, 4}
Output:
adg adh adi aeg aeh aei afg afh afi
bdg bdh bdi beg beh bei bfg bfh bfi
cdg cdh cdi ceg ceh cei cfg cfh cfi

 */
class Solution
{

    // store all the Char and number  of phone
    private static HashMap<Integer,String> stringOnNumber  = new HashMap<Integer,String>() ;
    public  Solution(){
        stringOnNumber.put(1,"");
    stringOnNumber.put(2,"ABC");
    stringOnNumber.put(3,"DEF");
    stringOnNumber.put(4,"GHI");
    stringOnNumber.put(5,"JKL");
    stringOnNumber.put(6,"MNO");
    stringOnNumber.put(7,"PQRS");
    stringOnNumber.put(8,"TUV");
    stringOnNumber.put(9,"WXYZ");
    }




    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here
        ArrayList<String> list_of_string_of_number= new ArrayList<>();
        for(int i=0;i<N;i++){
            list_of_string_of_number.add(stringOnNumber.get(a[i]));
        }


        return new ArrayList<>();
    }

    /*
     i/p : abc  def
     o/p : ad ae af
            bd be bf
            cd ce cf
     a

     */
    public   static  void genrateWords(String s1,String s2,String curr,int i, int j){
        if(i>s1.length()){
            return;
        }
//        if(j>s2.length()){
//            return;
//        }
        if(curr.length()>=2){
            System.out.println("--->"+curr);

            return;
        }

        for(int p=0;p<s1.length();p++){
            genrateWords(s1,s2,curr+s1.charAt(p)+s2.charAt(j),p,j);
           genrateWords(s1,s2,curr+s1.charAt(p)+s2.charAt(j+1),p,j+1);
        }


    }





}

