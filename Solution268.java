import java.util.Arrays;

public class Solution268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i ;
        for (i = 0; i<nums.length; i++)
        {
            if (nums[i] != i)
            {
                break;
            }

        }
        return i;
    }

    public static void main(String args[])
    {
        Solution268 x = new Solution268();

        int input1[] = {3,0,1};
        //Output: 2
        System.out.println(x.missingNumber(input1));
        int input2[] = {9,6,4,2,3,5,7,0,1};
        //Output: 8
        System.out.println(x.missingNumber(input2));

    }

}
