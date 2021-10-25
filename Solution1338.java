import java.util.*;
import java.util.Arrays;

public class Solution1338 {
    public int minSetSize(int[] arr) {
        int ans = 0, sum = 0;
        int l = arr.length;

        Arrays.sort(arr);
        List<int[]> d = new ArrayList<>();

        for(int i = 0; i < l; i ++)
        {
            int j =i;

            while (j < l && arr[i] == arr[j])
            {
                j += 1;
            }

            d.add(new int[]{arr[i], j-i});

            i = j-1;

        }

        d.sort((i,j) -> -1*Integer.compare(i[1], j[1]));

        for(int[] x:d)
        {
            sum += x[1];
            ans += 1;

            if (sum >= l/2)
            {
                return ans;
            }

        }

        return 0;
        }


        public static void main(String args[])
        {

            Solution1338 ss = new Solution1338();
            int[] arr1 = {3,3,3,3,5,5,5,2,2,7};

            //Output: 2
            System.out.println(ss.minSetSize(arr1));

            int[] arr2 = {7,7,7,7,7,7};
            System.out.println(ss.minSetSize(arr2));
            //Output: 1

            int[] arr3 = {1,9};
            System.out.println(ss.minSetSize(arr3));
            //Output: 1

            int[] arr4 = {1000,1000,3,7};
            System.out.println(ss.minSetSize(arr4));
            //Output: 1

            int[] arr5 = {1,2,3,4,5,6,7,8,9,10};
            System.out.println(ss.minSetSize(arr5));
            //Output: 5

        }
}




