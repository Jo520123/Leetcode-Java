public class Solution322 {
    public int coinChange(int[] coins, int amount){
        if(amount < 1)
        {
            return 0;
        }

        int[] BP = new int[amount+1];

        int total1 = 0;

        while(++total1 <= amount)
        {
            int nf = -1;

            for(int c :coins)
            {
                if(total1 >= c && BP[total1-c] != -1)
                {
                    int x = BP[total1-c]+1;
                    nf = nf <0 ? x : (x < nf ? x:nf);

                }

            }

            BP[total1] = nf;
        }

        return BP[amount];

    }

    public static void main(String[] args)
    {
        Solution322 xx = new Solution322();

        int[] coins = {1,2,5};
        int amount = 11;

        System.out.println(xx.coinChange(coins,amount));

        int[] coins2 = {2};
        int amount2  = 3;

        System.out.println(xx.coinChange(coins2,amount2));

    }

}


