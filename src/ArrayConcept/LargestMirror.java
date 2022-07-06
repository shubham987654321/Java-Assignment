package ArrayConcept;

public class LargestMirror {
    /**
     * maxMirror method returns the maximum mirror section length
     * @param  arr
     * @return integer length of maximum mirror length
     */

    public static int maxMirror(int[] arr) {
        int maxSimilars = 0;   // Max length of mirror
        int similars = 0;      // Count for mirror length
        int j;

        for (int i = 0; i < arr.length; i++ ) {

            similars = 0;

            // starting from last index (Similar in reverse order is mirror)
            j = arr.length - 1;

            // Iterate from last index and match elements from both ends
            while ( j >= 0 && i + similars < arr.length ) {

                // If mirror element found in the last
                if ( arr[i+similars] == arr[j]) {

                    similars++;
                    j--;

                } else {

                    if ( similars > 0 ) {

                        // update max length of mirror if length of new mirror > max mirror length
                        maxSimilars = Math.max(similars, maxSimilars);
                        similars = 0;

                    }
                    j--;
                }


            }


            if ( similars > maxSimilars ) maxSimilars = similars;
        }

        return maxSimilars;

    }

    public  static  void main(String[] args){
        int[] a = {1,1,2,1,1};
        int res = maxMirror(a);
        System.out.println(res);

  }

}
