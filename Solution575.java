//import java.util.HashSet;
import java.util.*;

public class Solution575 {
    public int distributeCandies(int[] candies) {

        Set<Integer> dif = new HashSet<Integer>();

        for(int i : candies)
        {
            dif.add(i);

        }

        int ans = Math.min( candies.length/2, dif.size());


        return ans;

    }

    public static void main(String[] args)
    {
        Solution575 x = new Solution575();

        int[] candies1 = {1,1,2,2,3,3};
        //Output: 3
        System.out.println(x.distributeCandies(candies1));

        int[] candies2 = {1,1,2,3};
        //Output: 2
        System.out.println(x.distributeCandies(candies2));

        int[] candies3 = {1,1};
        //Output: 1
        System.out.println(x.distributeCandies(candies3));

        int[] candies4 = {1,11};
        //Output: 1
        System.out.println(x.distributeCandies(candies4));

        int[] candies5 = {2,2};
        //Output: 1
        System.out.println(x.distributeCandies(candies5));

    }

}

